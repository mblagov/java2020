package org.mblagov.inheritance;

public class Main {

    public static void main(String[] args) {
        A a = new B();
        A a2 = new C();

        System.out.println(a.name());
        System.out.println(a2.name());
    }
}
