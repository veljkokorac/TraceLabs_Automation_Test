package pages;

import org.openqa.selenium.WebDriver;


public class RegistrationPage extends BasePage {
    
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void goToRegistrationPage() {
        driver.get(TestValues.RegistrationPageUrl);
    }

    public void enterUsername() {
        inputText(TestValues.UsernameInputField, TestValues.Username);
    }

    public void enterTakenUsername (){
        inputText(TestValues.UsernameInputField, TestValues.takenUsername);
    }

    public void enterTakenMail(){
        inputText(TestValues.MailInputField, TestValues.takenMail);
    }
    public void enterTakenConfirmMail(){
        inputText(TestValues.confirmMailField, TestValues.takenMail);
    }

    public void enterMail() {
        inputText(TestValues.MailInputField, TestValues.mailinatorInboxName);
    }
    
    public void enterInvalidMailFormat(){
        inputText(TestValues.MailInputField,TestValues.invalidMailFormat);
        inputText(TestValues.confirmMailField,TestValues.invalidMailFormat);

    }
    
    public void enterConfirmMail(){
        inputText(TestValues.confirmMailField, TestValues.mailinatorInboxName);
    }
    

    public void enterPassword(){
        inputText(TestValues.passwordField, TestValues.password);
    }

    public void enterBadPasswordForm(){
        inputText(TestValues.passwordField, TestValues.badPasswordForm);
        inputText(TestValues.passwordConfirmField, TestValues.badPasswordForm);
    }
    
    public void enterConfirmPassword(){
        inputText(TestValues.passwordConfirmField, TestValues.password);
    }

    public void enterInvalidPassword(){
        inputText(TestValues.passwordConfirmField, TestValues.invalidPassword);
    }

    public void clickCheckField(){
        click(TestValues.checkButton);
    }

    public void clickCaptchaField(){
        click(TestValues.captchaField);
    }

    public void clickUsername(){
        click(TestValues.UsernameInputField);
    }    

    public void clickSubmit(){
        click(TestValues.submitButton);
    
    }

    public RegistrationPage verifyPasswordsDoNotMatch(String expectedError){
        String actualError = readText(TestValues.passwordTextErrorField);
        assertTextEquals(TestValues.expectedError, actualError);
        return this;
    }

    public RegistrationPage verifyConfirmMailMissing (String expectedMissingConfirmMailText){
        String actualMissingConfirmMailText = readText(TestValues.missingConfirmMailTextField);
        assertTextEquals(TestValues.missingConfirmMailText, actualMissingConfirmMailText);
        return this;
    }
    public RegistrationPage verifyPasswordMissing (String expectedMissingPasswordText){
        String actualMissingPasswordText = readText(TestValues.passwordMissingTextField);
        assertTextEquals(TestValues.passwordMissText, actualMissingPasswordText);
        return this;

    }

    public RegistrationPage verifyPasswordConfirmMissing (String expectedMissingPasswordConfirmText){
        String actualMissingPasswordConfirmText = readText(TestValues.passwordConfirmMissTextField);
        assertTextEquals(TestValues.passwordConfrimMissText, actualMissingPasswordConfirmText);
        return this;
    }

    public RegistrationPage verifyMailMissing(String expectedMailMissingText){
        String actualMissingMailText = readText(TestValues.mailMissingTextField);
        assertTextEquals(TestValues.expectedMailMissingText, actualMissingMailText);
        return this;
    }

    public RegistrationPage verifyUsernameMissing(String expectedMissingUsernameText){
        String actualMissingUsernameText = readText(TestValues.missingUsernameTextField);
        assertTextEquals(TestValues.expectedMissingUsernameText, actualMissingUsernameText);
        return this;  
    }    
    public RegistrationPage verifyCheckBoxMissing (String expectedMissCheckBoxTextError){
        String actualMissingCheckBoxText = readText(TestValues.checkBoxMissingErrorField);
        assertTextEquals(TestValues.checkBoxMisingText, actualMissingCheckBoxText);
        return this;
    }

    public RegistrationPage verifyInvalidMailFormat (String expectedMessageInvalidFormat){
        String actualMessageForInvalidMailFormat = readText(TestValues.mailMissingTextField);
        assertTextEquals(TestValues.invalidMailFormatTextError, actualMessageForInvalidMailFormat);
        return this; 
    }
    public RegistrationPage verifyBadPasswordForm (String expectedMessageBadPasswordForm){
        String actualMessageBadPasswordForm = readText(TestValues.passwordMissingTextField);
        assertTextEquals(TestValues.badPasswordErrorMessage, actualMessageBadPasswordForm);
        return this; 
    }

    public RegistrationPage verifyEmptyFields (String expectedUrl){
        String actualUrl = driver.getCurrentUrl();
        assertTextEquals(TestValues.RegistrationPageUrl, actualUrl);
        return this; 
    }

    public RegistrationPage verifyUsernameIsTaken(String expectedMessageForTakenUsername){
        String actualMessageForTakkenUsername = readText(TestValues.takenUsernameErrorMessageField);
        assertTextEquals(TestValues.takenUsernameErrorMessage, actualMessageForTakkenUsername);
        return this;
    }
}
    





