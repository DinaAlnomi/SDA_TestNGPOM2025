package assignment.Week06.day3;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddContactPage;
import pages.ContactListPage;
import pages.LoginPage;
import utilis.Driver;
import utilities.ConfigReader;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Locale;

public class T01ContactListExtentReportTest03 {

    @Test
    void getDriverTest(){
        LoginPage loginPage = new LoginPage();
        ContactListPage contactListPage = new ContactListPage();
        AddContactPage addContactPage = new AddContactPage();
        Faker faker = new Faker();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        Driver.getDriver().get(ConfigReader.getProperty("cl_url"));

        loginPage.signup.click();
        loginPage.signUp(
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                faker.internet().password());

        Assert.assertTrue(contactListPage.logout.isDisplayed());

        for (int i = 0; i<5; i++){
            createContact(addContactPage, contactListPage, wait, faker);
        }

        int rowCount = contactListPage.dataCount.size();
        Assert.assertEquals(rowCount,5);
    }

    public void createContact(AddContactPage addContactPage, ContactListPage contactListPage, WebDriverWait wait, Faker faker) {
        Driver.getDriver().navigate().refresh();
        contactListPage.addContact.click();
        addContactPage.addContact(
                faker.name().firstName(),
                faker.name().lastName(),
                new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(faker.date().birthday()),
                faker.internet().emailAddress(),
                faker.phoneNumber().cellPhone().replaceAll("[^0-9]", ""),
                faker.address().streetAddress(),
                faker.address().streetAddress(),
                faker.address().city(),
                faker.address().state(),
                faker.address().zipCode(),
                faker.country().name()
        );
        wait.until(ExpectedConditions.visibilityOf(contactListPage.addContact));
        Assert.assertTrue(contactListPage.addContact.isDisplayed());
    }
}

