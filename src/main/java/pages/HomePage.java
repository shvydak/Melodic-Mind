package pages;

import manager.BaseHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseHelper {
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//span[text()=' Continue with Email ']")
    WebElement continueWithEmailButton;
    @FindBy(xpath = "//span[text()=' Sign in/up ']")
    WebElement signInUpButton;

    public void clickContinueWithEmailButton() {
        continueWithEmailButton.click();
    }

    public void clickSignInUpButton() {
        signInUpButton.click();
    }
}
