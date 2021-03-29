package system.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import system.pages.Localiza.MainPageLocaliza;
import system.pages.Localiza.RedeAgenciaPage;

public class Atividade35 {

    MainPageLocaliza mainPageLocaliza = new MainPageLocaliza();
    RedeAgenciaPage reAgenciaPage = new RedeAgenciaPage();

    @Given("Eu entro na página inicial da Localiza")
    public void euEntroNaPáginaInicialDaLocaliza() {
        mainPageLocaliza.accessPage("https://www.localiza.com/brasil/pt-br");
       
    }
    @Given("Eu clicar na tab de {string}")
    public void euClicarNaTabDeRedeDeAgencia(String tabName) {
      mainPageLocaliza.clicarNaTab(tabName);
    }

    @When("Eu inserir o texto {string} no campo de busca")
    public void euInserirOTextoNoCampoDeBusca(String textoDePesquisa) {
      reAgenciaPage.pesquisarAgencias(textoDePesquisa);
       
    }
    @Then("Deverá ser mostrado {int} resultados de agencias brasileiras como abaixo:")
    public void deveráSerMostradoResultadosDeAgenciasBrasileirasComoAbaixo(Integer int1, DataTable dataTable) {
      for (int i = 0; i < dataTable.)   

    }

}