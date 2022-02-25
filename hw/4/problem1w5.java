//Sorin Macaluso
//hw3
//CMPT 220 
//Problem4.java

import java.util.Scanner;

public class problem1w5 {
    public static void main(String[] args){
        //creates the scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        double sideNumber = input.nextDouble();
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        //my constant for PI
        final double PI = 3.14159;
        
        //math for the area
        double area = (sideNumber * (side*side)) / (4 * Math.tan(PI/sideNumber));
        
        //prints it for the user
        System.out.println("The area of the polygon is " + area + " .");
    }
}
