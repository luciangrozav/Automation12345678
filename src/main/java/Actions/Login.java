package Actions;

import WebElements.LoginElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

    private LoginElements element = null;

    public Login(WebDriver driver) {
        this.element = new LoginElements(driver);
    }
    public void clickRegisterButton()
    {
        element.registerButton().click();
    }

    public void setUsername(String username) {
        element.userEmail().sendKeys(username);
    }

    public void setPassword(String password) {
        element.userPassword().sendKeys(password);
    }

    public void submitButton()
    {
        element.submitButton().click();
    }

    public String getLoginText()
    {
        return element.loginText().getText();
    }

    public void loginButton()
    {
        element.loginButton().click();
    }
}