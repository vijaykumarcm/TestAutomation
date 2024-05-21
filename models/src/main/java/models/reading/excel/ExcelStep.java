package models.reading.excel;

import com.poiji.annotation.ExcelCellName;

public class ExcelStep {
    @ExcelCellName("ScreenShot")
    public String Screenshot;

    @ExcelCellName("Test Step")
    public String Name;

    @ExcelCellName("Object")
    public String Object;

    @ExcelCellName("Action")
    public String Action;

    @ExcelCellName("Parameters")
    public String Parameters;

    @ExcelCellName("ErrorAction")
    public String ErrorAction;

    @ExcelCellName("Output Name")
    public String OutputName;

    @ExcelCellName("Always Run")
    public String AlwaysRun;
}
