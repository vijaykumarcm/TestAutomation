package models.core;

import java.util.ArrayList;
import java.util.List;
import models.controls.Control;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Step extends Stepable{
    @JsonProperty()
    public List<Control> Controls;
    @JsonProperty()
    public String OutputName;
    @JsonProperty()
    public Component LoopSteps;
    @JsonProperty()
    public Boolean TakeScreenshot;

    /**
     * Constructs a new instance of a Step.
     */
    public Step() {
        this.Controls = new ArrayList<>();
        this.Parameters = new ArrayList<>();
        this.ErrorAction = models.reporting.ErrorAction.NEXTITERATION;
        this.TakeScreenshot = false;
        this.Cleanup = false;
        this.Delay = 0;
        this.RecoveryType = RecoveryEnum.NEXT;
        this.RecoveryExecuted = false;
        this.IsComponent = false;
    }
}
