package models.config.yaml;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import models.core.TestRun;

public class BrowsersConfig extends TestRun{
    @JsonProperty
    private Integer searchTimeout;
    @JsonProperty
    private String browserStackKey;
   // @JsonProperty
    //private boolean useProxy;
    @JsonProperty
    private String name;
    @JsonProperty
    private String path;
    //@JsonProperty
    //private String driverPath;
    @JsonProperty
    private BrowserStackConfig browserStack;
    @JsonProperty()
    private List<BrowserConfig> browsers;

    /**
     * Creates an instance of a BrowserConfig.
     */
    public BrowsersConfig() {
        this.searchTimeout = 0;
        this.browserStackKey = "y6AsfVkYp4EsWCo4eszC";
       // this.useProxy = false;
    }

   // public String getDriverPath() {
   //     return driverPath;
   // }

    //public void setDriverPath(String driverPath) {
    //    this.driverPath = driverPath;
    //}

    public String getBrowserStackKey() {
        return browserStackKey;
    }

    public void setBrowserStackKey(String browserStackKey) {
        this.browserStackKey = browserStackKey;
    }

	/*
	 * public boolean useProxy() { return useProxy; }
	 */

	/*
	 * public void setUseProxy(boolean useProxy) { this.useProxy = useProxy; }
	 */

    public List<BrowserConfig> getBrowsers() {
        return browsers;
    }

    public void setBrowsers(List<BrowserConfig> browsers) {
        this.browsers = browsers;
    }

    public Integer getSearchTimeout() {
        return searchTimeout;
    }

    public void setSearchTimeout(Integer waitTime) {
        this.searchTimeout = waitTime;
    }

    @Deprecated
    public String getName() {
        return name;
    }

    @Deprecated
    public void setName(String name) {
        this.name = name;
    }

    @Deprecated
    public String getPath() {
        return path;
    }

    @Deprecated
    public void setPath(String path) {
        this.path = path;
    }

    @Deprecated
    public BrowserStackConfig getBrowserStack() {
        return browserStack;
    }

    @Deprecated
    public void setBrowserStack(BrowserStackConfig browserStackConfig) {
        this.browserStack = browserStackConfig;
    }
}
