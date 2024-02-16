package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        String result = "";
        int temp;
        while (number > 0) {
            temp = number % 10;
            result += temp;
            number = number / 10;
        }
        System.out.println(result);
    }

}
