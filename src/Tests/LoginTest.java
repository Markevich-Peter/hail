import generic.ChromeTestCase;
import org.testng.annotations.Test;
import steps.LoginSteps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends ChromeTestCase {

    @Test
    public void loginTest() {
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.openLoginPage();
        try (InputStream input = new FileInputStream("TestData/UserAccounts.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            System.out.println(prop.getProperty("db.url"));
            System.out.println(prop.getProperty("db.user"));
            System.out.println(prop.getProperty("db.password"));

        } catch (IOException  ex) {
            ex.printStackTrace();
        }
        loginSteps.login("igorbugun@gmail.com", "goftho39");
        assertEquals(driver.getCurrentUrl(), "http://www.dirtmixer.com");
    }

}
