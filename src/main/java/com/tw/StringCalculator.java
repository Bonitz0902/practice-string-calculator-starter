package com.tw;

public class StringCalculator {
    public int add(String string) {
        if (string == null || string.equals("")) return 0;

        return string.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .sum();
    }

}
