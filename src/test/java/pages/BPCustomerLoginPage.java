package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BPCustomerLoginPage {
    public BPCustomerLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



}
