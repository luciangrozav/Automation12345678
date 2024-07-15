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

    public void setFirstname(String firstName) {
        elements.firstname().sendKeys(firstName);
    }

    public void setLastname(String lastName) {
        elements.lastname().sendKeys(lastName);
    }

    public void setAddress(String address) {
        elements.address().sendKeys(address);
    }

    public void setCity(String city) {
        elements.city().sendKeys(city);
    }

    public void password(String password) {
        elements.password().sendKeys(password);
    }

    public void setState(String state) {
        elements.state().sendKeys(state);
    }

    public void setZipCode(String zipCode) { elements.zipCode().sendKeys(zipCode); }

    public void setPhone(String phone) { elements.phone().sendKeys(phone);}

    public void setSsn(String ssn) { elements.ssn().sendKeys(ssn);}

    public void setUsername(String username) { elements.username().sendKeys(username);}

    public void setPassword(String password) { elements.password().sendKeys(password);}

    public void setConfirm(String confirm) { elements.confirm().sendKeys(confirm);}

    public void clickRegisterButton() { elements.register().click(); }

    public void registerUser()
    {

        configLoader = new ConfigLoader("src/test/resources/proprietati/dateUser1.properties");

        String firstName = configLoader.getProperty("firstName");
        String lastName = configLoader.getProperty("lastName");
        String address = configLoader.getProperty("address");
        String city = configLoader.getProperty("city");
        String state = configLoader.getProperty("state");
        String zipCode = configLoader.getProperty("zipCode");
        String phone = configLoader.getProperty("phone");
        String ssn = configLoader.getProperty("ssn");
        String username = configLoader.getProperty("username");
        String password = configLoader.getProperty("password");
        String confirm = configLoader.getProperty("confirm");

        // Input user
        setFirstname(firstName);
        setLastname(lastName);
        setAddress(address);
        setCity(city);
        setState(state);
        setZipCode(zipCode);
        setPhone(phone);
        setSsn(ssn);
        setUsername(username);
        setPassword(password);
        setConfirm(confirm);

        clickRegisterButton();
    }
}
