package steps;

import PageObjects.PersonalLoanRequestPage;

import java.util.ArrayList;

public class PersonalLoanRequestSteps {

    public ArrayList<String> verifyPersonalHeader(ArrayList<String> errorList) {
        String actualHeaderText = new PersonalLoanRequestPage().getHeaderText();
        String expectedHeaderText = "Compare personal loan rates from multiple providers in 2 minutes";
        if (!actualHeaderText.contentEquals(expectedHeaderText)) {
            errorList.add("personal Header didn't match expecting\nActual: '" + actualHeaderText + "'" +
                    "\nExpected: '" + expectedHeaderText + "");
        }
        return errorList;
    }

    public void fillAllFields(){
        PersonalLoanRequestPage personalLoanRequestPage = new PersonalLoanRequestPage();
        personalLoanRequestPage.getLoanPurposeDD().get(1).click();
        personalLoanRequestPage.getHighestLevelOfCompletedEducationDD().get(1).click();
        personalLoanRequestPage.getCurrentEmploymentStatusDD().get(1).click();
        personalLoanRequestPage.getDateOfBirthInput().sendKeys("07/12/1987");
        personalLoanRequestPage.getAnnualIncomeInput().sendKeys("5");
        personalLoanRequestPage.getEstimateYourCreditScoreDD().get(1).click();
    }

    public ArrayList<String> verifyAnnualTip(ArrayList<String> errorList) {
        PersonalLoanRequestPage personalLoanRequestPage = new PersonalLoanRequestPage();
        personalLoanRequestPage.clickAnnualTipLink();
        String actualTipText = personalLoanRequestPage.getAnnualTipText();
        String expectedTipText = "This should be your individual income. Do not include income from your " +
                "spouse or other household members. Alimony, child support or separate maintenance income need " +
                "not be disclosed unless you want them considered as a basis for repaying this loan.";
        if (!actualTipText.contentEquals(expectedTipText)) {
            errorList.add("\nAnnual income tip's text didn't match expecting\nActual: '" + actualTipText + "'" +
                    "\nExpected: '" + expectedTipText + "'");
        }
        return errorList;
    }

    public ProfileSteps clickContinue(){
        return new PersonalLoanRequestPage().clickContinueBtn();
    }
}
