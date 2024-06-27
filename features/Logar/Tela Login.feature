
  Feature: Logar


    Scenario: Logar
      Given que o usuario está logado
      And digitar o login errado
      And digitar senha errada
      When clicar o botão logar
      Then uma mensagem de falha é exibida