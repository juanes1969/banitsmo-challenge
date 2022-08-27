#autor: jolaya@qvision.com.co
Feature: Automate practice page
  As a web user
  I need to validate the total price of the selected courses
  To validate that this is correct and continue with the purchase



  Scenario Outline: Correct price validation
    Given That Juan is on the home page
    When Select the courses <course1> and <course2>
    Then Validate that when entering the cart and delete <course1> the price is less 400

    Examples:
      | course1       | course2              |
      | Selenium Ruby | Mastering JavaScript |





