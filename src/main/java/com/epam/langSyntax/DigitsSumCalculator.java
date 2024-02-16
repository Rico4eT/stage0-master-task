package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int result = 0;
        int temp;
        while (number > 0) {
            temp = number % 10;
            result += temp;
            number = number / 10;
        }
        System.out.println(result);
    }

}
