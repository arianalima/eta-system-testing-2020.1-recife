package system.pages;

import org.openqa.selenium.WebDriver;
import system.helpers.DriverManager;

public class BasePage {
    private WebDriver driver;

    public BasePage(){
        this.driver = DriverManager.getDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void accessPage(String url){
        this.driver.get(url);
    }

    public String getUrl() {
        return this.driver.getCurrentUrl();
    }
}
