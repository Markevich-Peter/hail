package ElementWrappers;

import generic.ChromeTestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorFinder extends ChromeTestCase {

    public static WebElement findElementByXpath(String xpath){
        return new WebDriverWait(driver, 10).until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    public static WebElement findElementByID(String id){
        return new WebDriverWait(driver, 10).until(
                ExpectedConditions.visibilityOfElementLocated(By.id(id)));
    }
}
