

Scenario: Logar
    Given que preciso logar
    And inserir login
    And inserir senha
    When clicar em logar
    Then exibirá a tela de login