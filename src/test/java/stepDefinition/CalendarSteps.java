package stepDefinition;

import Actions.Dashboard;
import Actions.Login;
import Actions.Register;
import Actions.Training;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utile.BaseTest;
import utile.ConfigLoader;

public class CalendarSteps extends BaseTest {

    @Before
    public void beforeScenario()
    {
        setupClass();
        initTest("Cucumber Calendar Test");
    }

    @After
    public void afterScenario()
    {
        tearDown();
    }

    private Login login = null;
    private Dashboard dashboard = null;

    private Register register;
    private String email = "";
    private String parola = "";

    @Given("User is logged in with email {string}, password {string}, and phone number {string}")
    public void user_is_logged_in_with_email_password_and_phone_number(String email, String password, String phoneNumber) {

        initTest("Training program");
        login = new Login(driver);
        dashboard = new Dashboard(driver);
        register = new Register(driver);
        Training training = new Training(driver);

        login(email, password, phoneNumber);


    }
    @When("User navigates to the specific day {string}")
    public void user_navigates_to_the_specific_day(String date) {
dashboard.clickSpecificDay(date);
    }
    @And("User creates a new event {string}")
    public void user_creates_a_new_event(String eventText) {
        dashboard.sendEventText(eventText);
        dashboard.clickCreateEventButton();
    }
    @Then("The event {string} is present in the calendar")
    public void the_event_is_present_in_the_calendar(String eventText) {
Assert.assertTrue(dashboard.isEventPresent(eventText + 1), "Event text is now the same");
    }

    private void login(String email, String password, String phoneNumber) {

        login.setUsername(email);
        login.setPassword(password);
        login.submitButton();

        if(login.errorForbiddenAccessText())
        {
            login.clickRegisterButton();
            register.registerUser(true, email, password, phoneNumber);
        }
        Assert.assertTrue(dashboard.getUserEmailFromDashboard().equalsIgnoreCase(email));



    }
}
