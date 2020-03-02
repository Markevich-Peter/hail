import generic.ChromeTestCase;
import org.testng.annotations.Test;
import steps.RegistrationSteps;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

public class RegistrationTest extends ChromeTestCase {
    @Test                                                               //Сам тест
    public void Test() {
        RegistrationSteps regTest = new RegistrationSteps();
        regTest.openRegistrationPage();

        String email = "";
        String password = "";
        String password2 = "";
        String name = "";
        // String role = "";
        String phonenumber = "";
        String birthdate = "";
        //  String
        //  String
        String facebook = "";
        String instagram = "";


        try (InputStream input = new FileInputStream("src/TestData/PeterAccounts.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            //   prop.getProperty("db.url");
            email = prop.getProperty("Peter.user");
            password = prop.getProperty("Peter.password");
            password2 = prop.getProperty("Peter.password2");
            name = prop.getProperty("Peter.name");
            phonenumber = prop.getProperty("Peter.number");
            birthdate = prop.getProperty("Peter.date");
            facebook = prop.getProperty("Peter.facebook");
            instagram = prop.getProperty("Peter.instagram");

        } catch (IOException ex) {
            ex.printStackTrace();


        }
            regTest.registration(email, password, password2, name, phonenumber, birthdate, facebook, instagram);     //здесь используется метод login из LoginSteps
        assertEquals(driver.getCurrentUrl(), "http://www.dirtmixer.com");
    }
}