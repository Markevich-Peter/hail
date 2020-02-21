package PageObjects;

import ElementWrappers.LocatorFinder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProfilePage extends PageObjects.Page{

    private String header = "(//h3[@class='big-title'])[2]";

    private String firstName = "//*[contains(@id, 'borrower_first_name')]";
    private String lastName = "//*[contains(@id, 'borrower_last_name')]";
    private String primaryPhoneNumberInput = "//*[contains(@id, 'borrower_phone')]";
    private String primaryPhoneNumberTipLink = "//label[contains(@for,'borrower_phone')]/../span[@class='tooltip-text']";
    private String primaryPhoneNumberTipText = "//*[@class='tooltip-inner']";
    private String housingStatusBtn = "(//*[@class='select2-arrow'])[5]";
    private String housingStatusDD = "//ul[@id='select2-results-9']/li";
    private String permanentAddress = "//*[contains(@id, 'current_address_full_address')]";
    private String addressHints = "//div[@class='pac-item']";
    private String unit = "//*[contains(@id, 'current_address_unit')]";
    private String citizenshipStatusBtn = "(//*[@class='select2-arrow'])[7]";
    private String citizenshipStatusDD = "//ul[@id='select2-results-11']/li";
    private String citizenshipStatusTipLink = "//label[contains(@for,'borrower_citizenship_status')]/../span[@class='tooltip-text']";
    private String socialSecurityNumberInput = "//*[contains(@id, 'borrower_ssn')]";
    private String socialSecurityNumberTipLink = "//label[contains(@for,'borrower_ssn')]/../span[@class='tooltip-text']";
    private String email = "//*[contains(@id, 'email')]";
    private String password = "//*[contains(@id, 'password')]";
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
        return LocatorFinder.findElementByXpath(firstName);
    }

    public WebElement getLastNameInput(){
        return LocatorFinder.findElementByXpath(lastName);
    }

    public WebElement getPrimaryPhoneNumberInput(){
        return LocatorFinder.findElementByXpath(primaryPhoneNumberInput);
    }

    public void clickPrimaryPhoneNumberTipLink(){
        LocatorFinder.findElementByXpath(primaryPhoneNumberTipLink).click();
    }

    public WebElement getHousingStatusBtn(){
        return LocatorFinder.findElementByXpath(housingStatusBtn);
    }

    public List<WebElement> getHousingStatusDD(){
        getHousingStatusBtn().click();
        return driver.findElements(By.xpath(housingStatusDD));
    }

    public WebElement getPermanentAddressInput(){
        return LocatorFinder.findElementByXpath(permanentAddress);
    }

    public List<WebElement> getAddressHints(){
        return driver.findElements(By.xpath(addressHints));
    }

    public WebElement getUnitInput(){
        return LocatorFinder.findElementByXpath(unit);
    }

    public WebElement getCitizenBtn(){
        return LocatorFinder.findElementByXpath(citizenshipStatusBtn);
    }

    public List<WebElement> getCitizenDD(){
        getCitizenBtn().click();
        return driver.findElements(By.xpath(citizenshipStatusDD));
    }

    public void clickCitizenTipLink(){
        LocatorFinder.findElementByXpath(citizenshipStatusTipLink).click();
    }

    public WebElement getSocialSecurityInput(){
        return LocatorFinder.findElementByXpath(socialSecurityNumberInput);
    }

    public void clickSocialSecurityTipLink(){
        LocatorFinder.findElementByXpath(socialSecurityNumberTipLink).click();
    }

    public WebElement getEmailInput(){
        return LocatorFinder.findElementByXpath(email);
    }

    public WebElement getPasswordInput(){
        return LocatorFinder.findElementByXpath(password);
    }

    public WebElement getAgreeAndFindMyRatesBtn(){
        return LocatorFinder.findElementByXpath(agreeAndFindMyRatesBtn);
    }

    public WebElement getSpinner(){
        return LocatorFinder.findElementByXpath(spinner);
    }

}
