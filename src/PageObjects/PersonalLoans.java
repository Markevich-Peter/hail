package PageObjects;

import org.openqa.selenium.By;

public class PersonalLoans extends Page {

    private String findMyRateInput = "c66_loan_amount";
    private String findMyRateButton = "(//div[@class='extended-find-my-rate']/button)[1]";

    public void enterLoanAmount(String amount){
        driver.findElement(By.id(findMyRateInput)).sendKeys(amount);
    }

    public void clickFindMyRateButton() {
        driver.findElement(By.xpath(findMyRateButton)).click();
    }
}