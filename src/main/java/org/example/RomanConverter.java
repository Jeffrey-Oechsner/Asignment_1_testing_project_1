package org.example;

public class RomanConverter {
    public static void main(String[] args) {
        int[] arabicNumbers = { 1, 4, 9, 49, 3999 };

        for (int num : arabicNumbers) {
            System.out.println(num + " -> " + RomanConverter.convertToRoman(num));
        }
    }

    public static String convertToRoman(int num) {
        if (num < 1 || num > 3999) {
            throw new IllegalArgumentException("Input must be between 1 and 3999");
        }

        StringBuilder roman = new StringBuilder();
        int index = 0; // Index to keep track of the current Roman numeral to consider

        while (num > 0) {
            int div = num / VALUES[index]; // How many times the current Roman numeral should be used
            num %= VALUES[index]; // Update the remaining value

            // Append the Roman numeral to the result 'div' times
            for (int i = 0; i < div; i++) {
                roman.append(ROMAN_NUMERALS[index]);
            }

            index++; // Move to the next Roman numeral
        }

        return roman.toString();
    }

}
