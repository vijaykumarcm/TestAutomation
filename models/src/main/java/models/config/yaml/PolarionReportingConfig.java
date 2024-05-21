package models.config.yaml;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PolarionReportingConfig {

    @JsonProperty
    private Boolean active;
    @JsonProperty
    private String polarionJarPath;
    @JsonProperty
    private String username;
    @JsonProperty
    private String password;
    @JsonProperty
    private String projectId;
    @JsonProperty
    private String testRunId;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getPolarionJarPath() {
        return polarionJarPath;
    }

    public void setPolarionJarPath(String polarionJarPath) {
        this.polarionJarPath = polarionJarPath;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getTestRunId() {
        return testRunId;
    }

    public void setTestRunId(String testRunId) {
        this.testRunId = testRunId;
    }
}
