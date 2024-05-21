package models.reporting;

import java.time.LocalDateTime;

public class Result<O> extends Logger{
    public ResultStatus Status;
    public O Output;
    public LocalDateTime StartTime;
    public LocalDateTime EndTime;

    /**
     * Constructs a new Result object that represents some result.
     */
    public Result() {
        super();

        this.Status = ResultStatus.PASSED;
    }

    /**
     * Sets the start time for this result to now.
     */
    public void setStart() {
        this.StartTime = LocalDateTime.now();
    }

    /**
     * Sets the end time for this result to now.
     */
    public void setEnd() {
        this.EndTime = LocalDateTime.now();
    }

    /**
     * Constructs a new Result object that represents some result.
     *
     * @param item The result output
     */
    public Result(O item) {
        super();

        this.Status = ResultStatus.PASSED;
        this.Output = item;
    }
}
