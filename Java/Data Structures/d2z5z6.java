package com.qarayna;

import java.util.LinkedList;

public class d2z5z6 {
    public static void main(String[] args) {
//double [] digits={1,5.6,8.3,3.7};
//        System.out.println(digits[2]);
// 5. Reverse the order of the elements in a LinkedList using algorithm
        LinkedList<String> list = new LinkedList<String>();
        list.add("dvaiset");
        list.add("triiset");
        list.add(2, "chetireset");
        list.add(1, "nesto");
        list.add(0, "drugo");
        list.addLast("deset");
        list.add("dvaisetidve");
        System.out.println(list);
        System.out.println(list.get(2));
        for (int i = list.size() - 1; i > 0; i--) {

            System.out.print(list.get(i) + " ");
        }
//6.Find sum of the diagonal of a given 2d matrix with 4 rows and 4 columns
        double[][] twodim = new double[4][4];
        int x=0;
        int y=0;

        twodim[0][0] = 1;
        twodim[0][1] = 2;
        twodim[0][2] = 3;
        twodim[0][3] = 4;
        twodim[1][0] = 5;
        twodim[1][1] = 6;
        twodim[1][2] = 7;
        twodim[1][3] = 8;
        twodim[2][0] = 9;
        twodim[2][1] = 10;
        twodim[2][2] = 11;
        twodim[2][3] = 12;
        twodim[3][0] = 13;
        twodim[3][1] = 14;
        twodim[3][2] = 15;
        twodim[3][3] = 16;
//ako se obyrne redyt na zapisvane na koloni-red ili redove-koloni, rezultatyt e sushtiqt.......woa
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(twodim[i][j]);
            }
            x= (int) (twodim[0][0]+twodim[1][1]+twodim[2][2]+twodim[3][3]);
            y= (int) (twodim[3][0]+twodim[1][2]+twodim[2][1]+twodim[0][3]);
            int sum = x + y;
            System.out.println(sum);
        }
    }
}
