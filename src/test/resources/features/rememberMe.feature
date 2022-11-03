@FLEETG-1535
Feature: Login 1 - Without any parameter

  Background:
    Given The user is on the login page

  @FLEETG-1519
  Scenario: user can see Remember me link
    When user clicks Remember me link
    Then the link is clickable