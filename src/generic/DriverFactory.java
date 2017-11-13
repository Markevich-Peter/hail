package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private static volatile WebDriver driver;
    private static ChromeOptions options;

    private DriverFactory() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            options = new ChromeOptions();
            options.addArguments("chrome.switches", "--disable-extensions");
            System.setProperty("webdriver.chrome.driver", "tools/chromedriver");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(150, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        }
        return driver;
    }


    public static void closeQuitely() {
        try {
            if (driver != null) {
                driver.close();
                driver.quit();
                driver = null;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        driver = null;
    }

}

