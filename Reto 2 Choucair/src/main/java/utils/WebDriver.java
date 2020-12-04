package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import net.thucydides.core.webdriver.SerenityWebdriverManager;

public class WebDriver {

    public static ChromeDriver driver;

    public static ChromeDriver chrome() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        SerenityWebdriverManager.inThisTestThread().setCurrentDriverTo(driver);
        return driver;
    }
}
