package system.stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Atividade32 {

    @Given("O usuário está na tela de cadastro")
    public void oUsuárioEstáNaTelaDeCadastro() {
        System.out.println("Step definition sem argumento\n");
    }

    @Given("O(s) campo(s) obrigatório(s) estão/está vazio(s)")
    public void osCamposObrigatóriosEstãoVazios() {
        System.out.println("Step definition sem argumento\n");
    }

    @When("O usuário clicar no botão cadastrar")
    public void oUsuárioClicarNoBotãoCadastrar() {
        System.out.println("Step definition sem argumento\n");
    }

    @Then("O(s) campo(s) obrigatório(s) ficarão/ficará sinalizado(s)")
    public void osCamposObrigatóriosFicarãoSinalizados() {
        System.out.println("Step definition sem argumento\n");
    }

    @Then("O cadastro não é realizado")
    public void oCadastroNãoÉRealizado() {
        System.out.println("Step definition sem argumento\n");
    }

    @Given("O(s) campo(s) obrigatório(s) estão/está preenchido(s)")
    public void osCamposObrigatóriosEstãoPreenchidos(List<String> dados ) {
        System.out.println(dados.get(0).substring(0,5));
        System.out.println(dados.get(1).substring(0,5));
        System.out.println(Integer.parseInt(dados.get(2)) + 100);
        System.out.println(dados.get(3).substring(0,5));
    }

    @Then("O cadastro é realizado")
    public void oCadastroÉRealizado() {
        System.out.println("Step definition sem argumento\n");
    }

    @Then("Uma mensagem de sucesso é exibida")
    public void umaMensagemDeSucessoÉExibida() {
        System.out.println("Step definition sem argumento\n");
    }

    @Given("O campo senha é preenchido com {string}")
    public void oCampoSenhaÉPreenchidoCom(String valor) {
        System.out.println(valor.substring(0,5));
    }

    @Then("O(s) demais campo(s) obrigatório(s) ficarão/ficará sinalizado(s)")
    public void osDemaisCamposObrigatóriosFicarãoSinalizados() {
        System.out.println("Step definition sem argumento\n");
    }
}
