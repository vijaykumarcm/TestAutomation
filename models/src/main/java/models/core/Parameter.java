package models.core;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Parameter<T> {
    @JsonProperty()
    public String Name;
    @JsonIgnore()
    public Integer Index;
    @JsonProperty()
    public T Value;
    @JsonProperty()
    public boolean IsVariable;
    @JsonProperty()
    public boolean IsEncrypted;
    @JsonProperty()
    public String Random;

    public Parameter() {
    }

    /**
     * Constructs a new Parameter object that represents an action parameter.
     * @param name The parameter name
     * @param object The value of the parameter
     */
    public Parameter(String name, T object) {
        this.Name = name;
        this.Value = object;
        this.IsVariable = false;
        this.IsEncrypted = false;
        this.Index = 0;
        this.Random = null;
    }

    /**
     * Constructs a new Parameter object that represents an action parameter.
     * @param index The parameter index
     * @param object The value of the parameter
     */
    public Parameter(int index, T object) {
        this.Name = "EXCEL";
        this.Value = object;
        this.IsVariable = false;
        this.IsEncrypted = false;
        this.Index = index;
    }

    @JsonIgnore()
    public Class<?> getParameterClass() {
        return this.Value.getClass();
    }
}
