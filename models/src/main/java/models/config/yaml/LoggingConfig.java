package models.config.yaml;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoggingConfig {
    @JsonProperty
    private String path;
    @JsonProperty(defaultValue = "")
    private String type;
    @JsonProperty
    private Integer level;
    @JsonProperty()
    private Boolean single;
    @JsonProperty()
    private Boolean splitOnIteration;
    @JsonProperty
    private DBReporting dbReporting;
    @JsonProperty
    private PolarionReportingConfig polarionReporting;

    public LoggingConfig() {
        this.type = "";
        this.single = false;
        this.splitOnIteration = false;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Boolean getSingle() {
        return single;
    }

    public void setSingle(Boolean single) {
        this.single = single;
    }

    public Boolean getSplitOnIteration() {
        return splitOnIteration;
    }

    public void setSplitOnIteration(Boolean splitOnIteration) {
        this.splitOnIteration = splitOnIteration;
    }

    public DBReporting getDbReporting() {
        return dbReporting;
    }

    public void setDbReporting(DBReporting dbReporting) {
        this.dbReporting = dbReporting;
    }

    public PolarionReportingConfig getPolarionReporting() {
        return polarionReporting;
    }

    public void setPolarionReporting(PolarionReportingConfig polarionReporting) {
        this.polarionReporting = polarionReporting;
    }
}
