package utils.baseTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import pages.HomePage;
import utils.MyDriver;

public class BaseTest {

    MyDriver driver;

    @BeforeMethod(alwaysRun = true)
    @Parameters({"browser", "url"})
    public void bedoreMethod(String browser, String url) {
        driver = new MyDriver(browser);
        driver.getDriver().manage().window().maximize();
        navigateTo(url);
    }

    /**
     * Navigates to given URL
     *
     * @param url
     */
    public void navigateTo(String url) {
        driver.getDriver().get(url);
    }

    /**
     * It instantiates the first page loaded
     *
     * @return FirstPage
     */
    public HomePage loadFirstPAge() {
        return new HomePage(driver.getDriver());
    }

    /**
     * After the test execution it closes the browser
     */
    @AfterMethod()
    public void afterMethod() {
        driver.getDriver().close();
    }

}
