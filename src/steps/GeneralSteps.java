package steps;

import pages.PersonalLoanRequest;
import pages.PersonalLoans;
import pages.StartPage;

import java.util.ArrayList;
import java.util.List;

public class GeneralSteps {

    public void getToPersonalLoan() {
        StartPage startPage = new StartPage();
        startPage.openStartPage();
        startPage.clickPersonalLoansLink();
    }

    public void findMyRate(String rate) {
        PersonalLoans personalLoans = new PersonalLoans();
        personalLoans.enterLoanAmount(rate);
        personalLoans.clickFindMyRateButton();
    }

    public List<String> verifyPersonalHeader(ArrayList<String> errorList) {
        PersonalLoanRequest personalLoanRequest = new PersonalLoanRequest();
        personalLoanRequest.waitForPageLoad();
        String headerText = personalLoanRequest.getHeaderText();
        if (!headerText.contentEquals("Compare personal loan rates from multiple providers in 2 minutes")) {
            errorList.add("personal Header didn't match expecting\nActual: '" + headerText + "'");
        }
        return errorList;
    }

    public void fillAllFields(){
        PersonalLoanRequest personalLoanRequest = new PersonalLoanRequest();
        personalLoanRequest.getLoanPurposeDD().get(1).click();
    }
}
