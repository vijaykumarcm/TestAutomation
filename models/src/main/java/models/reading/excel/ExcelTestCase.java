package models.reading.excel;

import com.poiji.annotation.ExcelCellName;

public class ExcelTestCase {
    @ExcelCellName("Active")
    public String Active = "no";

    @ExcelCellName("Test Case Name")
    public String Name;

    @ExcelCellName("Description")
    public String Description;

    @ExcelCellName("Data")
    public String Data;
}
