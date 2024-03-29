package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

public class Singleton {

    // #1 - Create a private constructor
    private Singleton(){}

    // #2 - Create a private static String
    // Prevent access and provide a getter method
    private static String word;

    // This utility method will return the "word" in the way that we want it to return
    public static String getWord(){

        if (word == null){
            System.out.println("First time call. Word object is null. Assigning value to it now");
            word = "something";
        } else {
            System.out.println("Word already has value.");
        }

        return word;
    }

}
