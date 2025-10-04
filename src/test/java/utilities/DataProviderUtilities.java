package utilities;

import com.github.javafaker.Faker;
import org.testng.annotations.DataProvider;

public class DataProviderUtilities {

    @DataProvider
    public Object[][] getRecords() {
        return new Object[][]{
                {"johndoe", "123", "Comments from John", "Drop Down Item 6"},
                {"marystar", "767", "Comments from Mary", "Drop Down Item 2"},
                {"tomhawk", "889", "Comments from Tom", "Drop Down Item 1"},
                {"timlee", "098", "Comments from Tim", "Drop Down Item 5"},
                {"kenjoe", "567", "Comments from Ken", "Drop Down Item 4"},
        };
    }

    @DataProvider
    public Object[][] getRecords2() {
        return new Object[][]{
                {"john", "doe", "2002-05-16", "john@gmail.com", "0738648",
                        "123 Main St", "Apt 4B", "New York", "NY", "10001", "USA"},

                {"mary", "star", "2002-05-18", "mary@gmail.com", "07434895",
                        "45 Queen Ave", "Suite 12", "Los Angeles", "CA", "90012", "USA"},

                {"tom", "hawk", "2009-05-16", "tom@gmail.com", "07123456",
                        "78 King Rd", "Floor 2", "Chicago", "IL", "60605", "USA"},

                {"tim", "lee", "1990-05-16", "tim@gmail.com", "07987654",
                        "22 Pine St", "Unit 7", "Houston", "TX", "77002", "USA"},

                {"ken", "joe", "2006-05-24", "ken@gmail.com", "07011223",
                        "99 Sunset Blvd", "Room 305", "Miami", "FL", "33101", "USA"}
        };
    }

    @DataProvider
    public Object[][] getRecordsBP() {
        return new Object[][]{
                {"john", "doe", "10001"},
                {"mary", "star", "90012"},
                {"tom", "hawk","60605"},
                {"tim", "lee", "77002"},
                {"ken", "joe", "33101"}
        };
    }

    @DataProvider
    public Object[][] getRecordsRW() {
        return new Object[][]{
                {"john", "40", 1},
                {"mary", "55", 2},
                {"tom", "23",3},
                {"tim", "45", 4},
                {"ken", "36", 5}
        };
    }

    @DataProvider(name = "faker")
    public Object[][] getFakeRecords() {
        Faker faker = new Faker();
        return new Object[][]{
                {faker.name().username(), faker.internet().password(), faker.lorem().paragraph(50), "Drop Down Item " + faker.number().numberBetween(1, 7)},
                {faker.name().username(), faker.internet().password(), faker.lorem().paragraph(50), "Drop Down Item " + faker.number().numberBetween(1, 7)},
                {faker.name().username(), faker.internet().password(), faker.lorem().paragraph(50), "Drop Down Item " + faker.number().numberBetween(1, 7)},
                {faker.name().username(), faker.internet().password(), faker.lorem().paragraph(50), "Drop Down Item " + faker.number().numberBetween(1, 7)},
                {faker.name().username(), faker.internet().password(), faker.lorem().paragraph(50), "Drop Down Item " + faker.number().numberBetween(1, 7)},
                {faker.name().username(), faker.internet().password(), faker.lorem().paragraph(50), "Drop Down Item " + faker.number().numberBetween(1, 7)}
        };
    }



    }




