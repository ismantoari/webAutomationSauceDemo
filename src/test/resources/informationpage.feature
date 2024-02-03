Feature: information page check out
  @web
  @informationPage
  Scenario: user check out product Sauce Labs Bolt T-Shirt after add to cart
    # Precondition: user already login and atc
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    And user click add to cart "Sauce Labs Bolt T-Shirt"
    And user click shopping cart icon on homepage
    And user is on shopping cart page
    And user click check out button
    And user is on your information page

    When user input first name "Ari"
    And user input last name "Abdul Rahman"
    And user input zip or postal code "57221"
    And user click continue button
    Then user is on Checkout Overview page