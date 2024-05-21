package models.reporting;

import java.time.LocalDateTime;

public class Log {
	public LogLevel Level;
	public String Message;
	public String ScreenshotBase64;
	public LocalDateTime LogTime;
	public Exception Exception;

	/**
	 * Constructs a Log object that represents a log item for reporting.
	 * 
	 * @param level   The level of the log
	 * @param message The message to log
	 */
	public Log(LogLevel level, String message) {
		this.Level = level;
		this.Message = message;
		this.LogTime = LocalDateTime.now();
	}

	/**
	 * Constructs a Log object that represents a log item for reporting.
	 * 
	 * @param level            The level of the log
	 * @param message          The message to log
	 * @param screenshotBase64 A base 64 version of the screenshot
	 */
	public Log(LogLevel level, String message, String screenshotBase64) {
		this.Level = level;
		this.Message = message;
		this.ScreenshotBase64 = screenshotBase64;
		this.LogTime = LocalDateTime.now();
	}

	/**
	 * Constructs a Log object that represents a log item for reporting.
	 * 
	 * @param level   The level of the log
	 * @param message The message to log
	 * @param e       Any exception tied to the log
	 */
	public Log(LogLevel level, String message, Exception e) {
		this.Level = level;
		this.Message = message;
		this.Exception = e;
		this.LogTime = LocalDateTime.now();
	}

	/**
	 * Constructs a Log object that represents a log item for reporting.
	 * 
	 * @param level            The level of the log
	 * @param message          The message to log
	 * @param e                Any exception tied to the log
	 * @param screenshotBase64 A base 64 version of the screenshot
	 */
	public Log(LogLevel level, String message, Exception e, String screenshotBase64) {
		this.Level = level;
		this.Message = message;
		this.Exception = e;
		this.ScreenshotBase64 = screenshotBase64;
		this.LogTime = LocalDateTime.now();
	}

	public boolean hasScreenshot() {
		return this.ScreenshotBase64 != null && !this.ScreenshotBase64.equals("");
	}

	public boolean hasException() {
		return this.Exception != null;
	}
}
