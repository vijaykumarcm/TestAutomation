package models.config.yaml;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EnvironmentConfig {
	   @JsonProperty
	    @Deprecated
	    private String url;

	    @Deprecated
	    public String getUrl() {
	        return url;
	    }

	    @Deprecated
	    public void setUrl(String url) {
	        this.url = url;
	    }
}
