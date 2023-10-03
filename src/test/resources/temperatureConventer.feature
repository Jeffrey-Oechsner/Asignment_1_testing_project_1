Feature: Temperature Converter

  Scenario: Convert Fahrenheit to Celsius
    Given a temperature in Fahrenheit is 32.00
    When I convert it to Celsius
    Then the result should be 0.00 Celsius

  Scenario: Convert Celsius to Fahrenheit
    Given a temperature in Celsius is 0.00
    When I convert it to Fahrenheit
    Then the result should be 32.00 Fahrenheit
