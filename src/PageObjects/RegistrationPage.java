package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class RegistrationPage extends Page
{
    private String txtEmail = ".//*[@id=\"login\"]";
    private String txtPassword = ".//*[@id=\"password\"]";
    private String txtRepeatPassword = ".//*[@id=\"password2\"]";
    private String txtUserName = ".//*[@id=\"name\"]";
    private String txtPhoneNumber = ".//*[@id=\"phone\"]";
    private String txtBirthDate = ".//*[@id=\"date\"]";
    private String txtFacebooLink = ".//*[@id=\"facebook_link\"]";
    private String txtInstagramLink = ".//*[@id=\"instagram_link\"]";
    private String buttonRegistration = ".id=\"formx\"]/div[2]/button/span";
  //  private String txtEmail = ".//*[@id=\"login\"]";
    public void openRegistrationPage()
    {
        driver.get("http://test.dirtmixer.com/signup");
        driver.manage().window().setSize(new Dimension(1600, 900));
        String currentWindow = driver.getWindowHandle();
        driver.switchTo().window(currentWindow);
    }
    public void fillLogin(String login) { driver.findElement(By.xpath(txtEmail)).sendKeys(login); }

    public void fillPassword(String password){ driver.findElement(By.xpath(txtPassword)).sendKeys(password); }

    public void fillRepeatPassword(String password) { driver.findElement(By.xpath(txtRepeatPassword)).sendKeys(password); }

    public void fillUserName(String name) { driver.findElement(By.xpath(txtUserName)).sendKeys(name); }

    public void fillPhoneNumber(String phonenumber) { driver.findElement(By.xpath(txtPhoneNumber)).sendKeys(phonenumber); }

    public void fillBirthDate(String birthdate) { driver.findElement(By.xpath(txtBirthDate)).sendKeys(birthdate); }

    public void linkFacebook(String faceboooklink) { driver.findElement(By.xpath(txtFacebooLink)).sendKeys(faceboooklink); }

    public void linkInstagram(String instalink) { driver.findElement(By.xpath(txtInstagramLink)).sendKeys(instalink); }

            public void clickEnter(){
            driver.findElement(By.xpath(buttonRegistration)).click();
        }

    }

