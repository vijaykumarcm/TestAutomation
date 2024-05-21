package models.config.yaml;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ParallelConfig {
    @JsonProperty
    private Integer count;

    public ParallelConfig() {
        this.count = 0;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
