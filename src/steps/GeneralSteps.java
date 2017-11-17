package steps;

import pages.PersonalLoans;
import pages.StartPage;

public class GeneralSteps {

    public void openStartPage(){
        new StartPage().openStartPage();
    }

    public void getToPersonalLoan() {
        new StartPage().clickPersonalLoansLink();
    }

    public void findMyRate(String rate) {
        PersonalLoans personalLoans = new PersonalLoans();
        personalLoans.enterLoanAmount(rate);
        personalLoans.clickFindMyRateButton();
    }
}
