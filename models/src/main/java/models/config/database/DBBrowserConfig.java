package models.config.database;

import com.fasterxml.jackson.annotation.JsonProperty;

import models.config.yaml.BrowserStackConfig;

public class DBBrowserConfig {
    @JsonProperty
    public int browser;
    @JsonProperty
    public BrowserStackConfig browserStack;
}
