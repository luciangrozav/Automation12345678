package Actions;

import WebElements.RegisterElements;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import utile.ConfigLoader;

public class Register {

    private RegisterElements elements = null;
    private Wait<WebDriver> wait;
    private ConfigLoader configLoader;

    public Register(WebDriver driver)
    {
        elements = new RegisterElements(driver);
    }

    public String getSignUpText()
    {
        return elements.signUpText().getText();
    }

    public void setFirstname(String username) {
        elements.firstname().sendKeys(username);
    }

    public void setLastname(String lastname) {
        elements.lastname().sendKeys(lastname);
    }

    public void setPhoneNumber(String phoneNumber) {
        elements.phonenumber().sendKeys(phoneNumber);
    }

    public void password(String password) {
        elements.password().sendKeys(password);
    }

    public void setEmail(String email) {
        elements.email().sendKeys(email);
    }

    public void setCity(String city) {
        elements.city().sendKeys(city);
    }

    public void customer() {
        elements.customer().click();
    }

    public void trainer() {
        elements.trainer().click();
    }

    public void clickSubmitButton() {
        elements.submit().click();
    }

    public void registerUser(boolean isTrainer, String email, String password, String phoneNumber)
    {

        configLoader = new ConfigLoader("src/test/resources/proprietati/dateUser1.properties");
        String firstName = configLoader.getProperty("firstName");
        String lastName = configLoader.getProperty("lastName");
//        String numarTelefon = configLoader.getProperty("numarTelefon");
//        String email = configLoader.getProperty("email");
        String city = configLoader.getProperty("city");
//        String parola = configLoader.getProperty("parola");

        // Input user
        setFirstname(firstName);
        setLastname(lastName);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setCity(city);
        password(password);

        if (isTrainer)
        {
            trainer();
        } else {
            customer();
        }

        // Click pe Sign Up button
        clickSubmitButton();
    }
}
