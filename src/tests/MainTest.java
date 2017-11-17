package tests;

import generic.ChromeTestCase;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.GeneralSteps;
import steps.PersonalLoanRequestSteps;
import steps.ProfileSteps;

import java.util.ArrayList;

public class MainTest extends ChromeTestCase{

    @Test()
    public void test() {
        GeneralSteps generalSteps = new GeneralSteps();
        generalSteps.openStartPage();
        generalSteps.getToPersonalLoan();
        generalSteps.findMyRate("15000");

        PersonalLoanRequestSteps personalLoanRequestSteps = new PersonalLoanRequestSteps();
        ArrayList<String> errorList = new ArrayList<String>();
        errorList = personalLoanRequestSteps.verifyPersonalHeader(errorList);
        personalLoanRequestSteps.fillAllFields();
        errorList = personalLoanRequestSteps.verifyAnnualTip(errorList);
        ProfileSteps profileSteps = personalLoanRequestSteps.clickContinue();

        errorList = profileSteps.verifyPersonalHeader(errorList);
        profileSteps.fillAllFields();
        errorList = profileSteps.verifyCitizenTip(errorList);
        errorList = profileSteps.verifySsnTip(errorList);
        errorList = profileSteps.verifyPhoneTip(errorList);

        String email = profileSteps.getEmail("Ihor", "gmail");
        String pass = "123456Aa";
        profileSteps.fillEmailAndPass(email, pass);
        profileSteps.clickSubmit();

        errorList = profileSteps.verifySpinnerIsShown(errorList);

        Assert.assertTrue(errorList.isEmpty(), errorList.toString());
    }
}
