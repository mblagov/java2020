package org.mblagov.inheritance;

public class B  extends A{

    @Override
    public String name() {
        return super.name() + "B";
    }
}
