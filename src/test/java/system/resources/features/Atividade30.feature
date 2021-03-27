@atividade30
Feature: Atividade 30
  Cadastro de usuário

  Background: Setup
    Given O usuário está na tela de cadastro

  Scenario: Verificar que não é possível cadastrar usuário sem os campos obrigatórios
    Given Os campos obrigatórios estão vazios
    When  O usuário clicar no botão cadastrar
    Then  Os campos obrigatórios ficarão sinalizados
    And   O cadastro não é realizado

  Scenario: Verificar que é possível cadastrar usuário
    Given Os campos obrigatórios estão preenchidos
    When  O usuário clicar no botão cadastrar
    Then  O cadastro é realizado
    And   Uma mensagem de sucesso é exibida

  Scenario: Verificar que a senha é válida
    Given O campo senha é preenchido com "a1b2c3d4"
    When  O usuário clicar no botão cadastrar
    Then  Os demais campos obrigatórios ficarão sinalizados
    And   O cadastro não é realizado