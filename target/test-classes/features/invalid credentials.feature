@FLEETG-1535
Feature: Login 1 - Without any parameter

  Background:
    Given The user is on the login page


    @FLEETG-1515
    Scenario: Enter invalid password
      When user enters valid username and invalid password
      Then user sees Invalid username or password
  @FLEETG-1516
    Scenario: Enter invalid username
      When the user enters valid password and invalid username
      Then the user sees Invalid username or password