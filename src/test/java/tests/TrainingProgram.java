package tests;

import Actions.Dashboard;
import Actions.Login;
import Actions.Register;
import Actions.Training;
import WebElements.TrainingElements;
import org.testng.annotations.Test;
import utile.BaseTest;

public class TrainingProgram extends BaseTest {

private Login login = null;
private Dashboard dashboard = null;
private Register register = null;
private RegisterUser registerUser = null;
private Training training;


@Test
    public void openTrainingTab() {

    initTest("Training program");
    login = new Login(driver);
    dashboard = new Dashboard(driver);
    register = new Register(driver);
    registerUser = new RegisterUser(); // instanta
    training = new Training(driver);

    login();

}

    private void login() {

        login.setUsername("luciangrozav01@gmail.com");
        login.setPassword("blabla");
        login.submitButton();

        dashboard.clickTrainingButton();

        training.clickGenerateProgramButton();

}
}
