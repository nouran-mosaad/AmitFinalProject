
Feature: Purchase Process


  Scenario: Successfully purchase products
    Given user is on the home page
    When user log in with username and password
    Then user should see a welcome message
    When user add the first laptop to the cart
    Then user should see a validation message product one added
    When user add the second laptop to the cart
    Then user should see a validation message product two added
    When user go to the cart
    Then the cart should contain the products Sony vaio i5 and Sony vaio i7
    And the prices should be 790 and 790
    And the total amount should be 1580
    When user place the order with details
    Then user should see a success message Thank you for your purchase
    And user confirm the purchase

