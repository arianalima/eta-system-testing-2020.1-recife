package system.pages.Localiza;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import system.pages.BasePage;
import system.helpers.DriverManager;

public class RedeAgenciaPage extends BasePage {

    private WebDriverWait driverWait;
    private WebDriver driver;
    
    
    private By inputPesquisar = By.cssSelector("#inputPesquisar");
    

    public RedeAgenciaPage() {
        this.driver = DriverManager.getDriver();
        this.driverWait = DriverManager.getDriverWait();
    }

    public void pesquisarAgencias(String textoDePesquisa){
        WebElement inputElement = this.driver.findElement(inputPesquisar);
        inputElement.sendKeys(textoDePesquisa);
    }

    public String listarAgencias(Integer index){

        By input = By.cssSelector(".lista-agencias:nth-child("+index+") div.titulo-flex__cidade-titulo");

    }

    

}
