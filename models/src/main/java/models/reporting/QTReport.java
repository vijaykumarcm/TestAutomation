package models.reporting;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QTReport {
	@JsonProperty
    public ResultStatus Status;
    @JsonProperty
    public List<String[]> Table;
}
