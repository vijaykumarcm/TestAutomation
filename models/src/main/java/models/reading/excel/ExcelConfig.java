package models.reading.excel;

import com.poiji.annotation.ExcelCellName;

public class ExcelConfig {
	   @ExcelCellName("Name")
	    public String Name;

	    @ExcelCellName("Value")
	    public String Value;
}
