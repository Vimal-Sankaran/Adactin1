@AdactinTests
@Adactin01

Feature: Adactin Hotel Booking Functionality

  @Login01
  Scenario: Login to Adactin with valid user credentials
    Given i navigate to adactin login page
    When i login with username and password for a user "Customer01"
    Then i validate login is successful

#  @Login02
#  Scenario Outline: Login to Adactin with valid user credentials
#    Given i navigate to adactin login page
#    When i login with username and password for a user "<userId>"
#    Then i validate login is successful
#    Examples:
#      | userId     |
#      | Customer01 |

  @SearchHotel01
  Scenario: Search for Hotel with valid details
    Given i enter booking details for "Customer01"
    When i click on search button in search hotel page
    Then i validate navigation to select hotel page

#  @SearchHotel02
#  Scenario Outline: Search for Hotel with valid details
#    Given i enter booking details for "<userId>"
#    When i click on search button in search hotel page
#    Then i validate navigation to select hotel page
#    Examples:
#      | userId     |
#      | Customer01 |
#
#  @SearchHotel03
#  Scenario Outline: Search for Hotel with valid details
#    Given i select location "<location>" in adactin search hotel page
#    When i select hotel "<hotel>" in adactin search hotel page
#    And i select room type "<roomType>" in adactin search hotel page
#    And i select number of rooms "<numberOfRooms>" in adactin search hotel page
#    And i enter check in date "<checkInDate>" in adactin search hotel page
#    And i enter check out date "<checkOutDate>" in adactin search hotel page
#    And i select adults per room "<adultsCount>" in adactin search hotel page
#    And i select children per room "<childrenCount>" in adactin search hotel page
#    And i click on search button in search hotel page
#    Then i validate navigation to select hotel page
#    Examples:
#      | location | hotel          | roomType   | numberOfRooms   | checkInDate   | checkOutDate   | adultsCount  | childrenCount  |
#      | London   | Hotel Sunshine | Double     | 3 - Three       | 22/08/2023    | 27/08/2023     | 2 - Two      | 2 - Two        |

  @SelectHotel01
  Scenario: Select Hotel as per the details provided
    Given i select hotel in adactin select hotel page
    And i validate hotel details are displayed for "Customer01"
    And i click on continue button in select hotel page
    Then i validate navigation to book hotel page

#  @SelectHotel02
#  Scenario Outline: Select Hotel as per the details provided
#    Given i select hotel in adactin select hotel page
#    And i validate hotel details are displayed for "<userId>"
#    And i click on continue button in select hotel page
#    Then i validate navigation to book hotel page
#    Examples:
#      | userId     |
#      | Customer01 |
#
#  @SelectHotel03
#  Scenario Outline: Select Hotel as per the details provided
#    Given i select hotel in adactin select hotel page
#    And i validate hotel name is displayed for "<userId>" in select hotel page
#    And i validate location is displayed for "<userId>" in select hotel page
#    And i validate rooms count is displayed for "<userId>" in select hotel page
#    And i validate arrival date is displayed for "<userId>" in select hotel page
#    And i validate departure date is displayed for "<userId>" in select hotel page
#    And i validate room type is displayed for "<userId>" in select hotel page
#    Then i validate navigation to book hotel page
#    Examples:
#      | userId     |
#      | Customer01 |