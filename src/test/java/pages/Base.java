package pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Base {

    public WebDriver driver = Driver.getWebDriver();
    private static final String ACCEPT_ALL_BUTTON_CSS = "button[data-testid='uc-accept-all-button']";


    public void acceptCookie() {
        WebElement element = driver.findElement(By.cssSelector(ACCEPT_ALL_BUTTON_CSS));

        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

        new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(5))
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(ACCEPT_ALL_BUTTON_CSS)));

        driver.switchTo().frame(1);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
