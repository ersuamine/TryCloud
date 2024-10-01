@US05
Feature: User should be able to see Calendar

  Background: User is already in the log in page
    Given the user is on the login page

  @US05AC1 @wip
  Scenario:User can display daily calendar
    And user is logged in by clicking login button
    And user clicks "Calendar" module
    And user clicks calendar view menu button
    And user selects "Day" from the menu
    Then user sees calendar "day" view

  Scenario:User can display daily calendar
    And user is logged in by clicking login button
    And user clicks "Calendar" module
    And user clicks calendar view menu button
    And user selects "Day" from the menu
    Then user sees calendar "week" view

  Scenario:User can display daily calendar
    And user is logged in by clicking login button
    And user clicks "Calendar" module
    And user clicks calendar view menu button
    And user selects "Day" from the menu
    Then user sees calendar "month" view

