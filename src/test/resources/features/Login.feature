@Regression
Feature: Library app login feature
  User Story:As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.

  Accounts are: librarian, student, admin


  // Rge same like method @Before running first
  Background: For each scenario user is on library page
    Given user is on the library login page


  @librarian @employee @smoke
  Scenario: Login as librarian
   // Given user is on the library login page
    When user enter librarian username
    And user enters librarian password
    Then user should be see dashboard


@student @smoke
  Scenario: Login as student
   // Given user is on the library login page
    When user enter student username
    And user enters student password
    Then user should be see dashboard

  Scenario: Login as admin
   // Given user is on the library login page
    When user enter admin username
    And user enters admin dashboard
   Then user should be see dashboard


