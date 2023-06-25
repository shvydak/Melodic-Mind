package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BaseHelper {
    public WebDriver webDriver;

    public BaseHelper(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this); // Class initialisation
        this.webDriver = webDriver;
    }

    public void type(WebElement webElement, String text) {
        webElement.click();
        webElement.clear();
        if (text != null) {
            webElement.sendKeys(text);
        }
    }
}
