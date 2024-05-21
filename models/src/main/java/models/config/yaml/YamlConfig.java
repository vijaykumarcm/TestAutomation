package models.config.yaml;

import java.util.LinkedHashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class YamlConfig {

    @JsonProperty
    private List<Module> modules;
    @JsonProperty
    @Deprecated
    private EnvironmentConfig env;
    @JsonProperty
    private LoggingConfig logging;
    @JsonProperty
    private BrowsersConfig browser;
    @JsonProperty
    private LinkedHashMap<String, Object> project;
    @JsonProperty
    private EmailConfig email;
    @JsonProperty
    private ParallelConfig parallel;
    @JsonProperty
    private List<String> dataList;
    @JsonProperty
    private DBReporting dbReporting;

    public YamlConfig() {
        this.parallel = new ParallelConfig();
        this.project = new LinkedHashMap<>();
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public EnvironmentConfig getEnv() {
        return env;
    }

    public void setEnv(EnvironmentConfig env) {
        this.env = env;
    }

    public LoggingConfig getLogging() {
        return logging;
    }

    public void setLogging(LoggingConfig logging) {
        this.logging = logging;
    }

    public BrowsersConfig getBrowser() {
        return browser;
    }

    public void setBrowser(BrowsersConfig browser) {
        this.browser = browser;
    }

    public LinkedHashMap<String, Object> getProject() {
        return project;
    }

    public void setProject(LinkedHashMap<String, Object> project) {
        this.project = project;
    }

    public EmailConfig getEmail() {
        return email;
    }

    public void setEmail(EmailConfig email) {
        this.email = email;
    }

    public ParallelConfig getParallel() {
        return parallel;
    }

    public void setParallel(ParallelConfig parallel) {
        this.parallel = parallel;
    }

    public List<String> getDataList() {
        return dataList;
    }

    public void setDataList(List<String> dataList) {
        this.dataList = dataList;
    }
}
