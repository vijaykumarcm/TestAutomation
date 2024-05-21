package models.config.yaml;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Module {
    @JsonProperty
    private String path;
    @JsonProperty
    private boolean active;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
