/*
 */
package io.moquette.broker.server.config;

import io.moquette.broker.BrokerConstants;

/**
 * Base interface for all configuration implementations (filesystem, memory or classpath)
 *
 * @author andrea
 */
public abstract class IConfig {
    public abstract void setProperty(String name, String value);

    public abstract String getProperty(String name);

    public abstract String getProperty(String name, String defaultValue);

    void assignDefaults() {
        setProperty(BrokerConstants.PORT_PROPERTY_NAME, Integer.toString(BrokerConstants.PORT));
        setProperty(BrokerConstants.HOST_PROPERTY_NAME, BrokerConstants.HOST);
        //setProperty(BrokerConstants.WEB_SOCKET_PORT_PROPERTY_NAME, Integer.toString(BrokerConstants.WEBSOCKET_PORT));
        setProperty(BrokerConstants.PASSWORD_FILE_PROPERTY_NAME, "");
        setProperty(BrokerConstants.PERSISTENT_STORE_PROPERTY_NAME, BrokerConstants.DEFAULT_PERSISTENT_PATH);
        setProperty(BrokerConstants.ALLOW_ANONYMOUS_PROPERTY_NAME, Boolean.TRUE.toString());
        setProperty(BrokerConstants.AUTHENTICATOR_CLASS_NAME, "");
        setProperty(BrokerConstants.AUTHORIZATOR_CLASS_NAME, "");
    }
}
