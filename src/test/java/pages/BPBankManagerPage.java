package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BPBankManagerPage {
    public BPBankManagerPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(css = "button[ng-click='addCust()']")
    public WebElement addCustomerButton;

    //region Add Customer elements
    @FindBy(css = "input[ng-model='fName']")
    public WebElement fName;

    @FindBy(css = "input[ng-model='lName']")
    public WebElement lName;

    @FindBy(css = "input[ng-model='postCd']")
    public WebElement postCd;

    @FindBy(css = "button[type='submit']")
    public WebElement submitNewCustomer;
//endregion


    @FindBy(css = "button[ng-click='openAccount()']")
    public WebElement openAccountButton;

    //region openAccount elements
    @FindBy (css = "select[ng-model='custId']")
    public WebElement customerNameList;

    @FindBy (css = "select[ng-model='currency']")
    public WebElement currencyList;

    @FindBy(css = "button[type='submit']")
    public WebElement processButton;
    //endregion


    @FindBy(css = "button[ng-click='showCust()']")
    public WebElement showCustomersButton;

    //region showCustomers elements
    @FindBy(css = "input[placeholder='Search Customer']")
    public  WebElement searchCustomer;
    //endregion elements



}
