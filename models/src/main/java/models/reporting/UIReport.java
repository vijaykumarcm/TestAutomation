package models.reporting;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UIReport {
    @JsonProperty
    public ResultStatus Status;
    @JsonProperty
    public String Name;
    @JsonProperty
    public UIReportType Type;
    @JsonProperty
    public String UUID;
    @JsonProperty
    public String ParentUUID;
}
