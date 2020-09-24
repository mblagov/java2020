package org.mblagov;

import java.io.InputStream;
import java.util.Scanner;

public class Summator {

    public int sum(int a, int b) {
        if (a < 0 || b < 0) {
            throw new RuntimeException("Trying to sum negative numbers");
        }
        return a + b;
    }

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        int sum = getSum(inputStream, new Summator());
        System.out.println(sum);
    }

    static int getSum(InputStream inputStream, Summator summator) {
        Scanner sc = new Scanner(inputStream);

        int a = sc.nextInt();
        int b = sc.nextInt();

        return summator.sum(a,b);
    }
}
