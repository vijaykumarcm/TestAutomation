package utils.search;

import java.util.List;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import models.controls.Control;
import models.exceptions.SearchException;

public final class Search {

    public static int SearchTimeout = 0;

    /**
     * Gets an instance of the given control.
     *
     * @param control The control to get an instance of
     * @return The instance of the control
     */
    public static WebElement getInstanceOf(Control control) {
        return Search.getInstanceOf(control, SearchTimeout);
    }

    /**
     * Gets an instance of the given control.
     *
     * @param control The control to get an instance of
     * @param searchTimeout The time in seconds to wait before timing out
     * @return The instance of the control
     */
    public static WebElement getInstanceOf(Control control, int searchTimeout) {
        if (control.Driver == null) {
            throw new RuntimeException(String.format("Driver was null when searching for control %s.", control.Name));
        }

        // switch to main window before search if we don't have a parent (parent will do this)
        if (control.Parent == null) {
            control.Driver.switchTo().defaultContent();
        }

        try {
            // get the search context
            SearchContext context = Search.getSearchContextOf(control);

            // get the timeout in milliseconds
            long searchTimeoutMilliseconds = searchTimeout * 1000;

            //get the start time
            long startTime = System.currentTimeMillis();

            Exception savedException;

            do {
                try {
                    // search for and return the control
                    return context.findElement(control.getSeleniumLocator());
                }
                catch (Exception e) {
                    // ignore while waiting
                    savedException = e;
                }
            }
            while (System.currentTimeMillis() < startTime + searchTimeoutMilliseconds);

            // if we got here the search has timed out
            // throw different message if no timeout was passed
            if (searchTimeout != 0) {
                throw new SearchException(String.format("Search for control %s timed out after %d seconds.", control.Name, searchTimeout), savedException);
            }
            else {
                throw new SearchException(String.format("Failed to find control %s.", control.Name), savedException);
            }
        }
        catch (SearchException se) {
            throw se;
        }
        catch (Exception e) {
            throw new SearchException(String.format("Failed to find control %s.", control.Name), e);
        }
    }

    /**
     * Gets the instances of the given control.
     *
     * @param control The control to get the instances of
     * @return The instances of the control
     */
    public static List<WebElement> getInstancesOf(Control control) {
        return Search.getInstancesOf(control, SearchTimeout);
    }

    /**
     * Gets the instances of the given control.
     *
     * @param control The control to get the instances of
     * @param searchTimeout The time in seconds to wait before timing out
     * @return The instances of the control
     */
    public static List<WebElement> getInstancesOf(Control control, int searchTimeout) {
        if (control.Driver == null) {
            throw new RuntimeException(String.format("Driver was null when searching for control %s.", control.Name));
        }

        // switch to main window before search if we don't have a parent (parent will do this)
        if (control.Parent == null) {
            control.Driver.switchTo().defaultContent();
        }

        try {
            // get the search context
            SearchContext context = Search.getSearchContextOf(control);

            // get the timeout in milliseconds
            long searchTimeoutMilliseconds = searchTimeout * 1000;

            //get the start time
            long startTime = System.currentTimeMillis();

            Exception savedException;

            do {
                try {
                    // search for and return the controls
                    return context.findElements(control.getSeleniumLocator());
                }
                catch (Exception e) {
                    // ignore while waiting
                    savedException = e;
                }
            }
            while (System.currentTimeMillis() < startTime + searchTimeoutMilliseconds);

            // if we got here the search has timed out
            // throw different message if no timeout was passed
            if (searchTimeout != 0) {
                throw new SearchException(String.format("Search for control %s timed out after %d seconds.", control.Name, searchTimeout), savedException);
            }
            else {
                throw new SearchException(String.format("Failed to find control %s.", control.Name), savedException);
            }
        }
        catch (SearchException se) {
            throw se;
        }
        catch (Exception e) {
            throw new SearchException(String.format("Failed to find control %s.", control.Name), e);
        }
    }

    /**
     * Gets the search context of the given control.
     *
     * @param control The control to get the search context of
     * @return The control's search context
     */
    public static SearchContext getSearchContextOf(Control control) {
        if (control.Parent == null) {
            return control.Driver;
        }
        else {
            control.Parent.Driver = control.Driver;
            WebElement parent = control.Parent.getInstance();

            // check if parent is an iframe and switch to it if it is
            if (parent.getTagName().equals("iframe")) {
                return control.Driver.switchTo().frame(parent);
            }
            else {
                return parent;
            }
        }
    }
}
