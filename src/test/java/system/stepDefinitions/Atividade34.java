package system.stepDefinitions;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import system.pages.selenium_easy.SeleniumEasyMainPage;
import system.pages.selenium_easy.TableSortSearchPage;

public class Atividade34 {

    SeleniumEasyMainPage mainPage = new SeleniumEasyMainPage();
    TableSortSearchPage tableSortSearchPage;
    
    @Given("O usuário entre no site do selenium easy")
    public void oUsuárioEntreNoSiteDoSeleniumEasy() {
        mainPage.accessPage("https://www.seleniumeasy.com/test");
        mainPage.closeAdd();
    }
    @Given("O usuário acessa a tab de Table Sort & Search")
    public void oUsuárioAcessaATabDeTableSortSearch() {
        tableSortSearchPage = mainPage.getLeftNavMenu().navigateToTableSortSearch();

    }
    @When("o usuário filtrar a tabela pelo texto {string}")
    public void oUsuárioFiltrarATabelaPeloTexto(String valorFiltrado) {
        tableSortSearchPage.searchText(valorFiltrado);
    }

    @Then("A tabela deverá mostrar {int} resultados")
    public void aTabelaDeveráMostrarResultados(Integer quantidade) {
        List<WebElement> tableRows = tableSortSearchPage.getTableRows();
        Assertions.assertEquals(quantidade, tableSortSearchPage.getTableRowAmount());
        for (WebElement row:tableRows) {
            Assertions.assertTrue(row.getText().contains("London"));
            System.out.println(row.getText());
        }
    }
}





