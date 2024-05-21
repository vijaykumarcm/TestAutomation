package models.reporting;

public interface IReporter {
    void write(Result<?> result);

    String getPath();

    Boolean allPassed();
}
