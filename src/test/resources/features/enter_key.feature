@FLEETG-1535
Feature: Login 1 - Without any parameter

  Background:
    Given The user is on the login page


  @FLEETG-1521
    Scenario: user enter key of keyboard
      When user enter username
      And user enter password
      And user enters the enter key
      Then The user is on the Quick Launchpad page