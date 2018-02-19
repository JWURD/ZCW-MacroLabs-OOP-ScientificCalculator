package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {
    private int currentNumerDisplayed = 0;
    private final static int DEFAULT_DISPLAY = 0;

    public Console() {
        currentNumerDisplayed = 0;
    }

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        return null;
    }

    public static Double getDoubleInput(String prompt) {
        return null;
    }


    public int getCurrentNumerDisplayed() {
        return currentNumerDisplayed;
    }

    public int clearDisplay() {
        currentNumerDisplayed = DEFAULT_DISPLAY;
        return currentNumerDisplayed;
    }

    public int changeNumberOnDisplay(String actionChosen, int number) {
        if (actionChosen.equalsIgnoreCase("Add")) {
            currentNumerDisplayed = sumOfNumbers(number);
        }
        else if (actionChosen.equalsIgnoreCase("Subtract")) {
            currentNumerDisplayed = differenceOfNumbers(number);
        }
        else if(actionChosen.equalsIgnoreCase("Multiply")){
            currentNumerDisplayed = productOfNumbers(number);
        }
        

    }

    /**
     * Add diplay number plus number desired to be added and return sum;
     *
     * @param number
     * @return
     */
    public int sumOfNumbers(int number) {
        int sumOfNumbers;
        sumOfNumbers = number + getCurrentNumerDisplayed();
        return sumOfNumbers;
    }

    public int differenceOfNumbers(int number) {
        int difference;
        difference = number - getCurrentNumerDisplayed();
        return difference;
    }

    /**
     * Multiple display number and number given return product.
     * @param number
     * @return
     */
        public int productOfNumbers(int number){
            int productOfNumbers;
            productOfNumbers = number * getCurrentNumerDisplayed();
            return productOfNumbers;
        }


    }

}
