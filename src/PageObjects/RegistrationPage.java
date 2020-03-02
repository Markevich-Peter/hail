package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class RegistrationPage extends Page {
    private String txtEmail = ".//*[@id=\"login\"]";
    private String txtPassword = ".//*[@id=\"password\"]";
    private String txtRepeatPassword = ".//*[@id=\"password2\"]";
    private String txtUserName = ".//*[@id=\"name\"]";
    private String txtPhoneNumber = ".//*[@id=\"phone\"]";
    private String userRole1 = ".//*[@id=\"formx\"]/div[1]/div/div[1]/div[5]/div/div[2]/div[1]";
    private String userRole2 = ".//*[@id=\"formx\"]/div[1]/div/div[1]/div[5]/div/div[2]/div[2]";
    private String userRole3 = ".//*[@id=\"formx\"]/div[1]/div/div[1]/div[5]/div/div[2]/div[3]";
    private String userRole4 = ".//*[@id=\"formx\"]/div[1]/div/div[1]/div[5]/div/div[2]/div[4]";
    private String userRole5 = ".//*[@id=\"formx\"]/div[1]/div/div[1]/div[5]/div/div[2]/div[5]";
    private String userRole6 = ".//*[@id=\"formx\"]/div[1]/div/div[1]/div[5]/div/div[2]/div[6]";
    private String userRole7 = ".//*[@id=\"formx\"]/div[1]/div/div[1]/div[5]/div/div[2]/div[7]";
    private String driveExperience = "//*[@id=\"formx\"]/div[1]/div/div[2]/div[3]/div[1]/span";
    private String txtBirthDate = ".//*[@id=\"date\"]";
    private String txtFacebooLink = ".//*[@id=\"facebook_link\"]";
    private String txtInstagramLink = ".//*[@id=\"instagram_link\"]";
    private String buttonRegistration = ".id=\"formx\"]/div[2]/button/span";

    //  private String txtEmail = ".//*[@id=\"login\"]";
    public void openRegistrationPage() {
        driver.get("http://test.dirtmixer.com/signup");
        driver.manage().window().setSize(new Dimension(1600, 900));
        String currentWindow = driver.getWindowHandle();
        driver.switchTo().window(currentWindow);
    }

    public void fillLogin(String login) {                         //метод "ЗАПОЛНИТЬ ЛОГИН" получает на вход какй-то логин
        driver.findElement(By.xpath(txtEmail)).sendKeys(login);   //драйвер должен найти по икспасу элемент и передать в него этот сымый логин
    }

    public void fillPassword(String password) {
        driver.findElement(By.xpath(txtPassword)).sendKeys(password);
    }

    public void fillRepeatPassword(String password2) {
        driver.findElement(By.xpath(txtRepeatPassword)).sendKeys(password2);
    }

    public void fillUserName(String name) {
        driver.findElement(By.xpath(txtUserName)).sendKeys(name);
    }

    public void fillPhoneNumber(String phoneNumber) {
        driver.findElement(By.xpath(txtPhoneNumber)).sendKeys(phoneNumber);
    }

    public void choiseRole(String role) {
        driver.findElement(By.xpath(userRole1)).sendKeys(role);
    }

    public void fillBirthDate(String birthDate) {
        driver.findElement(By.xpath(txtBirthDate)).sendKeys(birthDate);
    }

    //место для заполнения "стажа водителя"
    //наличие прав водителя

    public void linkFacebook(String facebookLink) {
        driver.findElement(By.xpath(txtFacebooLink)).sendKeys(facebookLink);
    }

    public void linkInstagram(String instaLink) {
        driver.findElement(By.xpath(txtInstagramLink)).sendKeys(instaLink);
    }

    public void clickEnter() {
        driver.findElement(By.xpath(buttonRegistration)).click();
    }

}

