package models.config.yaml;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmailConfig {
    @JsonProperty
    private String host;
    @JsonProperty
    private String protocol;
    @JsonProperty
    private Integer port;
    @JsonProperty
    private String to;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
