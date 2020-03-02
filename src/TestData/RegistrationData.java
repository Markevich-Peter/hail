package TestData;

import java.security.SecureRandom;
import java.util.Date;

import Objects.Role;
import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Locale;
import java.util.Random;

@Getter
@Setter
public class RegistrationData {

    String name;
    String email;
    String password;
    String role;
    String phone;
    Date dateOfBirth;
    int yearsExperience;
    boolean driveLicenseA;
    String linkFaceBook;
    String linkInstagram;

    final char[] possibleCharacters =
            ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?")
            .toCharArray();
    Faker faker = new Faker();
    FakeValuesService fakeValuesService = new FakeValuesService(new Locale("en-GB"), new RandomService());

    public RegistrationData() {

    }

    public void setName() {
        this.name = faker.name().fullName();
    }

    public void setEmail() {
        this.email = fakeValuesService.bothify(name + "##@gmail.com");
    }

    public void setPassword() {
        this.password = RandomStringUtils.random( 8, 0, possibleCharacters.length-1, false,
                false, possibleCharacters, new SecureRandom() );
    }

    public void setRole() {
        this.role = Role.STUDENT.toString();
    }

    public void setPhone() {
        this.phone = faker.phoneNumber().cellPhone();
    }

    public void setDateOfBirth() {
        this.dateOfBirth = faker.date().between(new Date(1900,01,01),new Date());
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = new Random(20).nextInt();
    }

    public void setDriveLicenseA(boolean driveLicenseA) {
        this.driveLicenseA = new Random().nextBoolean();
    }

    public void setLinkFaceBook() {
        this.linkFaceBook = fakeValuesService.regexify(
                "(?:http:\\/\\/)?(?:www.)?facebook.com\\/(?:(?:\\w)*#!\\/)?(?:pages\\/)?(?:[?\\w\\-]*\\/)?(?:profile.php\\?id=(\\d.*))?([\\w\\-]*)?");
    }

    public void setLinkInstagram() {
        this.linkInstagram = fakeValuesService.regexify(
                "(?:http:\\/\\/)?(?:www.)?instagram.com\\/(?:(?:\\w)*#!\\/)?(?:pages\\/)?(?:[?\\w\\-]*\\/)?(?:profile.php\\?id=(\\d.*))?([\\w\\-]*)?");
    }
}
