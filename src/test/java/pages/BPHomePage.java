package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BPHomePage {
    public BPHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (css = "button[ng-click='customer()']")
    public WebElement customerLoginButton;

    @FindBy (css = "button[ng-click='manager()'")
    public WebElement managerLoginButton;

    @FindBy (css = "button[ng-click='home()']")
    public WebElement homeButton;



}
