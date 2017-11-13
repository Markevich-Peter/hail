package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PersonalLoanRequest extends Page {

    private String header = "(//h3[@class='big-title'])[1]";
    private String loanPurposeBtn = "(//*[@class='select2-arrow'])[1]";
    private String loanPurposeDD = "//ul[@id=select2-results-5']/li";
    private String highestLevelOfCompletedEducation = "(//*[@class='select2-arrow'])[2]";
    private String currentEmploymentStatus = "(//*[@class='select2-arrow'])[3]";
    private String dateOfBirth = "(//h3[@class='big-title'])[1]";
    private String AnnualIncome = "(//h3[@class='big-title'])[1]";
    private String annualTipLink = "(//h3[@class='big-title'])[1]";
    private String annualTipText = "(//h3[@class='big-title'])[1]";
    private String estimateYourCreditScore = "(//*[@class='select2-arrow'])[4]";

    public String getHeaderText() {
        return webDriver.findElement(By.xpath(header)).getText();
    }

    public List<WebElement> getLoanPurposeDD() {
        webDriver.findElement(By.xpath(loanPurposeBtn)).click();
        return webDriver.findElements(By.xpath(loanPurposeDD));
    }
}
