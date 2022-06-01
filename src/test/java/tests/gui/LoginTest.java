package tests.gui;

import driver.Driver;
import objects.UserLogin;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
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

    private static final Logger LOGGER =
            Logger.getLogger(LoginTest.class.getName());

    public LoginTest() throws IOException {
    }

    @Before
    public void start(){
        LOGGER.info("Starting the test.");
    }

    @Test
    public void loginWithEmailPassword() throws InterruptedException {
        Driver.getWebDriver().get("https://www.shop-apotheke.com/");
        LOGGER.info("Main page is opened.");
        mainPage.initiateLogin();
        LOGGER.info("Login button is clicked. Login page is opened.");
        loginPage.login(userLogin.getEmail(), userLogin.getPassword());
        LOGGER.info("Submitting User's data: email and password.");
        Assert.assertTrue("The customer number is not displayed on the page!",
                homepage.getCustomerNumberWebElement().isDisplayed());
    }

    @After
    public void finish(){
        LOGGER.info("Finishing the test.");
    }
}
