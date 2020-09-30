package org.mblagov;

public class BoxingUnboxing {

    public static void main(String[] args) {
        BoxingUnboxing boxingUnboxing = new BoxingUnboxing();
        boxingUnboxing.compare2Ints(10,10);
        boxingUnboxing.compare2Ints(1000,1000);
    }

    void compare2Ints(Integer a, Integer b) {
        if (a == b) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
    }
}
