package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#demo-simple-select-standard")
    public WebElement cliente;

   @FindBy(xpath = "/html/body/div[2]/div[3]/ul/li[3]")
    public WebElement listaClientes;

    @FindBy(css = "input[id='filled-adornment-username']")
    public WebElement inputUsername;

    @FindBy(css = "input[id='filled-adornment-password']")
    public WebElement inputPassword;

    @FindBy(css = "button[class*='MuiButton-outlined']")
    public WebElement buttonIniciar;

    @FindBy(css = "#swal2-html-container")
    public WebElement divSwalContainer;


    public DashboardPage loginCliente(String username, String password) {
        cliente.click();
        listaClientes.click();
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        buttonIniciar.click();
//
        return new DashboardPage(super.getDriver());
       // return null;
    }

}
