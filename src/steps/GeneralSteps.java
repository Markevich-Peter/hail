package steps;

import pages.DragNDropPage;
import pages.PersonalLoans;
import pages.StartPage;

public class GeneralSteps {

    public void openStartPage(){
        new StartPage().openStartPage();
    }

    public void openPageAndDragNDrop(){
        DragNDropPage page = new DragNDropPage();
        page.openStartPage();
        page.dragNdropContainer();
        //page.dragdrop1();
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
