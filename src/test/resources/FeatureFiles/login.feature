@Login
Feature: Login Action

  @Logiwithvalid
  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters Valid username and Valid Password
    Then Message displayed Login Successfully

    @Loginwithinvalid
  Scenario: Successful Login with Invalid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    Then Message displayed Login Successfully

  Scenario: Successful LogOut
    When User LogOut from the Application
    Then Message displayed LogOut Successfully