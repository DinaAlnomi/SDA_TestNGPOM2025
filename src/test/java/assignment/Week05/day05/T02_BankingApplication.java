package assignment.Week05.day05;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import pages.BPBankManagerPage;
import pages.BPCustomerLoginPage;
import pages.BPHomePage;
import utilities.ConfigReader;
import utilities.DataProviderUtilities;
import utilities.Driver;

public class T02_BankingApplication {

//‏HomeWork For Weekend :2Example 2: Banking Application Test
//‏Target: https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login

    BPBankManagerPage bankManagerPage;
    BPCustomerLoginPage customerLoginPage;
    BPHomePage homePage;

@Test(dataProvider = "getRecordsBP", dataProviderClass = DataProviderUtilities.class)
    void bankingAppTest(String fName, String lName, String postCd) {

    BPBankManagerPage bankManagerPage = new BPBankManagerPage();
    BPCustomerLoginPage customerLoginPage = new BPCustomerLoginPage();
    BPHomePage homePage = new BPHomePage();

    Driver.getDriver().get(ConfigReader.getProperty("bp_url"));

//  . Open 5 new customer accounts
   homePage.managerLoginButton.click();
   bankManagerPage.addCustomerButton.click();
   bankManagerPage.fName.sendKeys(fName);
   bankManagerPage.lName.sendKeys(lName);
   bankManagerPage.postCd.sendKeys(postCd);
   bankManagerPage.addCustomerButton.click();
    Alert alert = Driver.getDriver().switchTo().alert();
    alert.accept();

//‏2. Deposit 100 USD to each account

}







//‏3. Withdraw 100 USD from any one account
//‏4. Delete all created accounts
//‏5. Verify account operations
//‏Page Objects Needed:
//            ‏- ManagerLoginPage (manager interface elements)
//‏- CustomerManagementPage (add/delete customer elements)
//‏- AccountManagementPage (account creation elements)
//‏- CustomerLoginPage (customer interface elements)
//‏- TransactionPage (deposit/withdraw elements)
//‏Assertions:
//            ‏- Verify account creation success
//‏- Verify deposit transactions
//‏- Verify withdrawal transactions
//‏- Verify account balance updates
//‏- Verify account deletion
//
}
