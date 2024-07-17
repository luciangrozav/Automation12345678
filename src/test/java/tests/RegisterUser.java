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
    public void registerUserTest()
    {
        initTest("Register User");
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        login = new Login(driver);
        register = new Register(driver);

        login.clickRegisterButtonOnLoginPage();
        Assert.assertTrue(register.getSignUpText().equalsIgnoreCase("Signing up is easy!"));

        register.registerUser();
        Assert.assertTrue(register.getSignUpText().equalsIgnoreCase("Welcome luci123"));

    }
}
