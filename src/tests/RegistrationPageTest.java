package tests;

import org.junit.Test;

import pages.MailinatorPage;
import pages.RegistrationPage;
import pages.TestValues;

public class RegistrationPageTest extends BaseTest {

    RegistrationPage registrationPage;
    MailinatorPage mailinatorPage;

    @Test
    public void successRegistration() {
        registrationPage = new RegistrationPage(driver);
        mailinatorPage = new MailinatorPage(driver);
        registrationPage.goToRegistrationPage();
        registrationPage.enterUsername();
        registrationPage.enterMail();
        registrationPage.enterConfirmMail();
        registrationPage.enterPassword();
        registrationPage.enterConfirmPassword();
        registrationPage.clickCheckField();
        driver.switchTo().frame(0);
        registrationPage.clickCaptchaField();
        registrationPage.clickSubmit();
        mailinatorPage.goToMailinatorInbox();
        mailinatorPage.inputEmailAddress();
        mailinatorPage.clickGoButton();
    }

    @Test
    public void missingUsername(){
        registrationPage = new RegistrationPage(driver);
        registrationPage.goToRegistrationPage();
        registrationPage.enterMail();
        registrationPage.enterConfirmMail();
        registrationPage.enterPassword();
        registrationPage.enterConfirmPassword();
        registrationPage.clickCheckField();
        registrationPage.clickSubmit();
        registrationPage.verifyUsernameMissing(TestValues.expectedMissingUsernameText);
    }

    @Test
    public void missingEmail (){
        registrationPage = new RegistrationPage(driver);
        registrationPage.goToRegistrationPage();
        registrationPage.enterUsername();
        registrationPage.enterConfirmMail();
        registrationPage.enterPassword();
        registrationPage.enterConfirmPassword();
        registrationPage.clickCheckField();
        registrationPage.clickSubmit();
        registrationPage.verifyMailMissing(TestValues.expectedMailMissingText);
    }

    @Test
    public void missingConfirmMail(){
        registrationPage = new RegistrationPage(driver);
        registrationPage.goToRegistrationPage();
        registrationPage.enterUsername();
        registrationPage.enterMail();
        registrationPage.enterPassword();
        registrationPage.enterConfirmPassword();
        registrationPage.clickCheckField();
        registrationPage.clickSubmit();
        registrationPage.verifyConfirmMailMissing(TestValues.missingConfirmMailText);     
    }

    @Test
    public void missingPassword(){
        registrationPage = new RegistrationPage(driver);
        registrationPage.goToRegistrationPage();
        registrationPage.enterUsername();
        registrationPage.enterMail();
        registrationPage.enterConfirmMail();
        registrationPage.enterConfirmPassword();
        registrationPage.clickCheckField();
        registrationPage.clickSubmit();
        registrationPage.verifyPasswordMissing(TestValues.passwordMissText);     
    }

    @Test
    public void missingConfirmPassword(){
        registrationPage = new RegistrationPage(driver);
        registrationPage.goToRegistrationPage();
        registrationPage.enterUsername();
        registrationPage.enterMail();
        registrationPage.enterConfirmMail();
        registrationPage.enterPassword();
        registrationPage.clickCheckField();
        registrationPage.clickSubmit();
        registrationPage.verifyPasswordConfirmMissing(TestValues.passwordConfrimMissText);      
    }

    @Test
    public void passwordsDoNotMatch(){
        registrationPage = new RegistrationPage(driver);
        registrationPage.goToRegistrationPage();
        registrationPage.enterUsername();
        registrationPage.enterMail();
        registrationPage.enterConfirmMail();
        registrationPage.enterPassword();
        registrationPage.enterInvalidPassword();
        registrationPage.clickCheckField();
        registrationPage.clickSubmit();
        registrationPage.verifyPasswordsDoNotMatch(TestValues.expectedError);
    }

    @Test
    public void missingCheckBox(){
        registrationPage = new RegistrationPage(driver);
        registrationPage.goToRegistrationPage();
        registrationPage.enterUsername();
        registrationPage.enterMail();
        registrationPage.enterConfirmMail();
        registrationPage.enterPassword();
        registrationPage.enterConfirmPassword();
        registrationPage.clickSubmit();
        registrationPage.verifyCheckBoxMissing(TestValues.checkBoxMisingText);
    }
    
    @Test
    public void invalidEmailFormat(){
        registrationPage = new RegistrationPage(driver);
        registrationPage.goToRegistrationPage();
        registrationPage.enterUsername();
        registrationPage.enterInvalidMailFormat();
        registrationPage.enterPassword();
        registrationPage.enterConfirmPassword();
        registrationPage.clickCheckField();
        registrationPage.clickSubmit();
        registrationPage.verifyInvalidMailFormat(TestValues.invalidMailFormatTextError);
    }

    @Test
    public void badPasswordForm(){
        registrationPage = new RegistrationPage(driver);
        registrationPage.goToRegistrationPage();
        registrationPage.enterUsername();
        registrationPage.enterMail();
        registrationPage.enterConfirmMail();
        registrationPage.enterBadPasswordForm();
        registrationPage.clickCheckField();
        registrationPage.clickSubmit();
        registrationPage.verifyBadPasswordForm(TestValues.badPasswordErrorMessage);
    }

    @Test
    public void missingAllField(){
        registrationPage = new RegistrationPage(driver);
        registrationPage.goToRegistrationPage();
        registrationPage.clickSubmit();
        registrationPage.verifyEmptyFields(TestValues.RegistrationPageUrl);
    }

    @Test
    public void takenUsername(){
        registrationPage = new RegistrationPage(driver);
        registrationPage.goToRegistrationPage();
        registrationPage.enterTakenUsername();
        registrationPage.enterMail();
        registrationPage.enterConfirmMail();
        registrationPage.enterPassword();
        registrationPage.enterConfirmPassword();
        registrationPage.clickCheckField();
        driver.switchTo().frame(0);
        registrationPage.clickCaptchaField();
        registrationPage.clickSubmit();
        registrationPage.verifyUsernameIsTaken(TestValues.takenUsernameErrorMessage);
    }

    @Test
    public void takenMail(){
        registrationPage = new RegistrationPage(driver);
        registrationPage.goToRegistrationPage();
        registrationPage.enterUsername();
        registrationPage.enterTakenMail();
        registrationPage.enterTakenConfirmMail();
        registrationPage.enterPassword();
        registrationPage.enterConfirmPassword();
        registrationPage.clickCheckField();
        registrationPage.clickSubmit();
        }
}