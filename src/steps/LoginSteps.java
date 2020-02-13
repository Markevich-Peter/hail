package steps;

import PageObjects.LoginPage;

public class LoginSteps extends GeneralSteps {

    public void openLoginPage(){
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
    }

    public void login(String login, String password){
        LoginPage loginPage = new LoginPage();
        loginPage.fillLogin(login);
        loginPage.fillPassword(password);
        loginPage.clickEnter();
    }
}
