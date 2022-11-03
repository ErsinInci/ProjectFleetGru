@FLEETG-1535
Feature: Login 1 - Without any parameter

  Background:
    Given The user is on the login page

  @FLEETG-1452
  Scenario: Login as a driver
    When The user logs in as a driver
    Then The user is on the Quick Launchpad page
  @FLEETG-1453
  Scenario: Login as a sales manager
    When The user logs in as a sales manager
    Then The user is on the Dashboard page
  @FLEETG-1454
  Scenario: Login as a store manager
    When The user logs in as a store manager
    Then The user is on the Dashboard