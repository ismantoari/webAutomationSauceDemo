@web

Feature: cart page

  @chartPage
  Scenario: user check shopping cart to confirm product Sauce Labs Bolt T-Shirt that already added to cart
    # Precondition: user already login and atc
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    And user click add to cart "Sauce Labs Bolt T-Shirt"
  # test chart page
    When user click shopping cart icon on homepage
    Then user is on shopping cart page


