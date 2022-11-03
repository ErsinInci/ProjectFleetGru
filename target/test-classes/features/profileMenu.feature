@FLEETG-1535
Feature: Login 1 - Without any parameter



  Background:
    Given The user is on the login page

  @FLEETG-1533
  Scenario:users see their username

    When user enters  username
    And user enters  password
    And user press the enter key
    Then user should see own username

