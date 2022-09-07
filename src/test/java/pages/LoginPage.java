package pages;

import org.openqa.selenium.By;

public class LoginPage extends Base {

    private static final String EMAIL_CSS = "#loginForm-eMail";
    private static final String PASSWORD_CSS = "input[data-qa-id='login-form-password']";
    private static final String LOGIN_BUTTON_CSS = "#login-submit-btn";

    public void login(String email, String password) throws InterruptedException {
        driver.findElement(By.cssSelector(EMAIL_CSS)).sendKeys(email);
        driver.findElement(By.cssSelector(PASSWORD_CSS)).sendKeys(password);
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(LOGIN_BUTTON_CSS)).click();
    }
}
