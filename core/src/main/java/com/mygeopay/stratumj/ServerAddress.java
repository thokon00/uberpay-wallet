package com.mygeopay.stratumj;

/**
 * @author Thomas König
 * @author John L. Jegutanis
 */
final public class ServerAddress {
    final private String host;
    final private int port;
    final private boolean ssl;

    public ServerAddress(String host, int port) {
        this.host = host;
        this.port = port;
        this.ssl = false;
    }

    public ServerAddress(String host, int port, boolean ssl) {
        this.host = host;
        this.port = port;
        this.ssl = ssl;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }
    
    public boolean isSsl() {
		return ssl;
	}

    @Override
    public String toString() {
        return "ServerAddress{" +
                "host='" + host + '\'' +
                ", port=" + port +
                ", ssl=" + ssl +
                '}';
    }
}
