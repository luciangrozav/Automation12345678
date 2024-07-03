package tests;

import Actions.Dashboard;
import Actions.Login;
import Actions.Register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utile.BaseTest;
import utile.ConfigLoader;

import java.time.Duration;

public class LoginUser extends BaseTest {

    private Login login;
    private Dashboard dashboard;
    private Register register = null;


    @Test
    public void loginUser()
    {
        initTest("Login User");
//        driver.get("http://apptest.go.ro:9999/login");
        login = new Login(driver);
        dashboard = new Dashboard(driver);

        ConfigLoader configLoader = new ConfigLoader("src/test/resources/proprietati/dateUser1.properties");
        String email = configLoader.getProperty("email");
        String parola = configLoader.getProperty("parola");

        login.setUsername(email);
        login.setPassword(parola);
        login.submitButton();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='navigation__link userName']")));

        Assert.assertTrue(dashboard.getUserEmailFromDashboard().equalsIgnoreCase(email));


    }


}
