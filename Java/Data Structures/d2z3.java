package com.qarayna;

import java.util.InputMismatchException;
import java.util.Scanner;

public class d2z3 {
    public static void main(String[] args) {
//3. Print elements of a given 2-d matrix with dynamic rows and columns taken from user input
        int m = 0, n = 0, i, j = 0;
        Scanner sc = new Scanner(System.in);
        boolean valid = false;
        while (!valid) {
            try {
                System.out.println("Enter the number of rows you want to include in your matrix: ");
                m = sc.nextInt();
                System.out.println("Enter the number of columns you want to include in your matrix: ");
                n = sc.nextInt();
                if (m > 0 && n > 0) {
                    valid = true;
                    System.out.println("Thanks ;)");
                } else {
                    valid = false;
                    System.out.println("These values must be positive");
                    sc.nextLine();

                }
            } catch (InputMismatchException | ArrayIndexOutOfBoundsException p) {
                System.out.println("No letters or strange symbols pls");
                sc.nextLine();
            }
        }

        double[][] twodim = new double[m][n];
        for (i = 0; i < m; i++)
            try {
                for (j = 0; j < n; j++) {
                    try {
                        System.out.println("Enter the value of each element: ");
                        twodim[i][j] = sc.nextDouble();
                    } catch (InputMismatchException | ArrayIndexOutOfBoundsException p) {
                        System.out.println("No letters or strange symbols pls1");
                        j--;
                        sc.nextLine();
                    }
                }
            } catch (InputMismatchException | ArrayIndexOutOfBoundsException p) {
                System.out.println("No letters or strange symbols pls2");
                i--;
                System.out.println("Try again here: ");
                sc.nextLine();
            }
        System.out.println("The elements of your matrix are: ");
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++)
                System.out.print(twodim[i][j] + "  ");
        System.out.println();


    }
}
//    //3. Print elements of a given 2-d matrix with dynamic rows and columns taken from user input
//    int m = 0, n = 0, i, j;
//    Scanner sc = new Scanner(System.in);
//    boolean valid = false;
//        while (!valid) {
//                try {
//                System.out.println("Enter the number of rows you want to include in your matrix: ");
//                m = sc.nextInt();
//                System.out.println("Enter the number of columns you want to include in your matrix: ");
//                n = sc.nextInt();
//                if (m > 0 && n > 0) {
//                valid = true;
//                System.out.println("Thanks ;)");
//                } else {
//                valid = false;
//                System.out.println("These values must be positive");
//                sc.nextLine();
//
//                }
//                } catch (InputMismatchException | ArrayIndexOutOfBoundsException p) {
//                System.out.println("No letters or strange symbols pls");
//                sc.nextLine();
//                }
//                }
//                boolean valid1 = false;
//                while (!valid1) {
//                try {
//                System.out.println("Enter the value of each element: ");
//                double[][] twodim = new double[m][n];
//                for (i = 0; i < m; i++) {
//        for (j = 0; j < n; j++) {
//        twodim[i][j] = sc.nextDouble();
//        valid = true;
//        }
//        }
//        System.out.println("The elements of your matrix are: ");
//        for (i = 0; i < m; i++)
//        for (j = 0; j < n; j++)
//        System.out.print(twodim[i][j] + "  ");
//        System.out.println();
//        break;
//        } catch (InputMismatchException | ArrayIndexOutOfBoundsException p) {
//        System.out.println("No letters or strange symbols pls");
//        sc.nextLine();
//        }
//        }
//
//        }
//        }








