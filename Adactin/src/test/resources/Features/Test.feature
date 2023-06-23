@AdactinTests
@Adactin01

  Feature: SearchHotel Functionality

    Scenario: SearchHotelPage Validation
      Given i enter booking details for "Customer01"
      When i click on search button in SearchHotel Page
      Then i validate navigation to Select Hotel page

Feature: Login Functionality
    Scenario Outline: SearchHotelPage Validation
      Given i enter booking details for "<userId>"
      When i click on search button in SearchHotel Page
      Then i validate navigation to Select Hotel page
      Examples:
        |userId    |
        |Customer01|

    Scenario Outline: SearchHotelPage Validation
      Given i enter location "<Location>" in Adactin Search Hotel Page
      When i enter hotels "<Hotels>" in Adactin Search Hotel Page
      And i enter roomType "<Room Type>" in Adactin Search Hotel Page
      And i enter numberOfRooms "<Number of Rooms>" in Adactin Search Hotel Page
      And i enter checkInDate "<Check In Date>" in Adactin Search Hotel Page
      And i enter checkOutDate "<Check Out Date>" in Adactin Search Hotel Page
      And i enter adultsPerRoom "<Adults Count>" in Adactin Search Hotel Page
      And i enter childrenPerRoom "<Children Count>" in Adactin Search Hotel Page
      And i click on search button in SearchHotel Page
      Then i validate navigation to Select Hotel page
      Examples:
        | Location | Hotels         | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults Count | Children Count |
        | London   | Hotel Sunshine | Double    | 3-Three         | 22/06/2023    | 27/06/2023     |  2-Two       | 2-Two          |

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