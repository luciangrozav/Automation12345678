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
        return driver.findElement(By.xpath("//a[@href='register.htm']"));
    }

    public WebElement loginButton()
    {
        return driver.findElement(By.xpath("//input[@value='Log In']"));
    }

    public WebElement logoutButton()
    {
        return driver.findElement(By.xpath("//a[@href='logout.htm']"));
    }

    public WebElement transferFundsButton()
    {
        return driver.findElement(By.xpath("//a[@href='transfer.htm']"));
    }

    public WebElement userName()
    {
        return driver.findElement(By.xpath("//input[@name='username']"));
    }

    public WebElement userPassword()
    {
        return driver.findElement(By.xpath("//input[@name='password']"));
    }

    public WebElement loginText() {
        return driver.findElement(By.xpath("//h2"));
    }

    public WebElement pageValidationTitle()
    {
        return driver.findElement(By.xpath("//h1[@class='title']"));
    }

    public WebElement amountValue()
    {
        return driver.findElement(By.xpath("//input[@id='amount']"));
    }

    public WebElement transferAmountButton()
    {
        return driver.findElement(By.xpath("//input[@value='Transfer']"));
    }

    public WebElement transferFundsText() {
        return driver.findElement(By.xpath("//h1"));
    }

    public WebElement billPayButton()
    {
        return driver.findElement(By.xpath("//a[@href='billpay.htm']"));
    }

    public WebElement payeeAccount()
    {
        return driver.findElement(By.xpath("//input[@name='payee.accountNumber']"));
    }

    public WebElement payeeVerifyAccount()
    {
        return driver.findElement(By.xpath("//input[@name='verifyAccount']"));
    }

    public WebElement amountBillPay()
    {
        return driver.findElement(By.xpath("//input[@name='amount']"));
    }

    public WebElement sendPaymentBillPayButton()
    {
        return driver.findElement(By.xpath("//input[@value='Send Payment']"));
    }

    public WebElement payeeName()
    {
        return driver.findElement(By.xpath("//input[@name='payee.name']"));
    }

    public WebElement payeeAddress()
    {
        return driver.findElement(By.xpath("//input[@name='payee.address.street']"));
    }

    public WebElement payeeCity()
    {
        return driver.findElement(By.xpath("//input[@name='payee.address.city']"));
    }

    public WebElement payeeState()
    {
        return driver.findElement(By.xpath("//input[@name='payee.address.state']"));
    }

    public WebElement payeeZipCode()
    {
        return driver.findElement(By.xpath("//input[@name='payee.address.zipCode']"));
    }

    public WebElement payeePhone()
    {
        return driver.findElement(By.xpath("//input[@name='payee.phoneNumber']"));
    }

    public WebElement billPaymentComplete() {
        return driver.findElement(By.xpath("//div[@id='billpayResult']//h1[@class='title']"));
    }

    public WebElement accountsOverview()
    {
        return driver.findElement(By.xpath("//a[@href='overview.htm']"));
    }

    public WebElement updateContactInfo()
    {
        return driver.findElement(By.xpath("//a[@href='updateprofile.htm']"));
    }

    public WebElement firstname()
    {
        return driver.findElement(By.id("customer.firstName"));
    }

    public WebElement firstnameForgotPassword()
    {
        return driver.findElement(By.id("firstName"));
    }

    public WebElement lastname()
    {
        return driver.findElement(By.id("customer.lastName"));
    }

    public WebElement lastnameForgotPassword()
    {
        return driver.findElement(By.id("lastName"));
    }

    public WebElement address()
    {
        return driver.findElement(By.id("customer.address.street"));
    }

    public WebElement addressForgotPassword()
    {
        return driver.findElement(By.id("address.street"));
    }

    public WebElement city()
    {
        return driver.findElement(By.id("customer.address.city"));
    }

    public WebElement cityForgotPassword()
    {
        return driver.findElement(By.id("address.city"));
    }

    public WebElement state()
    {
        return driver.findElement(By.id("customer.address.state"));
    }

    public WebElement stateForgotPassword()
    {
        return driver.findElement(By.id("address.state"));
    }

    public WebElement zipCode()
    {
        return driver.findElement(By.id("customer.address.zipCode"));
    }

    public WebElement zipCodeForgotPassword()
    {
        return driver.findElement(By.id("address.zipCode"));
    }

    public WebElement phone()
    {
        return driver.findElement(By.id("customer.phoneNumber"));
    }

    public WebElement ssn()
    {
        return driver.findElement(By.id("customer.ssn"));
    }

    public WebElement ssnForgotPassword()
    {
        return driver.findElement(By.id("ssn"));
    }

    public WebElement updateProfileTitle() { return driver.findElement(By.xpath("//*[@id=\"updateProfileForm\"]/h1"));}

    public WebElement updateProfileButton() { return driver.findElement(By.xpath("//input[@value='Update Profile']"));}

    public WebElement profileUpdatedSuccessfullyTitle() { return driver.findElement(By.xpath("//*[@id=\"updateProfileResult\"]/h1"));}

    public WebElement openNewAccount()
    {
        return driver.findElement(By.xpath("//a[@href='openaccount.htm']"));
    }

    public WebElement typeNewAccount()
    {
        return driver.findElement(By.id("type"));
    }

    public WebElement openNewAccountButton() { return driver.findElement(By.xpath("//input[@value='Open New Account']"));}

    public WebElement openNewAccountOption() { return driver.findElement(By.xpath("//a[@href='openaccount.htm']"));}

    public WebElement newAccountOpenedText() { return driver.findElement(By.xpath("//*[@id=\"openAccountResult\"]/p[1]"));}

    public WebElement openNewAccountPageText() { return driver.findElement(By.xpath("//*[@id=\"openAccountForm\"]/h1"));}

    public WebElement forgotPasswordOption()
    {
        return driver.findElement(By.xpath("//a[@href='lookup.htm']"));
    }

    public WebElement forgotPasswordText() { return driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[1]/a"));}

    public WebElement findMyLoginInfoButton() { return driver.findElement(By.xpath("//input[@value='Find My Login Info']"));}

    public WebElement forgotPasswordValidationText() { return driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p[1]"));}

    public WebElement accountsOverviewPageText() { return driver.findElement(By.xpath("//*[@id=\"showOverview\"]/h1"));}

    public WebElement transferFundsPageText() { return driver.findElement(By.xpath("//*[@id=\"showForm\"]/h1"));}

    public WebElement billPayPageText() { return driver.findElement(By.xpath("//*[@id=\"billpayForm\"]/h1"));}

    public WebElement findTransactionsOption()
    {
        return driver.findElement(By.xpath("//a[@href='findtrans.htm']"));
    }

    public WebElement findTransactionsPageText() { return driver.findElement(By.xpath("//*[@id=\"formContainer\"]/h1"));}

    public WebElement requestLoanOption()
    {
        return driver.findElement(By.xpath("//a[@href='requestloan.htm']"));
    }

    public WebElement requestLoanPageText() { return driver.findElement(By.xpath("//*[@id=\"requestLoanForm\"]/h1"));}

}
