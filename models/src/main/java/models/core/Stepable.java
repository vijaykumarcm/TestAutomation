package models.core;

import java.util.List;
import models.reporting.ErrorAction;
import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class Stepable {
	@JsonProperty()
	public String Description;
	@JsonProperty()
	public String ActionName;
	@JsonProperty()
	public String ExpectedResult;
	@JsonProperty()
	public List<Parameter> Parameters;
	@JsonProperty()
	public ErrorAction ErrorAction;
	@JsonProperty()
	public boolean IsComponent;
	@JsonProperty()
	public Integer Delay;
	@JsonProperty()
	public Boolean Cleanup;
	@JsonProperty()
	public Component RecoverySteps;
	@JsonProperty()
	public RecoveryEnum RecoveryType;
	@JsonProperty()
	public Boolean RecoveryExecuted;
	@JsonProperty()
	public String UUID;
	@JsonProperty()
	public String ParentUUID;
}
