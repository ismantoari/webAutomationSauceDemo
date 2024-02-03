Feature: add to cart
  @web
  @atc
  Scenario: user do add to cart of Sauce Labs Bolt T-Shirt
    # user already login
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    #user do atc
    When user click add to cart "Sauce Labs Bolt T-Shirt"
    Then validate cart badge notification is "1"