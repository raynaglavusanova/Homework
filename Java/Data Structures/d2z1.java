package com.qarayna;

import java.util.InputMismatchException;
import java.util.Scanner;

public class d2z1 {
    public static void main(String[] args) {
//1. Write program to print sum of a given array elements
        double sum = 0;
        int n = 0;
        int i;
        Scanner sc = new Scanner(System.in);
        boolean valid = false;
        while (!valid) {
            try {
                System.out.println("Enter the desired array length: ");
                n = sc.nextInt();
                if (n > 0) {
                    valid = true;
                } else System.out.println("Array length must be at least one object.");
            } catch (InputMismatchException | ArrayIndexOutOfBoundsException | NegativeArraySizeException p) {
                System.out.println("Keep in mind that the length of the array can be a whole number only. ");
                sc.nextLine();
            }
        }
        double[] array1 = new double[n];
        System.out.println("Enter the elements of the array here: ");
        for (i = 0; i < n; i++) {
            try {
                array1[i] = sc.nextDouble();
            } catch (InputMismatchException | ArrayIndexOutOfBoundsException m) {
                System.out.println("I cannot sum letters :(");
                i--;
                sc.nextLine();
            }
        }
        System.out.println("The array elements are: ");
        for (i = 0; i < n; i++) {
            System.out.println(array1[i]);
        }
        for (i = 0; i < n; i++) {
            sum = sum + array1[i];
        }
        System.out.println("The sum of the digits in the array is: " + sum);
    }
}
