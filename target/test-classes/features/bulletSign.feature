@FLEETG-1535
Feature: Login 1 - Without any parameter

  Background:
    Given The user is on the login page

  @FLEETG-1520
  Scenario:  password in bullet signs
    When user enters password
    Then the password is in bullet sign