package tests;

import Actions.Login;
import Actions.Register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utile.BaseTest;
import utile.ConfigLoader;

import java.time.Duration;

public class LoginUser extends BaseTest {

    private Login login;
    private Register register = null;


    @Test
    public void loginUser() {
        initTest("Login User");
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        login = new Login(driver);

        ConfigLoader configLoader = new ConfigLoader("src/test/resources/proprietati/dateUser1.properties");

        String username = configLoader.getProperty("username");
        String password = configLoader.getProperty("password");
        String amountValueSum = configLoader.getProperty("amountValueSum");
        String payeeAccount = configLoader.getProperty("payeeAccount");
        String payeeVerifyAccount = configLoader.getProperty("payeeVerifyAccount");
        String amountBillPayment = configLoader.getProperty("amountBillPayment");
        String payeeName = configLoader.getProperty("payeeName");
        String payeeAddress = configLoader.getProperty("payeeAddress");
        String payeeCity = configLoader.getProperty("payeeCity");
        String payeeState = configLoader.getProperty("payeeState");
        String payeeZipCode = configLoader.getProperty("payeeZipCode");
        String payeePhone = configLoader.getProperty("payeePhone");
        String firstNameUpdate = configLoader.getProperty("firstNameUpdate");
        String lastNameUpdate = configLoader.getProperty("lastNameUpdate");
        String addressUpdate = configLoader.getProperty("addressUpdate");
        String cityUpdate = configLoader.getProperty("cityUpdate");
        String stateUpdate = configLoader.getProperty("stateUpdate");
        String zipCodeUpdate = configLoader.getProperty("zipCodeUpdate");
        String phoneUpdate = configLoader.getProperty("phoneUpdate");
        String typeNewAccount = configLoader.getProperty("typeNewAccount");

        String firstName = configLoader.getProperty("firstName");
        String lastName = configLoader.getProperty("lastName");
        String address = configLoader.getProperty("address");
        String city = configLoader.getProperty("city");
        String state = configLoader.getProperty("state");
        String zipCode = configLoader.getProperty("zipCode");
        String ssn = configLoader.getProperty("ssn");

        // Recuperarea parolei uitate
//        login.clickForgotPasswordButton();
//        login.setFirstnameForgotPassword(firstName);
//        login.setLastnameForgotPassword(lastName);
//        login.setAddressForgotPassword(address);
//        login.setCityForgotPassword(city);
//        login.setStateForgotPassword(state);
//        login.setZipCodeForgotPassword(zipCode);
//        login.setSsnForgotPassword(ssn);
//        login.clickFindMyLoginInfoButton();
//        Assert.assertTrue(login.getForgotPasswordPageValidationText().equalsIgnoreCase("Your login information was located successfully. You are now logged in."));

        //Login
        login.setUsername(username);
        login.setPassword(password);
        login.clickLoginButton();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='navigation__link userName']")));

        if (login.getPageValidationTitle().equalsIgnoreCase("Accounts Overview")) {
            Assert.assertTrue(login.getPageValidationTitle().equalsIgnoreCase("Accounts Overview"));
            System.out.println("Valid username and password. Successfully log in!");
        }

        if (login.getPageValidationTitle().equalsIgnoreCase("Error!")) {
            Assert.assertTrue(login.getPageValidationTitle().equalsIgnoreCase("Error!"));
            System.out.println("Invalid username or password. Please try again!");
        }

        // Check Login

        // Logout
//            login.clickLogoutButton();
//            if(login.getLoginText().equalsIgnoreCase("Customer Login")) {
//                Assert.assertTrue(login.getLoginText().equalsIgnoreCase("Customer Login"));
//                System.out.println("Successfully log out!");}

        // Transfer de fonduri între conturi
//        login.clickTransferFundsButton();
//        login.setAmountValue(amountValueSum);
//        login.clickTransferAmountButton();
//        Assert.assertTrue(login.getTransferFundsText().equalsIgnoreCase("Transfer Complete!"));

        // Plata unei facturi
//        login.clickBillPayButton();
//        login.setPayeeName(payeeName);
//        login.setPayeeAddress(payeeAddress);
//        login.setPayeeCity(payeeCity);
//        login.setPayeeState(payeeState);
//        login.setPayeeZipCode(payeeZipCode);
//        login.setPayeePhone(payeePhone);
//        login.setPayeeAccount(payeeAccount);
//        login.setPayeeVerifyAccount(payeeVerifyAccount);
//        login.setAmountBillPay(amountBillPayment);
//        login.clickSendPaymentBillPayButton();
//
//        if (login.getBillPaymentText().equalsIgnoreCase("Bill Payment Complete")) {
//            Assert.assertTrue(login.getBillPaymentText().equalsIgnoreCase("Bill Payment Complete"));
//            System.out.println("Bill Payment successfully!");
//        } else {
//            System.out.println("Bill Payment unsuccessfully!");
//        }

        //Vizualizarea istoricului tranzactiilor
        //login.clickAccountsOverviewButton();

        //Actualizarea informatiilor personale
//        login.clickUpdateContactInfo();
//        Assert.assertTrue(login.getUpdateProfileText().equalsIgnoreCase("Update Profile"));
//        login.setFirstname(firstNameUpdate);
//        login.setLastname(lastNameUpdate);
//        login.setAddress(addressUpdate);
//        login.setCity(cityUpdate);
//        login.setState(stateUpdate);
//        login.setZipCode(zipCodeUpdate);
//        login.setPhone(phoneUpdate);
//        login.clickUpdateProfileButton();
//        // wait
//        Assert.assertTrue(login.getProfileUpdatedResultText().equalsIgnoreCase("Profile Updated"));

        //Deschiderea unui cont nou
//        login.clickOpenNewAccountButton();
//        login.setTypeNewAccount(typeNewAccount);
//        login.clickOpenNewAccountPageButton();
//        Assert.assertTrue(login.getNewAccountOpenedText().equalsIgnoreCase("Congratulations, your account is now open."));

        // Navigarea meniului principal
        login.clickOpenNewAccountOption();
        Assert.assertTrue(login.getOpenNewAccountPageText().equalsIgnoreCase("Open New Account"));

        login.clickAccountsOverviewButton();
        Assert.assertTrue(login.getAccountsOverviewPageText().equalsIgnoreCase("Accounts Overview"));

        login.clickTransferFundsButton();
        Assert.assertTrue(login.getTransferFundsPageText().equalsIgnoreCase("Transfer Funds"));

        login.clickBillPayButton();
        Assert.assertTrue(login.getBillPayPageText().equalsIgnoreCase("Bill Payment Service"));

        login.clickFindTransactionsButton();
        Assert.assertTrue(login.getFindTransactionsPageText().equalsIgnoreCase("Find Transactions"));

        login.clickUpdateContactInfo();
        Assert.assertTrue(login.getUpdateProfileText().equalsIgnoreCase("Update Profile"));

        login.clickRequestLoanButton();
        Assert.assertTrue(login.getRequestLoanPageText().equalsIgnoreCase("Apply for a Loan"));

        login.clickLogoutButton();
        Assert.assertTrue(login.getLoginText().equalsIgnoreCase("Customer Login"));

    }
}