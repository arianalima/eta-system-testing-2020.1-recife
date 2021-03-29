Feature: Agencia Localiza

    @atividade35
    Scenario: Pesquisar Agencia
    Given Eu entro na página inicial da Localiza
    And   Eu clicar na tab de "Rede de Agências"
    When  Eu inserir o texto "Recife" no campo de busca
    Then  Deverá ser mostrado 3 resultados de agencias brasileiras como abaixo:
          |recife  |ag aerop recife aluguel mensal |
          |recife  |agencia aeroporto recife       |
          |recife  |agencia centro recife          |

