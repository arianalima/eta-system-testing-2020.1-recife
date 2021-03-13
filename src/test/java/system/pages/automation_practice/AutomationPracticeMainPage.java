package system.pages.automation_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import system.helpers.DriverManager;
import system.pages.BasePage;

public class AutomationPracticeMainPage extends BasePage {
    private WebDriver driver;

    private By topMenuSelector = By.cssSelector("#block_top_menu");
    private By womanMenuSelector = By.cssSelector("ul > li:nth-child(1)");
    private By dressesMenuSelector = By.cssSelector("ul > li:nth-child(2)");
    private By tshirtMenuSelector = By.cssSelector("ul > li:nth-child(3)");


    public AutomationPracticeMainPage(){
        this.driver = DriverManager.getDriver();
    }

    private void clickMenuBtn(By menuBtn){
        WebElement topMenu = this.driver.findElement(topMenuSelector);
        topMenu.findElement(menuBtn).click();
    }

    public void navigateToWomanPage(){
        this.clickMenuBtn(womanMenuSelector);
    }
}
