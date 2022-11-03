@FLEETG-1535
Feature: Login 1 - Without any parameter

  Background:
    Given The user is on the login page

  @FLEETG-1517
    Scenario: leave username or password empty
      When user leaves username empty
      Then user sees Please fill out this field message

