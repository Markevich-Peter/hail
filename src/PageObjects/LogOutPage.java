package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class LogOutPage extends Page {
    private String txtLogin = ".//*[@id=\"login\"]";            //это строковые переменные, которым присмваивается
    private String txtPassword = ".//*[@id=\"password\"]";      //значение локатора
    private String buttonEnter = ".//button//*[text()=\"Вход\"]";
    private String buttonLogOut = "./html/body/div[13]/div/div[1]/div[2]/div/a[1]";   //я добавил

    public void openLoginPage() {                              //этот метод открывает страницу ресурса и
        //driver.manage().window().maximize();                 //управляет ею при помощи драйвера
        driver.get("http://test.dirtmixer.com/signin");
        driver.manage().window().setSize(new Dimension(1600, 900));
        String currentWindow = driver.getWindowHandle();
        driver.switchTo().window(currentWindow);
    }

    public void fillLogin(String login) {
        driver.findElement(By.xpath(txtLogin)).sendKeys(login);   //эти методы заполняю нужные поля и нажимают кнопку
    }

    public void fillPassword(String password) {
        driver.findElement(By.xpath(txtPassword)).sendKeys(password);
    }

    public void clickEnter() {
        driver.findElement(By.xpath(buttonEnter)).click();
    }

    public void clickLogOut() {                                 // я добавил
        driver.findElement(By.xpath(buttonLogOut)).click();
    }
}
