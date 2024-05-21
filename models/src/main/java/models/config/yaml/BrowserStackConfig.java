package models.config.yaml;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BrowserStackConfig {
    @JsonProperty
    private boolean active;
    @JsonProperty
    private String url;
    @JsonProperty
    private String version;
    @JsonProperty
    private String os;
    @JsonProperty
    private String osVersion;
    @JsonProperty
    private String device;
    @JsonProperty
    private String project;
    
    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public boolean isActive() {
        return active;
    }      
    
    public void setActive(boolean active) {
        this.active = active;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getproject() { return project; }

    public void setproject(String project) { this.project = project;}
}
