package models.config;

import java.util.HashMap;
import java.util.Map;

import models.core.Parameter;

public class GenericConfiguration implements Config {

	private Map<String, Parameter<String>> Configs;

	public GenericConfiguration() {
		this.Configs = new HashMap<>();
	}

	@Override
	public Map<String, Parameter<String>> getValues() {
		return this.Configs;
	}

	@Override
	public String get(String name) {
		return this.Configs.get(name) == null ? "" : this.Configs.get(name).Value;
	}

	@Override
	public void set(String name, String value) {
		this.Configs.put(name, new Parameter<>(name, value));
	}

	@Override
	public void set(String name, Parameter value) {
		this.Configs.put(name, value);
	}
}
