package models.controls;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import utils.search.Search;

public class Control {

	 @JsonProperty(required = true)
	    public String Name;
	    @JsonProperty(required = true)
	    public LocatorType LocatorType;
	    @JsonProperty(required = true)
	    public String Locator;
	    @JsonProperty()
	    public String ParentName;

	    @JsonIgnore()
	    public Control Parent;
	    @JsonIgnore()
	    public WebDriver Driver;
	    @JsonIgnore()
	    public String InternalLocator;

	    /**
	     * Gets an instance of this control.
	     *
	     * @return A web element instance
	     */
	    @JsonIgnore()
	    public WebElement getInstance() {
	        return Search.getInstanceOf(this);
	    }

	    /**
	     * Gets an instance of this control.
	     *
	     * @param searchTimeout The time in seconds to wait before timing out
	     * @return A web element instance
	     */
	    @JsonIgnore()
	    public WebElement getInstance(int searchTimeout) {
	        return Search.getInstanceOf(this, searchTimeout);
	    }

	    /**
	     * Gets the instances of this control.
	     *
	     * @return A web element instances
	     */
	    @JsonIgnore()
	    public List<WebElement> getInstances() {
	        return Search.getInstancesOf(this);
	    }

	    /**
	     * Gets the instances of this control.
	     *
	     * @param searchTimeout The time in seconds to wait before timing out
	     * @return A web element instances
	     */
	    @JsonIgnore()
	    public List<WebElement> getInstances(int searchTimeout) {
	        return Search.getInstancesOf(this, searchTimeout);
	    }

	    /**
	     * Gets the locator for this Control.
	     *
	     * @return The By locator object
	     */
	    @JsonIgnore()
	    public By getSeleniumLocator() {
	        // internal locator is set in UpdateControl action
	        if (this.InternalLocator == null || this.InternalLocator.equals("")) {
	            this.InternalLocator = this.Locator;
	        }

	        switch (this.LocatorType) {
	            case ID:
	                return By.id(this.InternalLocator);
	            case CSS:
	                return By.cssSelector(this.InternalLocator);
	            case NAME:
	                return By.name(this.InternalLocator);
	            case CLASS:
	                return By.className(this.InternalLocator);
	            case XPATH:
	                return By.xpath(this.InternalLocator);
	            case TESTID:
	                return By.xpath(String.format("//*[@testid='%s']", this.InternalLocator));
	            case TEXT:
	                return By.xpath(String.format("//*[contains(text(),'%s')]", this.InternalLocator));
	            case DYNAMIC:
	                String[] dynSplits = this.InternalLocator.split("\\$");
	                return By.xpath(String.format(dynSplits[0], dynSplits[1]));
	            default:
	                throw new RuntimeException(String.format("Invalid locator type : %s for control %s.", this.LocatorType.name(), this.Name));
	        }
	    }
}
