@web
Feature: check out
  @checkout
  Scenario: user check out product Sauce Labs Bolt T-Shirt after add to cart
    # Precondition: user already login and atc
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    And user click add to cart "Sauce Labs Bolt T-Shirt"
    And user click shopping cart icon on homepage
    And user is on shopping cart page
    #Check out
    When user click check out button
    Then user is on your information page




