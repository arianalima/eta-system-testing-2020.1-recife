package system.pages.selenium_easy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.helpers.DriverManager;

public class LeftNavMenu{
    private WebDriver driver;
    private WebDriverWait driverWait;

    private By leftNavMenuSelector = By.cssSelector("#navbar-brand-centered");
    private By inputFormsBtnSelector = By.cssSelector(".nav > li:nth-child(1)");
    private By datePickerBtnSelector = By.cssSelector(".nav > li:nth-child(2)");
    private By tableBtnSelector = By.cssSelector(".nav > li:nth-child(3)");
    private By leftNavMenu = By.cssSelector(".navbar-nav:nth-child(1)");
    private By sortSearchSubmenu = By.cssSelector(".dropdown-menu > li:nth-child(4)");

    public LeftNavMenu(){
        this.driver = DriverManager.getDriver();
        this.driverWait = DriverManager.getDriverWait();
    }

    public TableSortSearchPage navigateToTableSortSearch(){
        this.clickSubMenuButton(tableBtnSelector, sortSearchSubmenu);
        return new TableSortSearchPage();
    }

    private void clickSubMenuButton(By menuBtn, By subMenuBtn){
        WebElement leftNavMenu = this.driver.findElement(leftNavMenuSelector);
        WebElement btnMenu = leftNavMenu.findElement(menuBtn);
        btnMenu.click();
        this.driverWait.until(ExpectedConditions.presenceOfElementLocated(subMenuBtn));
        WebElement btnSubMenu = btnMenu.findElement(subMenuBtn);
        btnSubMenu.click();
    }


}
