package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BaseTest {

    WebDriver driver;

    @Before
    public void setupDriver() {
        EdgeOptions options = new EdgeOptions();
        driver = new EdgeDriver(options);
        driver.manage().window().maximize();
        System.out.println("Browser " + options.getBrowserName() + " has been started!");
    }

    @After
    public void teardown() {
        EdgeOptions options = new EdgeOptions();
        driver.quit();
        System.out.println("Browser " + options.getBrowserName() + " has been closed!");
    }
}
