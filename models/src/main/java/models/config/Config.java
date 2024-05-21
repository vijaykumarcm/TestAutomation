package models.config;

import java.util.Map;

import models.core.Parameter;

public interface Config {
    Map<String, Parameter<String>> getValues();
    
    String get(String name);

    void set(String name, String value);

    void set(String name, Parameter value);
}
