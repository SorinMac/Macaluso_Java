//Sorin Macaluso
//hw3
//CMPT 220 
//problem2w5.java

import java.util.Scanner;

public class problem2w5 {

public static void main(String[] args) {
    //creates the scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of the sides: ");
    double sideNumber = input.nextDouble();
    System.out.print("Enter the radius of the circle: ");
    double radius = input.nextDouble();

    //constant value for PI
    final double PI = 3.14159;

    //simple message for the user
    System.out.println("The coordinates of the points on the polygon are ");

    //does the calculations and prints out the points
    for (double i = 0; i < sideNumber; i++){
        double xPoint = radius * java.lang.Math.cos(2.0 * PI / sideNumber * i);
        double yPoint = radius * java.lang.Math.sin(2.0 * PI / sideNumber * i);
        System.out.print("( ");
        System.out.printf("%.2f", xPoint);
        System.out.print(" )");
        System.out.print(" , ");
        System.out.print("( ");
        System.out.printf("%.2f", yPoint);
        System.out.print(" )");
        System.out.println();
    }


   

   }
}