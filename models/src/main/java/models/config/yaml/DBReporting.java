package models.config.yaml;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DBReporting {

	   @JsonProperty
	    private Boolean active;
	    @JsonProperty
	    private String appName;
	    @JsonProperty
	    private String solutionName;
	    @JsonProperty
	    private String projectIncidentName;
	    @JsonProperty
	    private String testType;

	    public Boolean getActive() {
	        return active;
	    }

	    public void setActive(Boolean active) {
	        this.active = active;
	    }

	    public String getAppName() {
	        return appName;
	    }

	    public void setAppName(String appName) {
	        this.appName = appName;
	    }

	    public String getSolutionName() {
	        return solutionName;
	    }

	    public void setSolutionName(String solutionName) {
	        this.solutionName = solutionName;
	    }

	    public String getProjectIncidentName() {
	        return projectIncidentName;
	    }

	    public void setProjectIncidentName(String projectIncidentName) {
	        this.projectIncidentName = projectIncidentName;
	    }

	    public String getTestType() {
	        return testType;
	    }

	    public void setTestType(String testType) {
	        this.testType = testType;
	    }
}
