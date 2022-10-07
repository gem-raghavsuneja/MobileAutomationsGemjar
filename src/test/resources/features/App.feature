@demo_app
Feature: Place an order successfully

  @place_an_order
  Scenario Outline: To place an order
    Given launch the application and login using "<UserName>" and "<Password>"
    And select catalog option
    And navigate to products page
    And logout the user

    Examples:
      | UserName        | Password |
      | bob@example.com | 10203040 |