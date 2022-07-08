 @P01
  Scenario: Adactin hotel search
    Given: user is on home page
    When: user enters search details
    
    |location|	  hotels		|room type|no.of rooms|	check-in | check-out |adults |	child	|
    |New York|Hotel Sunshine|Standard |	 2 - Two  |01/07/2022|11/07/2022]|1 - One|0 - None|

    Then user is on select hotel page
