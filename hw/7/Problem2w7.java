//Sorin Macaluso
//hw8
//CMPT 220 
//problem2w7.java

//This porgram makes a method that will calculate the interesection of 4 points.
//The main method calls the method and passes the input variables to it.

import java.util.Scanner;

public class Problem2w7 {
    //method for calculations
    public static double getIntersectingPoint(double x1x, double y1y, double x2x, double y2y, double x3x, double y3y, double x4x, double y4y){ 
        //multiple calculations to find different parts to find the x point and y point
        double parta = y1y - y2y;
        double partb = -(x1x - x2x);
        double parte = ((y1y - y2y)*x1x) - ((x1x - x2x)*y1y);
        double partc = y3y - y4y;
        double partd = -(x3x - x4x);
        double partf = ((y3y - y4y)*x3x) - ((x3x - x4x)*y3y);

        //actual finding of the x point and y point
        double pointx = ((parte * partd) - (partb * partf)) / ((parta * partd) - (partb * partc));
        double pointy = ((parta * partf) - (parte * partc)) / ((parta * partd) - (partb * partc));
        
        //prints oupt to user
        System.out.println("Your intersection point is (" + pointx + " , " + pointy + ").");

        //return value so the method will complie
        return 0.0;
    }

    public static void main(String[] args){
        //opens a scanner to take in user input
        Scanner input = new Scanner(System.in);
        System.out.print("What are the points you want to input: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();
        
        //passes those variables to the method
        getIntersectingPoint(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    
}
