package pages;

import org.openqa.selenium.WebDriver;

public class MailinatorPage extends BasePage {

    
    public MailinatorPage(WebDriver driver) {
        super(driver);
    }

    public void goToMailinatorInbox() {
        driver.get(TestValues.mailinatorUrl);
    }

    public void inputEmailAddress() {
        inputText(TestValues.emailInputField, TestValues.mailinatorInboxName);
    }

    public void clickGoButton() {
        click(TestValues.goButton);
    }
}