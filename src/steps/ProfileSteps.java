package steps;

import pages.ProfilePage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ProfileSteps {

    public ArrayList<String> verifyPersonalHeader(ArrayList<String> errorList) {
        String actualHeaderText = new ProfilePage().getHeaderText();
        String expectedHeaderText = "Create your free account to see rates";
        if (!actualHeaderText.contentEquals(expectedHeaderText)) {
            errorList.add("\nProfile header didn't match expecting\nActual: '" + actualHeaderText + "'" +
                    "\nExpected: '" + expectedHeaderText + "");
        }
        return errorList;
    }

    public void fillAllFields(){
        ProfilePage profilePage = new ProfilePage();
        profilePage.getFirstNameInput().sendKeys("Ihor");
        profilePage.getLastNameInput().sendKeys("Buhun");
        profilePage.getPrimaryPhoneNumberInput().sendKeys("1112223333");
        profilePage.getHousingStatusDD().get(1).click();
        profilePage.getPermanentAddressInput().sendKeys(
                "Ukraine");
        profilePage.getAddressHints().get(1).click();
        profilePage.getUnitInput().sendKeys("1");
        profilePage.getCitizenDD().get(1).click();
        profilePage.getSocialSecurityInput().sendKeys("123111234");
    }

    public void fillEmailAndPass(String email, String pass){
        ProfilePage profilePage = new ProfilePage();
        profilePage.getEmailInput().clear();
        profilePage.getEmailInput().sendKeys(email);
        profilePage.getPasswordInput().sendKeys(pass);
    }

    public String getEmail(String nick, String domain){
        String date = new Date().toString().substring(3, 10).replace(" ", "");
        DateFormat dateFormat = new SimpleDateFormat("HHmm");
        String time = dateFormat.format(new Date());
        return String.format("%s+%s+%s@%s.com", nick, date, time, domain);
    }

    public String getWrongEmail(String nick, String domain){
        String date = new Date().toString().substring(3, 10).replace(" ", "");
        DateFormat dateFormat = new SimpleDateFormat("HHmm");
        String time = dateFormat.format(new Date());
        return String.format("%s+%s+%s@%s.com", nick, date, time, domain);
    }

    public ArrayList<String> verifyPhoneTip(ArrayList<String> errorList) {
        ProfilePage profilePage = new ProfilePage();
        profilePage.clickPrimaryPhoneNumberTipLink();
        String actualTipText = profilePage.getTipText();
        String expectedTipText = "This helps our Client Success team provide more personalized service. We hate " +
                "telemarketing calls, so we never sell or rent your information. " +
                "Learn more about our privacy policies here.";
        if (!actualTipText.contentEquals(expectedTipText)) {
            errorList.add("\nPhone tip's text didn't match expecting\nActual: '" + actualTipText + "'" +
                    "\nExpected: '" + expectedTipText + "'");
        }
        profilePage.clickPrimaryPhoneNumberTipLink();
        return errorList;
    }

    public ArrayList<String> verifyCitizenTip(ArrayList<String> errorList) {
        ProfilePage profilePage = new ProfilePage();
        profilePage.clickCitizenTipLink();
        String actualTipText = profilePage.getTipText();
        String expectedTipText = "Providers require this information to determine eligibility for their products, " +
                "and to comply with the USA PATRIOT Act";
        if (!actualTipText.contentEquals(expectedTipText)) {
            errorList.add("\nCitizenship status tip's text didn't match expecting\nActual: '" + actualTipText + "'" +
                    "\nExpected: '" + expectedTipText + "'");
        }
        profilePage.clickCitizenTipLink();
        return errorList;
    }

    public ArrayList<String> verifySsnTip(ArrayList<String> errorList) {
        ProfilePage profilePage = new ProfilePage();
        profilePage.clickSocialSecurityTipLink();
        String actualTipText = profilePage.getTipText();
        String expectedTipText = "This is required by lenders to verify your identity and assess your credit history. " +
                "Your SSN is always encrypted when stored and transmitted. You can learn more about our security here.";
        if (!actualTipText.contentEquals(expectedTipText)) {
            errorList.add("\nSSN tip's text didn't match expecting\nActual: '" + actualTipText + "'" +
                    "\nExpected: '" + expectedTipText + "'");
        }
        profilePage.clickSocialSecurityTipLink();
        return errorList;
    }

    public ArrayList<String> verifyEmailErrorMsg(ArrayList<String> errorList) {
        ProfilePage profilePage = new ProfilePage();
        String actual = profilePage.getEmailErrorMsg();
        String expected = "Your email or password is incorrect. " +
                "Please try again or signup using a different email address.";
        if (!actual.contentEquals(expected)) {
            errorList.add("\nEmail' error msg text didn't match expecting\nActual: '" + actual + "'" +
                    "\nExpected: '" + expected + "'");
        }
        return errorList;
    }

    public void clickSubmit(){
        new ProfilePage().getAgreeAndFindMyRatesBtn().click();
    }

    public ArrayList<String> verifySpinnerIsShown(ArrayList<String> errorList){
        if(!new ProfilePage().getSpinner().isDisplayed()){
            errorList.add("\nSpinner wasn't shown");
        }
        return errorList;
    }
}
