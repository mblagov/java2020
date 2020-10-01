package org.mblagov.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class InputSample {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите сумму и нажмите enter");
        String sumLine = br.readLine();
        long sum = Long.parseLong(sumLine);
        System.out.println("Введите купюры через пробел");
        String nominalsLine = br.readLine();
        String[] nominalStrings = nominalsLine.split(" ");
        int n = nominalStrings.length;
        long[] nominals = new long[n];
        for (int i = 0; i < n; i++) {
            nominals[i] = Long.parseLong(nominalStrings[i]);
        }
        System.out.println("Сумма для размена: " + sum);
        System.out.println("Купюры для размена: ");
        System.out.println(Arrays.toString(nominals));
    }

    public static void inputViaScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму");
        long sum = sc.nextLong();
        System.out.println("введите количество купюр");
        int n = sc.nextInt();
        long[] nominals = new long[n];
        System.out.println("Введите купюры через пробел");
        for (int i = 0; i < n; i++) {
            nominals[i] = sc.nextLong();
        }
        System.out.println("Сумма для размена: " + sum);
        System.out.println("Купюры для размена: ");
        System.out.println(Arrays.toString(nominals));

        sc.close();
    }
}
