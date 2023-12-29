package tests;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.DashboardPage;
import utils.baseTest.BaseTest;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTest {

    @Test
    @Parameters({"usernameCliente", "passwordCliente"})
    public void loginTest(String username, String password) {
        HomePage home = loadFirstPAge();

        DashboardPage results = home.loginCliente(username, password);

        home.waitSomeSeconds(10);

        //results.dashboard();

    }
}
