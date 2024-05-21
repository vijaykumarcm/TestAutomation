package models.core;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Component extends Stepable{
    @JsonProperty()
    public List<Stepable> Steps;

    /**
     * Constructs a new component object that represents a Component.
     */
    public Component() {
        this.Steps = new ArrayList<>();
        this.Parameters = new ArrayList<>();
        this.ErrorAction = models.reporting.ErrorAction.NEXTITERATION;
        this.IsComponent = true;
        this.RecoveryType = RecoveryEnum.NEXT;
        this.RecoveryExecuted = false;
        this.Delay = 0;
        this.Cleanup = false;
}
}
