
Feature: Login
  @login
  Scenario: Login as an authorized user
    Given  the user is on the login page
    When the user enter valid credential
    Then the user should be able to login
