package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class MainPage extends Base {

    private static final String PROFILE_MENU_CSS = "a[data-qa-id='account-button']";
    private static final String LOGIN_CSS = "a[data-qa-id='form-Menubar.Login']";
    private static final String REGISTER_BUTTON_CSS = "a[href='/nx/login/#register']";

    public void initiateLogin() {
        WebElement profileIcon = driver.findElement(By.cssSelector(PROFILE_MENU_CSS));
        WebElement loginButton = driver.findElement(By.cssSelector(LOGIN_CSS));
        Actions actions = new Actions(driver);
        actions.moveToElement(profileIcon);
        actions.moveToElement(loginButton);
        actions.click().build().perform();
    }

    public void initiateRegistration() {
        WebElement profileIcon = driver.findElement(By.cssSelector(PROFILE_MENU_CSS));
        WebElement registerButton = driver.findElement(By.cssSelector(REGISTER_BUTTON_CSS));
        Actions actions = new Actions(driver);
        actions.moveToElement(profileIcon);
        actions.moveToElement(registerButton);
        actions.click().build().perform();
    }
}
