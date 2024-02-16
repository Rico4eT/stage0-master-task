package com.epam.loops;

import java.sql.PreparedStatement;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        for (int i = 1; i <= 10; i++) {
            String digit = String.valueOf(numberTableToPrint);
            String iterator = String.valueOf(i);
            System.out.println(iterator + " x " + digit + " = " + i * numberTableToPrint);
        }
    }

}
