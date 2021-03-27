package system.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.List;

public class Example {

    @When("O usuário seleciona o(s) seguinte(s) item:/itens:")
//    @When("qualquer coisa:")
    public void SelectItens(DataTable itens) {
        System.out.println(itens.row(0));
        System.out.println(itens.column(0));
        System.out.println(itens.row(0).get(1));

        List<String> itensList  = itens.asList();
        List<List<String>> doubleList = itens.asLists();
        System.out.println(itensList.get(0));
        System.out.println(doubleList.get(0));
    }
}
