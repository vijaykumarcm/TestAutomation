package models.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Test {
    @JsonProperty()
    public String UUID;
    @JsonProperty()
    public String ParentUUID;
    @JsonProperty()
    public Integer Iteration;
    @JsonProperty()
    public String IterationName;
    @JsonProperty()
    public List<Stepable> Steps;
    @JsonIgnore()
    public Map<String, Parameter<?>> Globals;

    /**
     * Constructs a new test object that represents a Test.
     */
    public Test() {
        this.Steps = new ArrayList<>();
        this.Globals = new HashMap<>();
    }
}
