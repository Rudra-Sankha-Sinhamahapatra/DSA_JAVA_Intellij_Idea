package com.rudra.oops5_interfaces.Interfaces.Nested;

public class A {
    //nested interface
    public interface nested{
        boolean isOdd(int num);
    }
}

class  B implements A.nested{

    @Override
    public boolean isOdd(int num) {
        return (num & 1)==1;
    }
}

