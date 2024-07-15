package tests;

import Actions.Dashboard;
import Actions.Login;
import Actions.Register;
import Actions.Training;
import org.testng.Assert;
import org.testng.annotations.Test;
import utile.BaseTest;
import utile.ConfigLoader;

public class CalendarTest extends BaseTest {

    private Login login = null;
    private Dashboard dashboard = null;

    private Register register = null;
   private String email = "";
   private String parola = "";

    @Test
    public void openDashboard() {

        initTest("Training program");
        login = new Login(driver);
        dashboard = new Dashboard(driver);
        register = new Register(driver);
        Training training = new Training(driver);

        ConfigLoader configLoader = new ConfigLoader("src/test/resources/proprietati/dateUser1.properties");
        ConfigLoader configLoaderDate  = new ConfigLoader("src/test/resources/proprietati/dateUser1.properties");
        String email = configLoader.getProperty("email");
        String password = configLoader.getProperty("password");

        login();

        dashboard.clickSpecificDay(configLoaderDate.getProperty("date"));

        dashboard.sendEventText(configLoaderDate.getProperty("eventText"));

        dashboard.clickCreateEventButton();

        Assert.assertTrue(dashboard.isEventPresent(configLoaderDate.getProperty("eventText")));


    }
    private void login() {

        ConfigLoader configLoader = new ConfigLoader("src/test/resources/proprietati/dateUser1.properties");
        String email = configLoader.getProperty("email");
        String password = configLoader.getProperty("password");

        login.setUsername(email);
        login.setPassword(password);
        login.submitButton();

        if(login.errorForbiddenAccessText())
        {
            login.clickRegisterButton();
            register.registerUser(true, null, null,null);
        }
        Assert.assertTrue(dashboard.getUserEmailFromDashboard().equalsIgnoreCase(email));



    }
}
