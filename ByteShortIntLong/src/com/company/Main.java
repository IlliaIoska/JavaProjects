package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Min int value " + myMinIntValue);
        System.out.println("Max int value " + myMaxIntValue);
        System.out.println("Busted max " + (myMaxIntValue + 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Min Byte " + myMinByteValue);
        System.out.println("Max Byte " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Min Short " + myMinByteValue);
        System.out.println("Max Short " + myMaxByteValue);

        long myLongValue = 100L;
        long myMinlongValue = Long.MIN_VALUE;
        long myMaxlongValue = Long.MAX_VALUE;
        System.out.println("Min long " + myMinByteValue);
        System.out.println("Max long " + myMaxByteValue);

        byte newByte = (byte) (myMaxByteValue / 2);
        System.out.println(newByte);

        short newInt = (short) (myMinShortValue * 2);
        System.out.println(newInt);

        byte extraByte = 127;

        short extraShort = 255;

        int extraInt = 1000;

        short byteShortIntSum = (short) (extraByte +  extraInt + extraShort);
        System.out.println(byteShortIntSum);

        long extraLong = 50000L + 10L * byteShortIntSum;
        System.out.println(extraLong);


    }
}
