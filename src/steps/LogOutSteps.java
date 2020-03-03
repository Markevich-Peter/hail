package steps;

import PageObjects.LogOutPage;

public class LogOutSteps  extends GeneralSteps{         // Шаги проверки по выходу из аккаунта

   public void openLoginpage() {
       LogOutPage profilePage = new LogOutPage();          // Открыть страницу LoginPage
       profilePage.openLoginPage();
   }

   public void login(String login, String password) {     // Заполнить поля на
           LogOutPage loginPage = new LogOutPage();         // Нажать Enter
           loginPage.fillLogin(login);
           loginPage.fillPassword(password);
           loginPage.clickEnter();
       }
       public void logOut() {                             // выйти из аккаунта

           LogOutPage loginPage =  new LogOutPage();
           loginPage.clickLogOut();
   }
}



