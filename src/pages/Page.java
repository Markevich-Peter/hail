package pages;

import generic.ChromeTestCase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {

    WebDriver webDriver = ChromeTestCase.getDriver();

    public void waitForPageLoad() {
        Wait<WebDriver> wait = new WebDriverWait(webDriver, 30);
        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver wdriver) {
                return ((JavascriptExecutor) webDriver).executeScript(
                        "return document.readyState"
                ).equals("complete");
            }
        });
    }
}
