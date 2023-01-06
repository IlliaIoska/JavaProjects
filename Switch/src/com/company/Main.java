package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int switchValue = 2;

        switch(switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;

            case 2:
                System.out.println("Value is 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Either 3, or 4, or 5");
                break;

            default:
                System.out.println("Neither 1, nor 2");
                break;
        }

        String charVar = "d";

        switch (charVar.toUpperCase(Locale.ROOT)) {
            case "D":
            case "C":
                System.out.println("it is " + charVar);
                break;

            default:
                System.out.println("the char " + charVar + " is not found");
        }
    }
}
