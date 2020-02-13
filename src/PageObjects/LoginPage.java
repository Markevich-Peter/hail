package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class LoginPage extends Page {

    private String txtLogin = ".//*[@id=\"login\"]";
    private String txtPassword = ".//*[@id=\"password\"]";
    private String buttonEnter = ".//button//*[text()=\"Вход\"]";

    public void openLoginPage() {
        //driver.manage().window().maximize();
        driver.get("http://test.dirtmixer.com/signin");
        driver.manage().window().setSize(new Dimension(1600, 900));
        String currentWindow = driver.getWindowHandle();
        driver.switchTo().window(currentWindow);
    }

    public void fillLogin(String login){
        driver.findElement(By.xpath(txtLogin)).sendKeys(login);
    }

    public void fillPassword(String password){
        driver.findElement(By.xpath(txtPassword)).sendKeys(password);
    }

    public void clickEnter(){
        driver.findElement(By.xpath(buttonEnter)).click();
    }
}
