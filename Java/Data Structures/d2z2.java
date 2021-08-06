package com.qarayna;

import java.util.InputMismatchException;
import java.util.Scanner;

public class d2z2 {
    public static void main(String[] args) {
        //2. Print elements of a given 2-d matrix with 4 rows and 3 columns
        int[][] matrica = new int[4][3];
        matrica[0][0] = 1;
        matrica[0][1] = 2;
        matrica[0][2] = 3;
        matrica[1][0] = 11;
        matrica[1][1] = 22;
        matrica[1][2] = 33;
        matrica[2][0] = 111;
        matrica[2][1] = 222;
        matrica[2][2] = 333;
        matrica[3][0] = 1111;
        matrica[3][1] = 2222;
        matrica[3][2] = 3333;


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(matrica[i][j]);
            }
        }
    }
}

