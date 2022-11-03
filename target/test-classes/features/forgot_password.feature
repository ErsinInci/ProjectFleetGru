@FLEETG-1535
Feature: Login 1 - Without any parameter

  Background:
    Given The user is on the login page

  @FLEETG-1518
    Scenario: User clicks "Forgot your password?" link
      When user clicks Forgot your password?
      Then User land on the ‘Forgot Password’page