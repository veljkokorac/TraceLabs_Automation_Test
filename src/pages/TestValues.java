package pages;

import java.util.Random;

import org.openqa.selenium.By;

public class TestValues {

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
    public static String mailinatorUrl = "https://www.mailinator.com/v4/public/inboxes.jsp";
    public static By emailInputField = By.id("inbox_field");
    public static By goButton = By.xpath("//button[@class = 'primary-btn']");
    public static By submitButton = By.xpath("//input[contains(@id, 'btnRegister')]");
    public static String expectedError = "Password does not match, please check again.";
    public static By missingConfirmMailTextField = By.xpath("//div[contains(@id, 'txtConfirmEmail-error')]");
    public static String missingConfirmMailText = "Please re-enter your email address.";
    public static By passwordMissingTextField = By.xpath("//div[contains(@id, 'txtPassword-error')]");
    public static String passwordMissText = "Please enter Password.";
    public static By mailMissingTextField = By.xpath("//div[contains(@id, 'txtEmail-error')]");
    public static String expectedMailMissingText = "Please enter a valid email address.";
    public static By missingUsernameTextField = By.xpath("//div[contains(@id, 'txtUserName-error')]");
    public static String expectedMissingUsernameText = "Please enter Username.";
    public static By passwordConfirmMissTextField = By.xpath("//div[contains(@id, 'txtPassword2-error')]");
    public static String passwordConfirmMissText = "Your password must be at least 8 characters long.";
    public static By checkBoxMissingErrorField = By.xpath("//div[contains(@id, 'MyCheckBox-error')]");
    public static String checkBoxMisingText = "Please accept our Terms and Conditions.";
    public static String invalidMailFormat = "invalidemailformat111";
    public static String invalidMailFormatTextError = "Please enter a valid email address.";
    public static String badPasswordForm = "blabla1";
    public static String badPasswordErrorMessage = "Your password must be at least 8 characters long.";
    public static String takenUsername = "vkorac96";
    public static String takenMail = "korac.veljan@gmail.com";
    public static By takenUsernameErrorMessageField = By.xpath("//div[@class='alert alert-danger']");
    public static String takenUsernameErrorMessage = "Sorry! The username you entered is already in use";
    public static String randomEmail = "keljavorac@gmail.com";
    public static String mailMissmatchMessage = "Email address does not match.";
    public static By cookieConsent = By.xpath("//button[@id='btnCookie']");

    private static int getRandomInt(int length) {
        Random ran = new Random();
        int x = ran.nextInt(length) + 5;
        return x;
    }
}
