package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CLContactListPage {

    public CLContactListPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "logout")
    public WebElement logout;

    @FindBy(id = "add-contact")
    public WebElement addContact;

    @FindBy(id = "birthdate")
    public WebElement birthdate;

    @FindBy(id="phone")
    public WebElement phone;

    @FindBy (id = "street1")
    public WebElement street1;

    @FindBy (id = "street2")
    public WebElement street2;

    @FindBy (id = "city")
    public WebElement city;

    @FindBy (id = "stateProvince")
    public WebElement stateProvince;

    @FindBy (id = "postalCode")
    public WebElement postalCode;

    @FindBy (id = "country")
    public WebElement country;

    @FindBy (id = "submit")
    public WebElement submit;

    public List<WebElement> getAllContacts() {

        return Driver.getDriver().findElements(
                By.cssSelector("#myTable>tbody>tr.contactTableBodyRow")
        );
    }

    public WebElement getContactByEmail(String email) {
        return Driver.getDriver().findElement(
                By.xpath("//*[@id='myTable']/tbody/tr[@class='contactTableBodyRow'][td[3][text()='" + email + "']]")
        );
    }


    }


