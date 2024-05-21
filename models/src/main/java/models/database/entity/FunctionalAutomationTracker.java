package models.database.entity;

public class FunctionalAutomationTracker {

	private int applicationId;
	private String reasonAutomationSolutionName;
	private int automationSolutionId;
	private String releaseMonth;
	private int releaseYear;
	private String projectIncidentName;
	private int automatedScriptCount;
	private int executedTestCasesCount;
	private String testType;
	private String insertUser;

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getReasonAutomationSolutionName() {
		return reasonAutomationSolutionName;
	}

	public void setReasonAutomationSolutionName(String reasonAutomationSolutionName) {
		this.reasonAutomationSolutionName = reasonAutomationSolutionName;
	}

	public int getAutomationSolutionId() {
		return automationSolutionId;
	}

	public void setAutomationSolutionId(int automationSolutionId) {
		this.automationSolutionId = automationSolutionId;
	}

	public String getReleaseMonth() {
		return releaseMonth;
	}

	public void setReleaseMonth(String releaseMonth) {
		this.releaseMonth = releaseMonth;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getProjectIncidentName() {
		return projectIncidentName;
	}

	public void setProjectIncidentName(String projectIncidentName) {
		this.projectIncidentName = projectIncidentName;
	}

	public int getAutomatedScriptCount() {
		return automatedScriptCount;
	}

	public void setAutomatedScriptCount(int automatedScriptCount) {
		this.automatedScriptCount = automatedScriptCount;
	}

	public int getExecutedTestCasesCount() {
		return executedTestCasesCount;
	}

	public void setExecutedTestCasesCount(int executedTestCasesCount) {
		this.executedTestCasesCount = executedTestCasesCount;
	}

	public String getTestType() {
		return testType;
	}

	public void setTestType(String testType) {
		this.testType = testType;
	}

	public String getInsertUser() {
		return insertUser;
	}

	public void setInsertUser(String insertUser) {
		this.insertUser = insertUser;
	}
}
