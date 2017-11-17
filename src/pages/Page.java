package pages;

import generic.ChromeTestCase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {

    Page(){
        waitForPageLoad();
    }

    WebDriver webDriver = ChromeTestCase.getDriver();

    public void waitForPageLoad() {
        new WebDriverWait(webDriver, 30).until((ExpectedCondition<Boolean>) wd ->
                ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
    }
}
