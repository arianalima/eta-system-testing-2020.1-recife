package system.pages.selenium_easy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.helpers.DriverManager;
import system.pages.BasePage;

import java.util.List;

public class TableSortSearchPage extends BasePage {
    private WebDriver driver;
    private WebDriverWait driverWait;

    private By allTableRowSelector = By.cssSelector("#example tr");
    private By searchInputSelector = By.cssSelector("#example_filter input");
    private By messageShowingSelector = By.cssSelector("#example_info");
    private By tableBodyRowSelector = By.cssSelector("#example tbody tr");

    public TableSortSearchPage(){
        this.driver = DriverManager.getDriver();
        this.driverWait = DriverManager.getDriverWait();
    }

    public void searchText(String text){
        this.driverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(allTableRowSelector));
        this.driver.findElement(searchInputSelector).sendKeys(text);
        driverWait.until(ExpectedConditions.textToBePresentInElementLocated(messageShowingSelector, "filtered"));
    }

    public int getTableRowAmount(){
        return this.driver.findElements(tableBodyRowSelector).size();
    }

    public List<WebElement> getTableRows(){
        return this.driver.findElements(tableBodyRowSelector);
    }

}
