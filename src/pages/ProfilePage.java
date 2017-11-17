package pages;

import ElementWrappers.LocatorFinder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProfilePage extends pages.Page{

    private String header = "(//h3[@class='big-title'])[1]";

    private String firstName = "c386_borrower_first_name";
    private String lastName = "c386_borrower_last_name";
    private String primaryPhoneNumberInput = "c386_borrower_phone";
    private String primaryPhoneNumberTipLink = "//label[@for='c386_borrower_phone']/../span[@class='tooltip-text']";
    private String primaryPhoneNumberTipText = "//*[@class='tooltip-inner']";
    private String housingStatusBtn = "(//*[@class='select2-arrow'])[1]";
    private String housingStatusDD = "//ul[@id='select2-results-331']/li";
    private String permanentAddress = "c386_current_address_full_address";
    private String unit = "c386_current_address_unit";
    private String citizenshipStatusBtn = "(//*[@class='select2-arrow'])[2]";
    private String citizenshipStatusDD = "//ul[@id='select2-results-333']/li";
    private String citizenshipStatusTipLink = "//label[@for='c386_borrower_citizenship_status']/../span[@class='tooltip-text']";
    //private String citizenshipStatusTipText = "//*[@class='tooltip-inner']";
    private String socialSecurityNumberInput = "c386_borrower_ssn";
    private String socialSecurityNumberTipLink = "//label[@for='c386_borrower_ssn']/../span[@class='tooltip-text']";
    //private String socialSecurityNumberTipText = "//*[@class='tooltip-inner']";
    private String email = "c477_email";
    private String password = "c477_password";
    private String agreeAndFindMyRatesBtn = "(//*[@class='cta cta-primary'])[2]";
    private String emailErrorMsg = "//*[@class='user-message user-message--error user-message--login-failed']";
    private String spinner = "//*[@class='loading-message four-lines']";

    public String getEmailErrorMsg(){
        return LocatorFinder.findElementByXpath(emailErrorMsg).getText();
    }

    public String getHeaderText() {
        return LocatorFinder.findElementByXpath(header).getText();
    }

    public String getTipText() {
        return LocatorFinder.findElementByXpath(primaryPhoneNumberTipText).getText();
    }

    public WebElement getFirstNameInput(){
        return LocatorFinder.findElementByID(firstName);
    }

    public WebElement getLastNameInput(){
        return LocatorFinder.findElementByID(lastName);
    }

    public WebElement getPrimaryPhoneNumberInput(){
        return LocatorFinder.findElementByID(primaryPhoneNumberInput);
    }

    public void clickPrimaryPhoneNumberTipLink(){
        LocatorFinder.findElementByXpath(primaryPhoneNumberTipLink).click();
    }

    public WebElement getHousingStatusBtn(){
        return LocatorFinder.findElementByXpath(housingStatusBtn);
    }

    public List<WebElement> getHousingStatusDD(){
        getHousingStatusBtn().click();
        return webDriver.findElements(By.xpath(housingStatusDD));
    }

    public WebElement getPermanentAddressInput(){
        return LocatorFinder.findElementByID(permanentAddress);
    }

    public WebElement getUnitInput(){
        return LocatorFinder.findElementByID(firstName);
    }

    public WebElement getCitizenBtn(){
        return LocatorFinder.findElementByXpath(citizenshipStatusBtn);
    }

    public List<WebElement> getCitizenDD(){
        getCitizenBtn().click();
        return webDriver.findElements(By.xpath(citizenshipStatusDD));
    }

    public void clickCitizenTipLink(){
        LocatorFinder.findElementByXpath(citizenshipStatusTipLink).click();
    }

    public WebElement getSocialSecurityInput(){
        return LocatorFinder.findElementByID(socialSecurityNumberInput);
    }

    public void clickSocialSecurityTipLink(){
        LocatorFinder.findElementByXpath(socialSecurityNumberTipLink).click();
    }

    public WebElement getEmailInput(){
        return LocatorFinder.findElementByID(email);
    }

    public WebElement getPasswordInput(){
        return LocatorFinder.findElementByID(password);
    }

    public WebElement getAgreeAndFindMyRatesBtn(){
        return LocatorFinder.findElementByXpath(agreeAndFindMyRatesBtn);
    }

    public WebElement getSpinner(){
        return LocatorFinder.findElementByXpath(spinner);
    }

}
