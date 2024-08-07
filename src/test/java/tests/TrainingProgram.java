package tests;

import Actions.Dashboard;
import Actions.Login;
import Actions.Register;
import Actions.Training;
import WebElements.TrainingElements;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utile.BaseTest;
import utile.ConfigLoader;

public class TrainingProgram extends BaseTest {

private Login login = null;
private Dashboard dashboard = null;

private Register register = null;
private RegisterUser registerUser = null;
private Training training;

ConfigLoader configLoader = new ConfigLoader("src/test/resources/proprietati/dateUser1.properties");

@Test
    public void openTrainingTab() {

    initTest("Training program");
    login = new Login(driver);
    dashboard = new Dashboard(driver);
    register = new Register(driver);
    registerUser = new RegisterUser(); // instanta
    training = new Training(driver);

    login();

    dashboard.clickTrainingButton();
    training.clickGenerateProgramButton();

    String weekDay = configLoader.getProperty("weekDay");

    training.dragAndDropTrainingProgram(weekDay, configLoader.getProperty("trainingProgram") );

    Assert.assertTrue(training.trainingProgramOnWeekday(configLoader.getProperty("weekDay"),"legs").equalsIgnoreCase("legs"));

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
            register.registerUser(true, null , null, null);
        }
        Assert.assertTrue(dashboard.getUserEmailFromDashboard().equalsIgnoreCase(email));
        
        

}


}
