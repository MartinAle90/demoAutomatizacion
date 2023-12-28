package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyDriver {
    private WebDriver driver;

    public MyDriver(String browser) {
        if ("firefox".equals(browser)) {
            driver = new FirefoxDriver();
        } else if ("chrome".equals(browser)) {
            driver = new ChromeDriver();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}

