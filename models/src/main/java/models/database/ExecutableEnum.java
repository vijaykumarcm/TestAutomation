package models.database;

public enum ExecutableEnum {

	TESTCASE("TestCase"), TESTSUITE("TestSuite"), TESTRUN("TestRun");

	private String value;

	ExecutableEnum(String value) {
		this.value = value;
	}

	/**
	 * Gets the executable enum from the string.
	 *
	 * @param value The string value
	 * @return The enum value
	 */
	public static ExecutableEnum get(String value) {
		switch (value) {
		case "TestCase":
			return TESTCASE;
		case "TestSuite":
			return TESTSUITE;
		case "TestRun":
			return TESTRUN;
		default:
			throw new RuntimeException(String.format("Invalid executable value : %s.", value));
		}
	}
}
