package models.reading.action;

import java.util.Map;

public class YamlActions {
    private String version;
    private int count;
    Map<String, YamlAction> actions;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Map<String, YamlAction> getActions() {
        return actions;
    }

    public void setActions(Map<String, YamlAction> actions) {
        this.actions = actions;
    }
}
