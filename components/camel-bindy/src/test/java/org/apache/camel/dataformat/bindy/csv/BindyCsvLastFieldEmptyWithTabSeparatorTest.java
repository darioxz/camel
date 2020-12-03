/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.dataformat.bindy.csv;

import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.test.spring.junit5.CamelSpringTest;
import org.junit.jupiter.api.Test;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration
@CamelSpringTest
public class BindyCsvLastFieldEmptyWithTabSeparatorTest {

    private static final String URI_MOCK_RESULT = "mock:result";
    private static final String URI_DIRECT_START = "direct:start";

    private static String input1 = "VOA,12 abc street,Melbourne,VIC,3000,Australia,,";

    @Produce(URI_DIRECT_START)
    private ProducerTemplate template;

    @EndpointInject(URI_MOCK_RESULT)
    private MockEndpoint result;

    @Test
    @DirtiesContext
    public void testUnMarshalAndMarshal() throws Exception {
        template.sendBody(input1);
        result.expectedMessageCount(1);
        result.assertIsSatisfied();
    }

    public static class ContextConfig extends RouteBuilder {
        BindyCsvDataFormat camelDataFormat = new BindyCsvDataFormat(CsvSkipField.class);

        @Override
        public void configure() {
            from(URI_DIRECT_START).unmarshal(camelDataFormat)
                    .process(new Processor() {
                        @Override
                        public void process(Exchange exchange) throws Exception {
                            CsvSkipField csvSkipField = (CsvSkipField) exchange.getIn().getBody();
                            assert csvSkipField.getAttention().equals("VOA");
                            assert csvSkipField.getAddressLine1().equals("12 abc street");
                            assert csvSkipField.getCity().equals("Melbourne");
                            assert csvSkipField.getState().equals("VIC");
                            assert csvSkipField.getZip().equals("3000");
                            assert csvSkipField.getCountry().equals("Australia");
                            assert csvSkipField.getDummy1().equals("");
                            assert csvSkipField.getDummy2().equals("");
                        }
                    })

                    .marshal(camelDataFormat)
                    .convertBodyTo(String.class)
                    .to(URI_MOCK_RESULT);
        }

    }

    @CsvRecord(separator = ",")
    public static class CsvSkipField {
        @DataField(pos = 1)
        private String attention;

        @DataField(pos = 2)
        private String addressLine1;

        @DataField(pos = 3)
        private String city;

        @DataField(pos = 4)
        private String state;

        @DataField(pos = 5)
        private String zip;

        @DataField(pos = 6)
        private String country;

        @DataField(pos = 7)
        private String dummy1;

        @DataField(pos = 8)
        private String dummy2;

        public String getAttention() {
            return attention;
        }

        public void setAttention(String attention) {
            this.attention = attention;
        }

        public String getAddressLine1() {
            return addressLine1;
        }

        public void setAddressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getZip() {
            return zip;
        }

        public void setZip(String zip) {
            this.zip = zip;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getDummy1() {
            return dummy1;
        }

        public void setDummy1(String dummy1) {
            this.dummy1 = dummy1;
        }

        public String getDummy2() {
            return dummy2;
        }

        public void setDummy2(String dummy2) {
            this.dummy2 = dummy2;
        }

        @Override
        public String toString() {
            return "Record [attention=" + getAttention() + ", addressLine1=" + getAddressLine1() + ", " + "city=" + getCity()
                   + ", state=" + getState() + ", zip=" + getZip() + ", country="
                   + getCountry() + ", dummy1=" + getDummy1() + ", dummy2=" + getDummy2() + "]";
        }
    }
}
