/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.etcd;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class EtcdStatsEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        EtcdStatsEndpoint target = (EtcdStatsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "fromindex":
        case "fromIndex": target.getConfiguration().setFromIndex(property(camelContext, long.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "recursive": target.getConfiguration().setRecursive(property(camelContext, boolean.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.Object.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "sendemptyexchangeontimeout":
        case "sendEmptyExchangeOnTimeout": target.getConfiguration().setSendEmptyExchangeOnTimeout(property(camelContext, boolean.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "servicepath":
        case "servicePath": target.getConfiguration().setServicePath(property(camelContext, java.lang.String.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.getConfiguration().setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timetolive":
        case "timeToLive": target.getConfiguration().setTimeToLive(property(camelContext, java.lang.Integer.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "timeout": target.getConfiguration().setTimeout(property(camelContext, java.lang.Long.class, value)); return true;
        case "uris": target.getConfiguration().setUris(property(camelContext, java.lang.String.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "username":
        case "userName": target.getConfiguration().setUserName(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return int.class;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return int.class;
        case "backoffmultiplier":
        case "backoffMultiplier": return int.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "delay": return long.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "fromindex":
        case "fromIndex": return long.class;
        case "greedy": return boolean.class;
        case "initialdelay":
        case "initialDelay": return long.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "password": return java.lang.String.class;
        case "pollstrategy":
        case "pollStrategy": return org.apache.camel.spi.PollingConsumerPollStrategy.class;
        case "recursive": return boolean.class;
        case "repeatcount":
        case "repeatCount": return long.class;
        case "runlogginglevel":
        case "runLoggingLevel": return org.apache.camel.LoggingLevel.class;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return java.util.concurrent.ScheduledExecutorService.class;
        case "scheduler": return java.lang.Object.class;
        case "schedulerproperties":
        case "schedulerProperties": return java.util.Map.class;
        case "sendemptyexchangeontimeout":
        case "sendEmptyExchangeOnTimeout": return boolean.class;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return boolean.class;
        case "servicepath":
        case "servicePath": return java.lang.String.class;
        case "sslcontextparameters":
        case "sslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "startscheduler":
        case "startScheduler": return boolean.class;
        case "synchronous": return boolean.class;
        case "timetolive":
        case "timeToLive": return java.lang.Integer.class;
        case "timeunit":
        case "timeUnit": return java.util.concurrent.TimeUnit.class;
        case "timeout": return java.lang.Long.class;
        case "uris": return java.lang.String.class;
        case "usefixeddelay":
        case "useFixedDelay": return boolean.class;
        case "username":
        case "userName": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        EtcdStatsEndpoint target = (EtcdStatsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return target.getBackoffErrorThreshold();
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return target.getBackoffIdleThreshold();
        case "backoffmultiplier":
        case "backoffMultiplier": return target.getBackoffMultiplier();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "delay": return target.getDelay();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "fromindex":
        case "fromIndex": return target.getConfiguration().getFromIndex();
        case "greedy": return target.isGreedy();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "password": return target.getConfiguration().getPassword();
        case "pollstrategy":
        case "pollStrategy": return target.getPollStrategy();
        case "recursive": return target.getConfiguration().isRecursive();
        case "repeatcount":
        case "repeatCount": return target.getRepeatCount();
        case "runlogginglevel":
        case "runLoggingLevel": return target.getRunLoggingLevel();
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return target.getScheduledExecutorService();
        case "scheduler": return target.getScheduler();
        case "schedulerproperties":
        case "schedulerProperties": return target.getSchedulerProperties();
        case "sendemptyexchangeontimeout":
        case "sendEmptyExchangeOnTimeout": return target.getConfiguration().isSendEmptyExchangeOnTimeout();
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return target.isSendEmptyMessageWhenIdle();
        case "servicepath":
        case "servicePath": return target.getConfiguration().getServicePath();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getConfiguration().getSslContextParameters();
        case "startscheduler":
        case "startScheduler": return target.isStartScheduler();
        case "synchronous": return target.isSynchronous();
        case "timetolive":
        case "timeToLive": return target.getConfiguration().getTimeToLive();
        case "timeunit":
        case "timeUnit": return target.getTimeUnit();
        case "timeout": return target.getConfiguration().getTimeout();
        case "uris": return target.getConfiguration().getUris();
        case "usefixeddelay":
        case "useFixedDelay": return target.isUseFixedDelay();
        case "username":
        case "userName": return target.getConfiguration().getUserName();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "schedulerproperties":
        case "schedulerProperties": return java.lang.Object.class;
        default: return null;
        }
    }
}

