package pages;

import driver.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base {

    public WebDriver driver = Driver.getWebDriver();

    public void acceptCookie() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement acceptAllButton = (WebElement) jse.executeScript("return document.querySelector('#usercentrics-root').shadowRoot.querySelector('button[data-testid=\"uc-accept-all-button\"]')");
        String js = "arguments[0].click()";
        ((JavascriptExecutor) driver).executeScript(js, acceptAllButton);
    }
}
