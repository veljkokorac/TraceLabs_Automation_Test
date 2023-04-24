package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BaseTest {

    WebDriver driver;
    EdgeOptions options;

    @Before
    public void setupDriver() {
        options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--window-size=1920,1080");
        driver = new EdgeDriver(options);
        driver.manage().window().maximize();
        System.out.println("Browser " + options.getBrowserName() + " has been started!");
    }

    @After
    public void teardown() {
        driver.quit();
        System.out.println("Browser " + options.getBrowserName() + " has been closed!");
    }
}
