Feature: Atividade 34

    Background: SETUP
    Given O usuário entre no site do selenium easy

    @atividade34
    Scenario: Filtrar tabela
    Given O usuário acessa a tab de Table Sort & Search
    When o usuário filtrar a tabela pelo texto "London"
    Then A tabela deverá mostrar 7 resultados
