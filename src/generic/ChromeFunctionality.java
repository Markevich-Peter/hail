package generic;

import org.openqa.selenium.*;
import org.openqa.selenium.net.Urls;

public class ChromeFunctionality {

    protected WebDriver driver;
    private WebElement element;

    public void getChrome() {
        driver = DriverFactory.getDriver();
    }

    public void openUrl(Urls url) {
        driver.get(url.toString());
    }

    public void pasteTextIntoTestField(Urls url) {
        element = driver.findElement(By.id("childdata"));
        element.clear();
        element.sendKeys(url.toString());
    }

    public void sendPasteCommand() {
        element = driver.findElement(By.id("childdata"));
        element.click();
        element.sendKeys(Keys.chord(Keys.CONTROL, "v"));
    }

    public void openBlankChildPageUsingWindowOpenWithoutAttributes() {
        element = driver.findElement(By.partialLinkText("window.open without attributes"));
        element.click();
    }

    public void copyTextFromTestField() {
        element = driver.findElement(By.id("childdata"));
        element.click();
        element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        element.sendKeys(Keys.chord(Keys.CONTROL, "c"));
    }

    public void closeChrome() {
        DriverFactory.closeQuitely();
    }

    public void killChromeDriver() {
        String killChromeDriver = "pkill -9 chromedriver";
        String killGoogleChrome = "pkill -9 Google Chrome";
        try {
            Process p2 = Runtime.getRuntime().exec(killChromeDriver);
            p2.waitFor();

            Process p1 = Runtime.getRuntime().exec(killGoogleChrome);
            p1.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void minimizeWindow() {
        driver.manage().window().setPosition(new Point(360, 592));
    }

}
