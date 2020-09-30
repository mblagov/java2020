package org.mblagov.conditions;

import java.util.Random;

public class Conditions {

    public static void main(String[] args) {

        Random r = new Random();
        if (r.nextInt() < 0) {
            System.out.println("<0");
        } else {
            System.out.println(">0");
        }

        int a = 3;
        switch(a) {
            case 0:
                System.out.println("0");
                break;
            case 2 | 3:
                System.out.println("2 or 3");
                break;
            default:
                System.out.println(a);
        }


    }
}
