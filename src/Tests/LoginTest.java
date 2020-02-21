import generic.ChromeTestCase;
import org.testng.annotations.Test;
import steps.LoginSteps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends ChromeTestCase {

    @Test
    public void newTest() {
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.openLoginPage();
        loginSteps.login("igorbugun@gmail.com", "goftho39");
        assertEquals(driver.getCurrentUrl(), "http://www.dirtmixer.com");
    }

}
