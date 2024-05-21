package models.database.testcase;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DBControl {
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("Value")
    public String value;
    @JsonProperty("Index")
    public int index;
    @JsonProperty("Id")
    public int id;
}
