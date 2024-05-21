package models.database.testcase;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DBParameter {
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("Type")
    public int type;
    @JsonProperty("Values")
    public List<String> values;
    @JsonProperty("StartIndex")
    public int startIndex;
    @JsonProperty("EndIndex")
    public int endIndex;
    @JsonProperty("IsIterative")
    public List<Boolean> isIterative;
    @JsonProperty("GlobalValue")
    public List<Integer> globalValue;
    @JsonProperty("IsCustom")
    public Boolean isCustom;
    @JsonProperty("Optional")
    public Boolean optional;
}
