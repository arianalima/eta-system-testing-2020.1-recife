package system.pages.selenium_easy;

import org.openqa.selenium.*;
import system.helpers.DriverManager;
import system.pages.BasePage;


public class MainPage extends BasePage {
    private WebDriver driver;

    private By siteName = By.cssSelector("#site-name");
    private By closeAdd = By.cssSelector("#at-cv-lightbox-close");

    public MainPage(){
        this.driver = DriverManager.getDriver();
    }

    public LeftNavMenu getLeftNavMenu(){
        return new LeftNavMenu();
    }

    public String getSiteName(){
        return this.driver.findElement(siteName).getText();
    }

    public void closeAdd() {
        try{
            this.driver.findElement(closeAdd).click();
        }catch (NoSuchElementException e){
        }
    }
}
