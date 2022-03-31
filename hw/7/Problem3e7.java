//Sorin Macaluso
//hw8
//CMPT 220 
//problem3e7.java

//This porgram makes a method that will calculate the interesection of 3 points.
//The program uses the equation to find the centroid of a circle.
//The main method calls the method and passes the input variables to it.

import java.util.Scanner;

public class Problem3e7 {
    //method to calculate the centroid of the three points
    public static double getCenterPoint(double a1, double b1, double a2, double b2, double a3, double b3){
        double xPoint = (a1 + a2 + a3)/3;
        double yPoint = (b1 + b2 + b3)/3;

        //prints the point out to the user
        System.out.println("The center point is at ( " + xPoint + " , " + yPoint + " ).");

        return 0.0;
    }

    public static void main(String[] args){
        //scanner to get input form user
        Scanner input = new Scanner(System.in);
        System.out.print("What are the points you want to input: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        //passes the values to the method
        getCenterPoint(x1, y1, x2, y2, x3, y3);


        
    }
    
}

