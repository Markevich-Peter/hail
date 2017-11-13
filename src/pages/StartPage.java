package pages;

import org.openqa.selenium.By;

public class StartPage extends Page{

    String url = "https://www.credible.com//?optimizely_disable=true";

    private String personalLoansLink = "//a[contains(text(), 'Personal Loans')]";

    public void openStartPage(){
        webDriver.manage().window().maximize();
        webDriver.get(url);
    }

    public void clickPersonalLoansLink(){
        webDriver.findElement(By.xpath(personalLoansLink)).click();
    }
}
