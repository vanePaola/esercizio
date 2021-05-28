Feature:  Adding numbers with a Calculator
  In order to not learn math
  As someone who is bad at math
  I want to be able to add numbers using a Calculator

  @smokeTest
  Scenario:  Add two positive numbers
    Given I have a Calculator
    When I add 1 and 1
    Then the result should be 2

  @smokeTest
  Scenario:  Add a positive and negative number
    Given I have a Calculator
    When I add 1 and -1
    Then the result should be 0

  @smokeTest
  Scenario:  Add two negative numbers
    Given I have a Calculator
    When I add -1 and -1
    Then the result should be -2

  Scenario Outline: Add two numbers <x> & <y>
    Given I have a Calculator
    When I add <x> and <y>
    Then the result should be <result>

    Examples:
      | x | y | result |
      | -2 | 3 | 1 |
      | 10 | 15 | 25 |
      | 99 | -99 | 0 |
      | -1 | -10 | -11 |