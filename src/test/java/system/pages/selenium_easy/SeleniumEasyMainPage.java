package system.pages.selenium_easy;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import system.helpers.DriverManager;
import system.pages.BasePage;


public class SeleniumEasyMainPage extends BasePage {
    private WebDriver driver;
    private WebDriverWait driverWait;


    private By siteName = By.cssSelector("#site-name");
    private By closeAdd = By.cssSelector("#at-cv-lightbox-close");

    public SeleniumEasyMainPage(){
        this.driver = DriverManager.getDriver();
        this.driverWait = DriverManager.getDriverWait();
    }

    public LeftNavMenu getLeftNavMenu(){
        return new LeftNavMenu();
    }

    public String getSiteName(){
        return this.driver.findElement(siteName).getText();
    }

    public void closeAdd() {
        try{
            this.driverWait.until(ExpectedConditions.visibilityOfElementLocated(closeAdd));
            this.driver.findElement(closeAdd).click();
        }catch (NoSuchElementException e){
        }
    }
}
