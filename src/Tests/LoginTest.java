import generic.ChromeTestCase;
import org.testng.annotations.Test;
import steps.LoginSteps;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static org.testng.Assert.assertEquals;

public class LoginTest extends ChromeTestCase {

    @Test
    public void loginTest() {
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.openLoginPage();
        String login = "";
        String password = "";
        try (InputStream input = new FileInputStream("TestData/UserAccounts.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            prop.getProperty("db.url");
            login = prop.getProperty("Grad.user");
            password = prop.getProperty("Grad.password");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        loginSteps.login(login, password);
        assertEquals(driver.getCurrentUrl(), "http://www.dirtmixer.com");
    }

}
