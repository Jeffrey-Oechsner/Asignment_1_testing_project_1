Feature: Roman Numeral Converter

  Scenario: Convert Arabic numerals to Roman numerals
    Given the RomanConverter is available
    When I convert 1 to Roman numeral
    Then the result should be "I"

  Scenario: Convert 4 to Roman numeral
    Given the RomanConverter is available
    When I convert 4 to Roman numeral
    Then the result should be "IV"

  Scenario: Convert 9 to Roman numeral
    Given the RomanConverter is available
    When I convert 9 to Roman numeral
    Then the result should be "IX"

  Scenario: Convert 49 to Roman numeral
    Given the RomanConverter is available
    When I convert 49 to Roman numeral
    Then the result should be "XLIX"

  Scenario: Convert 3999 to Roman numeral
    Given the RomanConverter is available
    When I convert 3999 to Roman numeral
    Then the result should be "MMMCMXCIX"
