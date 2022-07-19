Feature: User should be able to login with correct credentials

  Background:
  Given user is in web table login page


  Scenario: Web table login scenario
    //Given user is in web table login page
    When user enter username "Test"
    And user enter password "Tester"
    And user click login button
    Then user should see url contains orders



  Scenario: positive login scenario
   // Given user is in web table login page
    When user enter username "Test",  password "Tester" and login
    Then user should see url contains orders


    Scenario: Map data table practice
      When user enters below credentials
      |username|Test|
      |password|Tester|
