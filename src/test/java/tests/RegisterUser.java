package tests;

import Actions.Login;
import Actions.Register;
import org.testng.Assert;
import org.testng.annotations.Test;
import utile.BaseTest;

public class RegisterUser extends BaseTest {

    private Login login = null;
    private Register register = null;

    @Test
    public void registerUser()
    {
        initTest("Register User");
        driver.get("http://apptest.go.ro:9999/login");
        login = new Login(driver);
        register = new Register(driver); // actiunea
        login.clickRegisterButton();

        Assert.assertTrue(register.getSignUpText().equalsIgnoreCase("Sign Up"));

        // Input user
        register.setFirstname("Lucian");
        register.setLastname("Grozav");
        register.setPhoneNumber("0744163344");
        register.setEmail("luciangrozav01@gmail.com");
        register.setCity("Cluj-Napoca");
        register.password("blabla");
        register.trainer();

        // Click pe Sign Up button
        register.submit();

    }
}
