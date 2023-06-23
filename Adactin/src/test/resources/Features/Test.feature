@AdactinTests

Feature: Login Functionality

  @Login01
  Scenario: Login to Adactin with valid user credentials
    Given i navigate to adactin login page
    When i login with username and password for a user "Customer01"
    Then i validate login is successful

  @Login02
  Scenario Outline: Login to Adactin with valid user credentials
    Given i navigate to adactin login page
    When i login with username and password for a user "<userId>"
    Then i validate login is successful
    Examples:
      | userId     |
      | Customer01 |