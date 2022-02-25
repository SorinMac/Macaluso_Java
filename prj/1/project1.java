//Sorin Macaluso
//hw3
//CMPT 220 
//Problem4.java

import java.util.Scanner;

public class project1 {
    public static void main(String[] args){
        //creates the scanner
        Scanner input = new Scanner(System.in);
        System.out.print("What if your first number and what is the average (between -1000 and 1000): ");
        double numberOne = input.nextDouble();
        double average = input.nextDouble();

        //checks if the number is between the range of -1000 and 1000
        while( numberOne <= -1000 || average <= -1000 || numberOne >= 1000 || average >= 1000){
            System.out.print("What if your first number and what is the average (between -1000 and 1000): ");
            numberOne = input.nextDouble();
            average = input.nextDouble();
        }

        //does the math to find out what the second number is
        double numberTwo = (average * 2) - numberOne;
        
        //prints it out to the user
        System.out.println("Your second number is " + numberTwo + " .");




    }

}
