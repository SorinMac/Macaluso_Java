//Sorin Macaluso
//hw3
//CMPT 220 
//Problem4.java

import java.util.Scanner;

public class Problem2 {
        public static void main(String[] args){

            //create a scanner
            Scanner input = new Scanner(System.in);
            System.out.print("What is the numerator: ");
            int numerator = input.nextInt();
            System.out.print("What is the denominator: ");
            int denominator = input.nextInt();
            int newFraction = 0;
            int remaindor = 0;

            if (numerator < denominator){
                //prints the output
                System.out.println( numerator + " / " + denominator + " is a proper fraction.");
            }
            else if (numerator > denominator){
                //calculationsssss
                newFraction =  numerator / denominator;
                remaindor = numerator % denominator;

            }
            
            if (remaindor != 0){
                //prints the output
                System.out.println( numerator + " / " + denominator + " is a improper fraction and can be reduced to " + newFraction + " + " + remaindor + " / " + denominator);
            }
            else if (remaindor == 0){
                //prints the output
                System.out.println( numerator + " / " + denominator + " is a improper fraction and can be reduced to " + newFraction);
            }
           
    }
}
    