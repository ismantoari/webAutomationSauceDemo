@web
Feature: Login

  #@web
  @login
  Scenario Outline: Login using valid username and password
    Given user is on login page
    And user input username with "<username>"
    And user input password with "<password>"
    When user click login button
    Then assert login "<case login>"

    Examples:
      |username     |password         | case login         |
      |standard_user|secret_sauce     | positive           |
      |standard_user|invalid_password | negative invalid   |
      |invalid_user |secret_sauce     | negative invalid   |
      |             |                 | negative blank     |
      |standard_user|                 | negative no pwd    |
