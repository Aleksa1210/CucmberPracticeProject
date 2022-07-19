@smoke
Feature: Google Search Functionality Title Verification
  user story: As a user, when I am on the Google search page
  I should be able to search whatever I want and see relevant information

 // Background: User is on Google search page


  Scenario: Search functionality result title verification
   Given User is on Google search page
    When User types apple in the google search box and clicks enter
    Then User sees apple – Google Search is in the google title


  Scenario: Search functionality result title verification
   Given User is on Google search page
    When User types "apple" in the google search box and clicks enter
    Then User sees "apple - Google Search" is in the google title
