Feature: Find the dealer and verify

  Scenario Outline: Find the dealers and verify the dealers are in the list
    Given I am on homepage
    When I mouse hover on buy+sell tab
    And I click Find a Dealer
    Then I navigate to car-dealers page
    And I should see the dealer names "<dealersNames>" are display on page
    Examples:
      | dealersName             |
      | 3 Point Motor Epping    |
      | 4WD Specialist Group    |
      | 5 Star Auto             |
      | A & M Car Sales Pvt Ltd |
      | A1 MOTORS COMPANY       |
      | ANDREA MOTOR SERVICE    |
      | Oxford Motors           |



