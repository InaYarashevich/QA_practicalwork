package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homepage extends Base {

    private static final String CUSTOMER_NUMBER_XPATH = "//span[contains(.,'Kundennummer')]";

    public WebElement getCustomerNumberWebElement(){
        return driver.findElement(By.xpath(CUSTOMER_NUMBER_XPATH));
    }
}
