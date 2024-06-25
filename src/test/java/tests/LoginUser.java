package tests;

import Actions.Login;
import Actions.Register;
import org.testng.Assert;
import org.testng.annotations.Test;
import utile.BaseTest;

public class LoginUser extends BaseTest {

    private Login login;

    @Test
    public void loginUser()
    {
        initTest("Login User");
        driver.get("http://apptest.go.ro:9999/login");
        login = new Login(driver);

        login.loginButton();
        Assert.assertTrue(login.getLoginText().equalsIgnoreCase("Login"));

        // input
        login.setUsername("luciangrozav01@gmail.com");
        login.setPassword("blabla");

        // output
        login.submitButton();

    }


}
