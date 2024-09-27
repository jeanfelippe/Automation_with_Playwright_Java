Feature: Login
  Scenario Outline: Login to the SwagLabs Application with the correct credentials.
    Given User launched SwagLabs application
    When User verify the Page title
    When User logged in to the app using the username "<UserName>" and password "<Password>"
    Then User verifies the product name "<ProductName>"
    Then User logout from the application

    Examples:
      | UserName | Password | ProductName |
      | standard_user | secret_sauce | Sauce Labs Backpack |



  Scenario Outline: Login Error to the SwagLabs Application with the incorrect credentials.
    Given User launched SwagLabs application
    When User logged in to the app using the username "<UserName>" and password "<Password>"
    Then error message is showed

    Examples:
      | UserName | Password | ProductName |
      | fake | fake | Sauce Labs Backpack |