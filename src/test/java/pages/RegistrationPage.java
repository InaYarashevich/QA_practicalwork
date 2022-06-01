package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class RegistrationPage extends Base {

    private static final String FIRST_NAME_CSS = "#firstName";
    private static final String LAST_NAME_CSS = "#lastName";
    private static final String WOMAN_CSS = "#salutation_female";
    private static final String EMAIL_CSS = "#registerForm-eMail";
    private static final String PASSWORD_CSS = "#registerForm-password";
    private static final String BIRTH_DAY_CSS = "div[data-clientside-hook='birthDaySelect__day']";
    private static final String BIRTH_MONTH_CSS = "div[data-clientside-hook='birthDaySelect__month']";
    private static final String BIRTH_YEAR_CSS = "div[data-clientside-hook='birthDaySelect__year']";
    private static final String ACCEPT_CHECKBOX_CSS = "input[data-qa-id='register-form-tosAccepted']";
    private static final String SUBMIT_BUTTON_CSS = "#register-submit-btn";
    private static final String DAY_CSS = "div[data-clientside-hook='birthDaySelect__day'] div[data-value='1']";
    private static final String MONTH_CSS = "div[data-clientside-hook='birthDaySelect__month'] div[data-value='1']";
    private static final String YEAR_CSS = "div[data-clientside-hook='birthDaySelect__year'] div[data-value='2004']";

    public void register(String firstName, String lastName, String email, String password) {
        driver.findElement(By.cssSelector(WOMAN_CSS)).click();
        driver.findElement(By.cssSelector(FIRST_NAME_CSS)).sendKeys(firstName);
        driver.findElement(By.cssSelector(LAST_NAME_CSS)).sendKeys(lastName);
        driver.findElement(By.cssSelector(EMAIL_CSS)).sendKeys(email);
        driver.findElement(By.cssSelector(PASSWORD_CSS)).sendKeys(password);

        Actions actions = new Actions(driver);
        actions.click(driver.findElement(By.cssSelector(BIRTH_DAY_CSS)));
        actions.moveToElement(driver.findElement(By.cssSelector(DAY_CSS))).click();
        actions.click(driver.findElement(By.cssSelector(BIRTH_MONTH_CSS)));
        actions.moveToElement(driver.findElement(By.cssSelector(MONTH_CSS))).click();
        actions.click(driver.findElement(By.cssSelector(BIRTH_YEAR_CSS))).click();
        actions.moveToElement(driver.findElement(By.cssSelector(YEAR_CSS))).click();

        driver.findElement(By.cssSelector(ACCEPT_CHECKBOX_CSS)).click();
        driver.findElement(By.cssSelector(SUBMIT_BUTTON_CSS)).click();
    }
}
