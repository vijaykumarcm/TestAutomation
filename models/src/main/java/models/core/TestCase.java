package models.core;

import java.util.HashMap;
import java.util.Map;
import models.config.Config;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TestCase {
    @JsonProperty()
    public String UUID;
    @JsonProperty()
    public String ParentUUID;
    @JsonProperty()
    public String Name;
    @JsonProperty()
    public String Description;
    @JsonProperty()
    public Map<Integer, Test> TestIterations;
    @JsonProperty()
    public Config Configuration;

    public TestCase() {
        this.TestIterations = new HashMap<>();
    }
}
