package com.company;

public class Main {

    public static void main(String[] args) {
	    //int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        System.out.println(myMinValue);

        //byte has a width of 8;
        byte myByteValue = -128;
        byte myNewByte   = (byte) (myByteValue/2);  //since java converts all assignments to an integer by default
                                                    // so we have to use casting and implicitly mention byte to work with bytes

        //short has a width of 16
        short myShortValue = 32767;

        //long has a width of 64
        long myLongValue = 100L;

        long myValue = 5000L + (10L * myByteValue) + myShortValue + myMinValue;
        System.out.println("The result of the expression is " + myValue);
    }
}
