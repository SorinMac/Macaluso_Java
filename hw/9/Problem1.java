//Sorin Macaluso
//hw10
//CMPT 220 
//Problem1.java

//uses try and catch to try for something and catch an error if needed.

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        // intializing all the variables needed
        int indexNumber = 0;
        int checkValue = 0;
        double[] randomNumbers = new double[100];

        // puts 100 random int in an array of 100
        for (int i = 0; i < 100; i++) {
            randomNumbers[i] = Math.random() * 100;
        }

        // try catch to catch errors
        try {
            // the math in the try
            Scanner input = new Scanner(System.in);
            System.out.print("Out of the 100 numbers which would you like to see: ");
            indexNumber = input.nextInt();
            checkValue = (int) randomNumbers[indexNumber];
            System.out.println("The number you asked for is " + checkValue);
        // JA: Ypou had to explicitely catch ArrayIndexOutOfBoundException
        } catch (Exception e) {
            // error message to send back
            System.out.println("Out of Range.");
        }

    }

}