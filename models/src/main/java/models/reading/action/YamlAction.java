package models.reading.action;

import java.util.List;
import java.util.Map;

public class YamlAction {
    private String description;
    private List<String> projects;
    private List<String> controlTypes;
    private Map<String, YamlControl> controls;
    private Map<String, YamlParameter> parameters;
    private boolean hasOutput;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getProjects() {
        return projects;
    }

    public void setProjects(List<String> projects) {
        this.projects = projects;
    }

    public List<String> getControlTypes() {
        return controlTypes;
    }

    public void setControlTypes(List<String> controlTypes) {
        this.controlTypes = controlTypes;
    }

    public Map<String, YamlControl> getControls() {
        return controls;
    }

    public void setControls(Map<String, YamlControl> controls) {
        this.controls = controls;
    }

    public Map<String, YamlParameter> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, YamlParameter> parameters) {
        this.parameters = parameters;
    }

    public boolean isHasOutput() {
        return hasOutput;
    }

    public void setHasOutput(boolean hasOutput) {
        this.hasOutput = hasOutput;
    }
}
