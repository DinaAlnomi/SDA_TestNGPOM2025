package assignment.Week05.day05;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CLContactListPage;
import pages.CLHomePage;
import pages.CLSignInPage;
import utilities.ConfigReader;
import utilities.DataProviderUtilities;
import utilities.Driver;




public class T01_ContactListApplication {

    CLHomePage homePage;
    CLSignInPage signInPage;
    CLContactListPage contactPage;

    @BeforeClass
    void setUp() throws InterruptedException {
        // Navigate to the application
        Driver.getDriver().get(ConfigReader.getProperty("cl_url"));

        homePage = new CLHomePage();
        signInPage = new CLSignInPage();
        contactPage = new CLContactListPage();

        // Create a new user account
        homePage.signUp.click(); Thread.sleep(3000);
        signInPage.fName.sendKeys("SDA3010-Dina");
        signInPage.lNAme.sendKeys("Abdulaziz");
        homePage.email.sendKeys("Dina@test14.com");
        homePage.password.sendKeys("1234567");
        homePage.submit.click();
        Thread.sleep(5000);


        // Assert successful registration
        Assert.assertTrue(contactPage.logout.isDisplayed(), "User registration failed");
        contactPage.logout.click();

        // Login with created user
        homePage.email.sendKeys("Dina@test14.com");
        homePage.password.sendKeys("1234567");
        homePage.submit.click();
        Thread.sleep(3000);
    }

    @Test(dataProvider = "getRecords2", dataProviderClass = DataProviderUtilities.class)
    void contactListApplicationTest(String fName, String lName, String birthdate, String email,
                                    String phone, String street1, String street2, String city,
                                    String stateProvince, String postalCode, String country) throws InterruptedException {


        Thread.sleep(1000);
        contactPage.addContact.click();
        signInPage.fName.sendKeys(fName);
        signInPage.lNAme.sendKeys(lName);
        contactPage.birthdate.sendKeys(birthdate);
        homePage.email.sendKeys(email);
        contactPage.phone.sendKeys(phone);
        contactPage.street1.sendKeys(street1);
        contactPage.street2.sendKeys(street2);
        contactPage.city.sendKeys(city);
        contactPage.stateProvince.sendKeys(stateProvince);
        contactPage.postalCode.sendKeys(postalCode);
        contactPage.country.sendKeys(country);
        contactPage.submit.click();

        Thread.sleep(1000);

        Assert.assertTrue(contactPage.getContactByEmail(email).isDisplayed(),
                "Contact " + email + " was not added successfully");
    }

    @AfterClass
    void tearDown() throws InterruptedException {

        Assert.assertEquals(contactPage.getAllContacts().size(), 5,
                "Total contact count does not match expected 5");

        Driver.closeDriver();
    }
}


//. Assert that all contacts are properly added and displayed

//Assertions:
//            - Verify successful user registration
//- Verify successful login
//- Verify each contact is added correctly
//- Verify total contact count equals 5

