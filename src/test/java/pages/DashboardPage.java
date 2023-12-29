package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

public class DashboardPage extends BasePage {



    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "span[class='mw-page-title-main']")
    private WebElement pageTitle;

    @FindBy(css = "#swal2-html-container")
    public WebElement loading;

    @FindBy(css = "html > body > div:nth-of-type(1) > div > div:nth-of-type(1) > div > main > div:nth-of-type(2) > div > div > div > main > div > main > div:nth-of-type(1) > div > div > div:nth-of-type(2) > div > div")
    public WebElement cajaEstado;

    public boolean dashboard(){
        waitElementNotVisibility(loading);
        waitElementVisibility(cajaEstado);
        return cajaEstado.isDisplayed();
    }
}
