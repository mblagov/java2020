package org.mblagov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Variables {

    public static void main(String[] args) {
        String s = "asd";
        int a = 20;
        long b = 1L +  Integer.MAX_VALUE;
        double d = 1.0d;
        boolean bool = false; // true

        // https://medium.com/@bpnorlander/java-understanding-primitive-types-and-wrapper-objects-a6798fb2afe9
        Integer wrapperInt = 10;
        Integer wrapperInt2 = 10;

        System.out.println(wrapperInt == wrapperInt2);

        System.out.println(9/2);

        String[] array = new String[20];
        System.out.println(array);
        System.out.println(Arrays.toString(array));


        List list = new ArrayList<>();
        list.add(10);
    }
}
