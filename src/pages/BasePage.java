package pages;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public WebElement waitForVisibility(By elementBy) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy));
    }

    public WebElement waitForClickability(By elementBy) {
        return wait.until(ExpectedConditions.elementToBeClickable(elementBy));
    }

    public void inputText(By elementBy, String text) {
        waitForClickability(elementBy).clear();
        waitForClickability(elementBy).sendKeys(text);
    }

    public void assertTextEquals(String expectedText, String actualText) {
        Assert.assertEquals(expectedText, actualText);
    }

    public void click(By elementBy) {
        waitForClickability(elementBy).click();
    }

    public String readText(By elementBy) {
        return waitForVisibility(elementBy).getText();
    }

    public void scrollToTheBottom(By elementBy) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", waitForVisibility(elementBy));
    }

    public void javaScriptClick(By elementBy) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", waitForVisibility(elementBy));
    }
}