package system;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import system.helpers.DriverManager;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Main {
    private WebDriver driver;

    @BeforeAll
    void setup(){
        this.driver = DriverManager.getDriver();
    }

    @AfterAll
    void tearDown(){
        DriverManager.endSession();
    }

    @Test
    void atividade13(){
        this.driver.get("https://seleniumeasy.com/test/input-form-demo.html");
        List<WebElement> inputFields = driver.findElements(By.cssSelector("#contact_form .form-group input"));
        for (int i = 0; i < inputFields.size(); i++){
            inputFields.get(i).sendKeys("dummy");
        }
        String state = this.driver.findElement(By.cssSelector("select[name='state'] > option + option")).getText();
        this.driver.findElement(By.cssSelector("select[name='state']")).sendKeys(state);
        this.driver.findElement(By.cssSelector("input[name='hosting']")).click();
        this.driver.findElement(By.cssSelector("textarea[name='comment']")).sendKeys("dummy");
        this.driver.findElement(By.cssSelector(".form-group:last-child button")).click();
    }

    @Test
    void atividade14(){
        this.driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
        String row = this.driver.findElement(By.cssSelector("#task-table tbody tr:not(first-child)")).getText();
        System.out.println(row);
    }

    @Test
    void atividade15(){
        this.driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
        String header = this.driver.findElement(By.cssSelector("#task-table thead th:nth-child(3)")).getText();
        System.out.println(header);
        List<WebElement> column = this.driver.findElements(By.cssSelector("#task-table tbody td:nth-child(3)"));
        for (WebElement row : column){
            System.out.println(row.getText());
        }
    }

    @Test
    void atividade16(){
        this.driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
        this.driver.findElement(By.cssSelector(".btn-default")).click();
        List<WebElement> inputs = this.driver.findElements(By.cssSelector(".table .filters input"));
        inputs.get(1).sendKeys("m");
        inputs.get(2).sendKeys("b");
        List<WebElement> rows = this.driver.findElements(By.cssSelector(".filterable tbody tr:not(tr[style*='none'])"));
        for (WebElement row : rows){
            System.out.println(row.getText());
        }
    }

    @Test
    void atividade17(){
        this.driver.get("https://www.cesar.school/");
        WebElement input_name = this.driver.findElement(By.cssSelector("[name='NomeCompleto']"));
        input_name.sendKeys("dummy");

        WebElement header = this.driver.findElement(By.cssSelector("div.main-header-bar"));
        List<WebElement> menus = header.findElements(By.cssSelector("ul[id='primary-menu'] > li"));
        for (WebElement menu : menus){
            System.out.println(menu.getText());
        }

        System.out.println(input_name.getAttribute("size"));

        System.out.println(input_name.isDisplayed());

        System.out.println(input_name.isEnabled());
    }
}
