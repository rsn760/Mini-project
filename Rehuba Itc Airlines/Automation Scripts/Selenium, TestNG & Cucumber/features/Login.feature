Feature: Adactin Hotel Login Feature

  @p00
  Scenario: Adactin Hotel Login Test Scenario
    Given user is on Login Page
    When title of login page is Adactin Hotel
    When user enters username and password
    And user clicks on login button
    Then user is on the home page

  @p01
  Scenario: Adactin hotel search
    Given: user is on home page
    When: user enters search details
    |					location			 |				hotels				|				room type					|				no.of rooms			 |					check-in				|					check-out					|					adults					 |						child					|
    |//select[@id='location']|//select[@id='hotels']|//select[@id='room_type']|//select[@id='room_nos']|//input[@id='datepick_in']|//input[@id='datepick_out']|//select[@id='adult_room']|//select[@id='child_room']|

