package tests;

import generic.ChromeTestCase;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.GeneralSteps;

import java.util.ArrayList;

public class MainTest extends ChromeTestCase{

    @Test()
    public void test() {
        GeneralSteps generalSteps = new GeneralSteps();
        generalSteps.getToPersonalLoan();
        generalSteps.findMyRate("15000");
        ArrayList<String> errorList = new ArrayList<String>();
        generalSteps.verifyPersonalHeader(errorList);
        Assert.assertTrue(errorList.isEmpty(), errorList.toString());
    }
}
