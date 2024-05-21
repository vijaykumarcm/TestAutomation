package models.config.database;

import com.fasterxml.jackson.annotation.JsonProperty;

import models.config.yaml.DBReporting;
import models.config.yaml.PolarionReportingConfig;

public class DBLoggingConfig {
    @JsonProperty
    public String path;
    @JsonProperty
    public int type;
    @JsonProperty
    public boolean single;
    @JsonProperty()
    public Boolean splitOnIteration;
    @JsonProperty
    public DBReporting dbReporting;
    @JsonProperty
    public PolarionReportingConfig polarionReporting;
}
