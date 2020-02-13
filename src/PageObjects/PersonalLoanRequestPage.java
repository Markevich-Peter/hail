package PageObjects;

import ElementWrappers.LocatorFinder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import steps.ProfileSteps;

import java.util.List;

public class PersonalLoanRequestPage extends Page {

    private String header = "(//h3[@class='big-title'])[1]";

    private String loanPurposeBtn = "(//*[@class='select2-arrow'])[1]";
    private String loanPurposeDD = "//ul[@id='select2-results-5']/li";

    private String highestLevelOfCompletedEducationBtn = "(//*[@class='select2-arrow'])[2]";
    private String highestLevelOfCompletedEducationDD = "//ul[@id='select2-results-6']/li";

    private String currentEmploymentStatusBtn = "(//*[@class='select2-arrow'])[3]";
    private String currentEmploymentStatusDD = "//ul[@id='select2-results-7']/li";

    private String dateOfBirthBtn = "c164_borrower_dob";

    private String annualIncomeInput = "c164_employment_income_yearly";
    private String annualTipLink = "(//span[@class='tooltip-text'])[1]";
    private String annualTipText = "//*[@class='tooltip-inner']";

    private String estimateYourCreditScoreBtn = "(//*[@class='select2-arrow'])[4]";
    private String estimateYourCreditScoreDD = "//ul[@id='select2-results-8']/li";

    private String continueBtn = "//*[@class='next-step']";

    public String getHeaderText() {
        return LocatorFinder.findElementByXpath(header).getText();
    }

    public List<WebElement> getLoanPurposeDD() {
        LocatorFinder.findElementByXpath(loanPurposeBtn).click();
        return driver.findElements(By.xpath(loanPurposeDD));
    }

    public List<WebElement> getHighestLevelOfCompletedEducationDD() {
        LocatorFinder.findElementByXpath(highestLevelOfCompletedEducationBtn).click();
        return driver.findElements(By.xpath(highestLevelOfCompletedEducationDD));
    }

    public List<WebElement> getCurrentEmploymentStatusDD() {
        LocatorFinder.findElementByXpath(currentEmploymentStatusBtn).click();
        return driver.findElements(By.xpath(currentEmploymentStatusDD));
    }

    public WebElement getDateOfBirthInput() {
        return LocatorFinder.findElementByID(dateOfBirthBtn);
    }

    public WebElement getAnnualIncomeInput() {
        return LocatorFinder.findElementByID(annualIncomeInput);
    }

    public void clickAnnualTipLink() {
        LocatorFinder.findElementByXpath(annualTipLink).click();
    }

    public String getAnnualTipText() {
        return LocatorFinder.findElementByXpath(annualTipText).getText();
    }

    public List<WebElement> getEstimateYourCreditScoreDD() {
        LocatorFinder.findElementByXpath(estimateYourCreditScoreBtn).click();
        return driver.findElements(By.xpath(estimateYourCreditScoreDD));
    }

    public ProfileSteps clickContinueBtn(){
        LocatorFinder.findElementByXpath(continueBtn).click();
        return new ProfileSteps();
    }
}
