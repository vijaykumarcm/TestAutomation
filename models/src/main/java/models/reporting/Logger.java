package models.reporting;

import java.util.ArrayList;
import java.util.List;

public class Logger {
	   public List<Log> Logs;

	    public Logger() {
	        this.Logs = new ArrayList<>();
	    }

	    public void logFatal(String message, Exception exception, String screenshotBase64) {
	        this.addLog(LogLevel.FATAL, message, exception, screenshotBase64);
	    }

	    public void logFatal(String message, Exception exception) {
	        this.addLog(LogLevel.FATAL, message, exception, null);
	    }

	    public void logFatal(String message, String screenshotBase64) {
	        this.addLog(LogLevel.FATAL, message, null, screenshotBase64);
	    }

	    public void logFatal(String message) {
	        this.addLog(LogLevel.FATAL, message, null, null);
	    }

	    public void logError(String message, Exception exception, String screenshotBase64) {
	        this.addLog(LogLevel.ERROR, message, exception, screenshotBase64);
	    }

	    public void logError(String message, Exception exception) {
	        this.addLog(LogLevel.ERROR, message, exception, null);
	    }

	    public void logError(String message, String screenshotBase64) {
	        this.addLog(LogLevel.ERROR, message, null, screenshotBase64);
	    }

	    public void logError(String message) {
	        this.addLog(LogLevel.ERROR, message, null, null);
	    }

	    public void logDebug(String message, Exception exception, String screenshotBase64) {
	        this.addLog(LogLevel.DEBUG, message, exception, screenshotBase64);
	    }

	    public void logDebug(String message, Exception exception) {
	        this.addLog(LogLevel.DEBUG, message, exception, null);
	    }

	    public void logDebug(String message, String screenshotBase64) {
	        this.addLog(LogLevel.DEBUG, message, null, screenshotBase64);
	    }

	    public void logDebug(String message) {
	        this.addLog(LogLevel.DEBUG, message, null, null);
	    }

	    public void logWarning(String message, Exception exception, String screenshotBase64) {
	        this.addLog(LogLevel.WARN, message, exception, screenshotBase64);
	    }

	    public void logWarning(String message, Exception exception) {
	        this.addLog(LogLevel.WARN, message, exception, null);
	    }

	    public void logWarning(String message, String screenshotBase64) {
	        this.addLog(LogLevel.WARN, message, null, screenshotBase64);
	    }

	    public void logWarning(String message) {
	        this.addLog(LogLevel.WARN, message, null, null);
	    }

	    public void logInfo(String message, String screenshotBase64) {
	        this.addLog(LogLevel.INFO, message, null, screenshotBase64);
	    }

	    public void logInfo(String message) {
	        this.addLog(LogLevel.INFO, message, null, null);
	    }

	    public void logTrace(String message, String screenshotBase64) {
	        this.addLog(LogLevel.TRACE, message, null, screenshotBase64);
	    }

	    public void logTrace(String message) {
	        this.addLog(LogLevel.TRACE, message, null, null);
	    }

	    /**
	     * Adds the logs to the list.
	     * @param logs The logs to add
	     */
	    public void addLogs(List<Log> logs) {
	        if (this.Logs == null) {
	            this.Logs = new ArrayList<>();
	        }

	        if (logs != null) {
	            this.Logs.addAll(logs);
	        }
	    }

	    /**
	     * Adds a new log to the list.
	     * @param level The level of the log
	     * @param message The message to log
	     * @param e Any exception tied to the log
	     * @param screenshotBase64 A path to a screenshot
	     */
	    public void addLog(LogLevel level, String message, Exception e, String screenshotBase64) {
	        if (this.Logs == null) {
	            this.Logs = new ArrayList<>();
	        }

	        this.Logs.add(new Log(level, message, e, screenshotBase64));
	    }
}
