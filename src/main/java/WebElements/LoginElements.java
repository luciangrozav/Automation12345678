package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginElements {

    private WebDriver driver = null;

    public LoginElements(WebDriver driver)
    {
        this.driver = driver;
    }

    public WebElement registerButton()
    {
        return driver.findElement(By.cssSelector(".navigation__link.register"));
    }

    public WebElement loginButton()
    {
        return driver.findElement(By.cssSelector(".navigation__link.login"));
    }

    public WebElement userEmail()
    {
        return driver.findElement(By.cssSelector("#userEmail"));
    }

    public WebElement userPassword()
    {
        return driver.findElement(By.cssSelector("#userPassword"));
    }

    public WebElement submitButton()
    {
        return driver.findElement(By.cssSelector("#submitButton"));
    }

    public WebElement loginText() {
        return driver.findElement(By.xpath("//h2"));
    }

}
