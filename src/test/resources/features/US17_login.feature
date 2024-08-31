@login
Feature: As a user, I should be able to log in.

  Background: User is already in the log in page
    Given the user is on the login page

    #can opt to use this in your user story for simplicity
    Scenario: Basic login by clicking login button
      Then the user is logged in

  Scenario Outline: Verify login with different user types
    Then the user logged in using "<submitType>"
    Examples:
      | submitType   |
      | loginButton |
      | enterKey    |

#additional acceptance criteria should be implemented





