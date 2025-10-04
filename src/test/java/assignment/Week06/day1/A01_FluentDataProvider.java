package assignment.Week06.day1;

import org.testng.annotations.Test;
import pages.RWHomePage;
import utilities.ConfigReader;
import utilities.DataProviderUtilities;
import utilities.Driver;

public class A01_FluentDataProvider {


    /*
     */
   // Go to https://claruswaysda.github.io/addRecordWebTable.html
   // Add records to the table using DataProvider
    @Test(dataProvider = "getRecordsRW", dataProviderClass = DataProviderUtilities.class)
    void fluentDataProvider(String name, String age, int index) {
        RWHomePage homePage = new RWHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("rw_url"));
        homePage.fillName(name)
                .fillAge(age)
                .selectCountry(index)
                .clickAddRecordButton();


    }
}
