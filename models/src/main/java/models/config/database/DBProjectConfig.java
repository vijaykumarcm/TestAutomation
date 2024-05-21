package models.config.database;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DBProjectConfig {
    @JsonProperty
    public List<Object> nameList;
    @JsonProperty
    public List<Object> valueList;
}
