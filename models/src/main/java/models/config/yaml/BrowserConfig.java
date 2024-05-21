package models.config.yaml;

import com.fasterxml.jackson.annotation.JsonProperty;

import models.core.TestRun;

public class BrowserConfig extends TestRun{
    @JsonProperty
    private String name;
    @JsonProperty
    private BrowserStackConfig browserStack;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BrowserStackConfig getBrowserStack() {
        return browserStack;
    }

    public void setBrowserStack(BrowserStackConfig browserStackConfig) {
        this.browserStack = browserStackConfig;
    }
}
