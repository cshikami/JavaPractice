package com.cshikami;

public class MaxValues {

    public static void main(String[] args) {

        byte b = 127;
        System.out.println("Byte: " + b);

        if (b < Byte.MAX_VALUE) {
            b++;
        }
        System.out.println("Byte: " + b); //127 is max value of a byte. Without if statement, if you add 1 more, it wraps around
                                          //and now has minimum value for that data type
    }
}
