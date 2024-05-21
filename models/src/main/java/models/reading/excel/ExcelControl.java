package models.reading.excel;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelRow;

public class ExcelControl {
    @ExcelRow
    public int RowIndex;

    @ExcelCellName("Element")
    public String Element;

    @ExcelCellName("Type")
    public String Type;

    @ExcelCellName("Value")
    public String Value;

    @ExcelCellName("Parent")
    public String ParentName;
}
