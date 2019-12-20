Feature: Login

  Scenario: Selenium Practice
    Given I open automation practice
    When I click tab "Best Sellers"
    Then I verify "Printed Chiffon Dress" has a discount of "-20%"
    And I hover "Printed Chiffon Dress" and click on Add to cart
    And I click on Continue shopping
    And I hover "Blouse" and click on Add to cart
    And I click on Continue shopping
    And I go to the Cart drop down and select Checkout
    And I verify "Printed Chiffon Dress" is In stock
    And I verify "Blouse" is In stock
    And I remove "Blouse" from the list
    And I verify "Blouse" is no longer displayed in the table
    And I verify that the total amount to pay is "$18.40"