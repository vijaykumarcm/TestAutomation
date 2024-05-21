package models.database.testcase;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DBStep {
    @JsonProperty("Id")
    public String id;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("UserProvidedDescription")
    public String userProvidedDescription;
    @JsonProperty("Controls")
    public List<DBControl> controls;
    @JsonProperty("Parameters")
    public List<DBParameter> parameters;
    @JsonProperty("HasOutput")
    public boolean hasOutput;
    @JsonProperty("OutputName")
    public String outputName;
    @JsonProperty("ErrorAction")
    public int errorAction;
    @JsonProperty("RecoveryComponentId")
    public int recoveryComponentId;
    @JsonProperty("RecoveryType")
    public int recoveryType;
    @JsonProperty("BackCount")
    public int backCount;
    @JsonProperty("AlwaysRun")
    public boolean alwaysRun;
    @JsonProperty("TakeScreenshot")
    public boolean takeScreenshot;
    @JsonProperty("AreRequirementsMet")
    public boolean areRequirementsMet;
    @JsonProperty("ErrorMessages")
    public List<Object> errorMessages;
    @JsonProperty("IsComponent")
    public boolean isComponent;
    @JsonProperty("Pages")
    public List<DBPage> pages;
    @JsonProperty("Selected")
    public boolean selected;
    @JsonProperty("ExpectedResult")
    public String expectedResult;
}
