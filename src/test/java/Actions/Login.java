package Actions;

import WebElements.LoginElements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {

    private LoginElements element = null;
    private Wait<WebDriver> wait;

    public Login(WebDriver driver) {

        this.element = new LoginElements(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void clickRegisterButtonOnLoginPage()
    {
        element.registerButton().click();
    }

    public void setUsername(String username) {
        element.userName().sendKeys(username);
    }

    public void setPassword(String password) {
        element.userPassword().sendKeys(password);
    }

    public String getLoginText()
    {
        return element.loginText().getText();
    }

    public String getPageValidationTitle() {return element.pageValidationTitle().getText(); }

    public void clickLoginButton()
    {
        element.loginButton().click();
    }

    public void clickLogoutButton()
    {
        element.logoutButton().click();
    }

    public void clickTransferFundsButton()
    {
        element.transferFundsButton().click();
    }

    public void setAmountValue(String amountValueSum) {
        element.amountValue().sendKeys((amountValueSum));
    }

    public void clickTransferAmountButton()
    {
        element.transferAmountButton().click();
    }

    public String getTransferFundsText()
    {
        return element.transferFundsText().getText();
    }

    public void clickBillPayButton()
    {
        element.billPayButton().click();
    }

    public void setPayeeAccount(String account) {
        element.payeeAccount().sendKeys((account));
    }

    public void setPayeeVerifyAccount(String verifyAccount) {
        element.payeeVerifyAccount().sendKeys((verifyAccount));
    }

    public void setAmountBillPay(String amountBillPay) {
        element.amountBillPay().sendKeys((amountBillPay));
    }

    public void clickSendPaymentBillPayButton()
    {
        element.sendPaymentBillPayButton().click();
    }

    public void setPayeeName(String name) {
        element.payeeName().sendKeys((name));
    }

    public void setPayeeAddress(String payeeAddress) {
        element.payeeAddress().sendKeys((payeeAddress));
    }

    public void setPayeeCity(String payeeCity) {
        element.payeeCity().sendKeys((payeeCity));
    }

    public void setPayeeState(String payeeState) {
        element.payeeState().sendKeys((payeeState));
    }

    public void setPayeeZipCode(String payeeZipCode) {
        element.payeeZipCode().sendKeys((payeeZipCode));
    }

    public void setPayeePhone(String payeePhone) {
        element.payeePhone().sendKeys((payeePhone));
    }

    public String getBillPaymentText()
    {
        return element.billPaymentComplete().getText();
    }

    public void clickAccountsOverviewButton()
    {
        element.accountsOverview().click();
    }

    public void clickUpdateContactInfo()
    {
        element.updateContactInfo().click();
    }

    public void setFirstname(String firstName) {
        element.firstname().sendKeys(firstName);
    }

    public void setFirstnameForgotPassword(String firstName) {
        element.firstnameForgotPassword().sendKeys(firstName);
    }

    public void setLastname(String lastName) {
        element.lastname().sendKeys(lastName);
    }

    public void setLastnameForgotPassword(String lastName) {
        element.lastnameForgotPassword().sendKeys(lastName);
    }

    public void setAddress(String address) {
        element.address().sendKeys(address);
    }

    public void setAddressForgotPassword(String address) {
        element.addressForgotPassword().sendKeys(address);
    }

    public void setCity(String city) {
        element.city().sendKeys(city);
    }

    public void setCityForgotPassword(String city) {
        element.cityForgotPassword().sendKeys(city);
    }

    public void setState(String state) {
        element.state().sendKeys(state);
    }

    public void setStateForgotPassword(String state) {
        element.stateForgotPassword().sendKeys(state);
    }

    public void setZipCode(String zipCode) { element.zipCode().sendKeys(zipCode); }

    public void setZipCodeForgotPassword(String zipCode) { element.zipCodeForgotPassword().sendKeys(zipCode); }

    public void setPhone(String phone) { element.phone().sendKeys(phone);}

    public void setSsn(String ssn) { element.ssn().sendKeys(ssn);}

    public void setSsnForgotPassword(String ssn) { element.ssnForgotPassword().sendKeys(ssn);}

    public String getUpdateProfileText()
    {
        return element.updateProfileTitle().getText();
    }

    public void clickUpdateProfileButton()
    {
        element.updateProfileButton().click();
    }

    public String getProfileUpdatedResultText()
    {
        return element.profileUpdatedSuccessfullyTitle().getText();
    }

    public void clickOpenNewAccountButton()
    {
        element.openNewAccount().click();
    }

    public void setTypeNewAccount(String savings) { element.typeNewAccount().sendKeys(savings); }

    public void clickOpenNewAccountPageButton()
    {
        element.openNewAccountButton().click();
    }

    public void clickOpenNewAccountOption()
    {
        element.openNewAccountOption().click();
    }

    public String getNewAccountOpenedText()
    {
        return element.newAccountOpenedText().getText();
    }

    public void clickForgotPasswordButton()
    {
        element.forgotPasswordOption().click();
    }

    public String getForgotPasswordPageText()
    {
        return element.forgotPasswordText().getText();
    }

    public void clickFindMyLoginInfoButton()
    {
        element.findMyLoginInfoButton().click();
    }

    public String getForgotPasswordPageValidationText()
    {
        return element.forgotPasswordValidationText().getText();
    }

    public String getOpenNewAccountPageText()
    {
        return element.openNewAccountPageText().getText();
    }

    public String getAccountsOverviewPageText()
    {
        return element.accountsOverviewPageText().getText();
    }

    public String getTransferFundsPageText()
    {
        return element.transferFundsPageText().getText();
    }

    public String getBillPayPageText()
    {
        return element.billPayPageText().getText();
    }

    public void clickFindTransactionsButton()
    {
        element.findTransactionsOption().click();
    }

    public String getFindTransactionsPageText()
    {
        return element.findTransactionsPageText().getText();
    }

    public void clickRequestLoanButton()
    {
        element.requestLoanOption().click();
    }

    public String getRequestLoanPageText()
    {
        return element.requestLoanPageText().getText();
    }

//    public boolean errorForbiddenAccessText() {
//        try {
//            wait.until(d -> element.errorForbiddenAccess().isDisplayed());
//            return element.errorForbiddenAccess().isDisplayed();
//        } catch(Exception e)
//        { return false;}
//    }
}