Feature: Add to cart functionality after login and adding address

  Scenario: User is on the amazon web page
    Given Open up chrome and launch amazon website
    When Enter valid credentials
    And User is logged in
    When The user adds the address in address section
    When The user search for iphonex
    And Selects appropriate item
    Then The item will be added to the cart
