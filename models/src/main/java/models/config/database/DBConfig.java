package models.config.database;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import models.config.yaml.EmailConfig;
import models.config.yaml.EnvironmentConfig;
import models.config.yaml.ParallelConfig;

public class DBConfig {
    @JsonProperty
    public DBConfig logging;
    @JsonProperty
    public boolean hasEnv;
    @JsonProperty
    public EnvironmentConfig env;
    @JsonProperty
    public boolean hasBrowser;
    @JsonProperty
    public Integer searchTimeout;
    @JsonProperty
    public String browserStackKey;
    @JsonProperty
    public List<DBBrowserConfig> browsers;
    @JsonProperty
    public boolean hasEmail;
    @JsonProperty
    public EmailConfig email;
    @JsonProperty
    public DBConfig project;
    @JsonProperty
    public boolean hasParallel;
    @JsonProperty
    public ParallelConfig parallel;
    @JsonProperty
    public List<String> dataList;
}
