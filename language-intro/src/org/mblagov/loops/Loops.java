package org.mblagov.loops;

import java.util.ArrayList;
import java.util.List;

public class Loops {

    public static void main(String[] args) {

        // for
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // while
        int j = 1;
        while (j < 10) {
            System.out.println(j);
            j++;
        }

        // postcond
        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while (k < 10);


        List<String> list = new ArrayList<String>();
        list.add("test");

        list.forEach((elem) -> System.out.println(elem));

        for (String elem: list) {
            System.out.println(elem);
        }

    }
}
