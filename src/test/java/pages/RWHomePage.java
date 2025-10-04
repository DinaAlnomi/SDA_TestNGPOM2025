package pages;

import org.apache.poi.ss.formula.functions.Index;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class RWHomePage {


    private By name = By.id("nameInput");
    private By age = By.id("ageInput");
    private By country = By.id("countrySelect");
    private By addRecordButton = By.xpath("//button[@onclick='addRecord()']");
    private By editRecordButton = By.xpath("//button[@class='edit-button']");
    private By deleteRecordButton = By.xpath("//button[@class='delete-button']");

    public RWHomePage fillName(String name) {
        Driver.getDriver().findElement(this.name).sendKeys(name);
        return this;
    }
     public RWHomePage fillAge(String age) {
         Driver.getDriver().findElement(this.age).sendKeys(age);
         return this;
     }
     public RWHomePage selectCountry(int index) {
         new Select(Driver.getDriver().findElement(country)).selectByIndex(index);
        return this;
     }
     public RWHomePage clickAddRecordButton() {
        Driver.getDriver().findElement(addRecordButton).click();
        return this;
    }
}
