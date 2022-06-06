@Regression @Smoke @login

  Feature: users open google browser and search for tesla company, and then tesla should be the new title of google

    @Smoke
  Scenario: searching for tesla

    Given user on google page
    When user search for ("tesla")
    Then Validate the keyword ("tesla") is visible in the title
