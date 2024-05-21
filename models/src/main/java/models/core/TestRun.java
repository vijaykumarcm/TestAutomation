package models.core;

import java.util.ArrayList;
import java.util.List;
import models.config.yaml.YamlConfig;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TestRun {
    @JsonProperty()
    public String UUID;
    @JsonProperty()
    public String Name;
    @JsonProperty()
    public List<TestCase> TestCases;
    @JsonProperty
    public YamlConfig Configuration;

    public TestRun() {
        this.TestCases = new ArrayList<>();
    }
}
