package steps;

import PageObjects.RegistrationPage;

public class RegistrationSteps extends GeneralSteps {

    public void openRegistrationPage() {
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.openRegistrationPage();
    }

    public void registration(String login, String password, String name, String role,
                             String phoneNumber, String birthDate, String facebookLink, String instaLink) {
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.fillLogin(login);
        registrationPage.fillPassword(password);
        registrationPage.fillRepeatPassword(password);
        registrationPage.fillUserName(name);
        registrationPage.choiseRole(role);//место для заполнения "роли"
        registrationPage.fillPhoneNumber(phoneNumber);
        registrationPage.fillBirthDate(birthDate);
        //место для заполнения "стажа водителя"
        //наличие прав водителя
        registrationPage.linkFacebook(facebookLink);
        registrationPage.linkInstagram(instaLink);
        registrationPage.clickEnter();


    }
}
