package tests.gui;

import driver.Driver;
import objects.UserLogin;
import org.junit.Assert;
import org.junit.Test;
import pages.Homepage;
import pages.LoginPage;
import pages.MainPage;
import utils.DataParser;

import java.io.IOException;

public class LoginTest {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    Homepage homepage = new Homepage();
    UserLogin userLogin = DataParser.parseData();

    public LoginTest() throws IOException {
    }

    @Test
    public void loginWithEmailPassword() {
        Driver.getWebDriver().get("https://www.shop-apotheke.com/");
        mainPage.initiateLogin();
        loginPage.login(userLogin.getEmail(), userLogin.getPassword());
        Assert.assertTrue("The customer number is not displayed on the page!",
                homepage.getCustomerNumberWebElement().isDisplayed());
    }
}
