Feature: Wong Page
  As a web user
  I want to use Wong page
  to add a product to the car according to my needs

  @Scenario1
  Scenario Outline: Add a product to a car
    Given that "<actor>" looks for the first product
    When she completes the filter with "<product>"
    And she add the <selected> to a car
    Then she sees in the car the "<added>"

    Examples: 
      | actor   | product   | selected| added |
      | Yohanna | papas     | papas   | papas |



