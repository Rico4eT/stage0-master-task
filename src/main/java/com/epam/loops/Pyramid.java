package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = i; j < cathetusLength; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(i - k + 1);
            }
            for (int a = 1; a <= i; a++) {
                System.out.print(a);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
