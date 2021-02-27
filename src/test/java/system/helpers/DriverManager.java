package system.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static system.helpers.Constants.CHROME_DRIVER_PATH;

public class DriverManager {
    private static WebDriver driver;
    private static ChromeOptions options;

    public static WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
        if (driver == null){
            options = new ChromeOptions();
            options.addArguments("headless");
            driver = new ChromeDriver(options);
        }
        return driver;
    }

    public static void endSession(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }
}
