Feature: Login
  As a ITV user I want to utilise the login feature
  So that I can use the customisation features

  Scenario: I receive a valid error when using an incorrect password
    Given I am on the sign in page
    When I input an invalid email
    And an invalid password
    Then I receive a valid error