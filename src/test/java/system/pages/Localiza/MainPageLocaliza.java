package system.pages.Localiza;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import system.helpers.DriverManager;
import system.pages.BasePage;

public class MainPageLocaliza extends BasePage{

    private WebDriver driver;
    private WebDriverWait driverWait;
 
    private By redeAgenciasTitle = By.cssSelector(".rede-agencias h1");
    

    public MainPageLocaliza(){
        this.driver = DriverManager.getDriver();
        this.driverWait = DriverManager.getDriverWait();
    }
    
    public void clicarNaTab(String tabName){
        By tabSelector = By.cssSelector("a[title='"+tabName+"']");
        WebElement tab = this.driver.findElement(tabSelector);
        tab.click();
        this.driverWait.until(ExpectedConditions.visibilityOfElementLocated(redeAgenciasTitle));
    }

}
