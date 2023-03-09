package pages;

import java.util.Random;

import org.openqa.selenium.By;

public class TestValues  {
    
    public static String RegistrationPageUrl = "https://etherscan.io/register";
    public static String mailinatorInboxName = "veljan.korac" + Math.random() + "@mailinator.com";
    public static int generatedNumber = getRandomInt(10000);
    public static String Username = "vkorac" + generatedNumber;
    public static String password = "QAtesting123";
    public static String invalidPassword = "QAtesting111";
    public static By UsernameInputField = By.xpath("//input[@placeholder='Username']");
    public static By questionElement = By.xpath("//i[@class='far fa-question-circle text-muted']");
    public static By MailInputField = By.id("ContentPlaceHolder1_txtEmail");
    public static By confirmMailField = By.id("ContentPlaceHolder1_txtConfirmEmail");
    public static By passwordField = By.id("ContentPlaceHolder1_txtPassword");
    public static By passwordConfirmField = By.id("ContentPlaceHolder1_txtPassword2"); 
    public static By checkButton = By.id("ContentPlaceHolder1_MyCheckBox");
    public static By captchaField = By.xpath("//span[@class='recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox']");
    public static String mailinatorUrl = "https://www.mailinator.com/v4/public/inboxes.jsp";
    public static By emailInputField = By.id("inbox_field");
    public static By goButton = By.xpath("//button[@class = 'primary-btn']");
    public static By submitButton = By.xpath("//input[@type='submit']");
    public static By passwordTextErrorField = By.id("ContentPlaceHolder1_txtPassword2-error");
    public static String expectedError = "Password does not match, please check again.";
    public static By missingConfirmMailTextField = By.id("ContentPlaceHolder1_txtConfirmEmail-error");
    public static String missingConfirmMailText = "Please re-enter your email address.";
    public static By passwordMissingTextField = By.id("ContentPlaceHolder1_txtPassword-error");
    public static String passwordMissText = "Please enter Password.";
    public static By mailMissingTextField = By.id("ContentPlaceHolder1_txtEmail-error");
    public static String expectedMailMissingText = "Please enter a valid email address.";
    public static By missingUsernameTextField = By.id("ContentPlaceHolder1_txtUserName-error");
    public static String expectedMissingUsernameText = "Please enter Username.";
    public static By passwordConfirmMissTextField = By.id("ContentPlaceHolder1_txtPassword2-error");
    public static String passwordConfrimMissText = "Your password must be at least 8 characters long.";
    public static By checkBoxMissingErrorField = By.id("ctl00$ContentPlaceHolder1$MyCheckBox-error");
    public static String checkBoxMisingText = "Please accept our Terms and Conditions.";
    public static String invalidMailFormat = "invalidemailformat111";
    public static String invalidMailFormatTextError = "Please enter a valid email address.";
    public static String badPasswordForm = "blabla1";
    public static String badPasswordErrorMessage = "Your password must be at least 8 characters long.";
    public static String takenUsername = "vkorac96";
    public static String takenMail = "korac.veljan@gmail.com";
    public static By takenUsernameErrorMessageField = By.xpath("//div[@class='alert alert-danger']");
    public static String takenUsernameErrorMessage = "Sorry! The username you entered is already in use";
    
    private static int getRandomInt(int length){
        Random ran = new Random();
        int x = ran.nextInt(length) + 5;
        return x;
    }
}
