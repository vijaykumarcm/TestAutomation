package models.database;

public class Execution {
    public int ExecutionId;
    public int ExecutableId;
    public ExecutableEnum ExecutableType;
    public int ConfigurationId;
    public ExecutionStatusEnum ExecutionStatus;
    public String ExecutionUUID;
    public String ResultLocation;
}
