//Sorin Macaluso
//hw2
//CMPT 220 
//Problem1.java

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
    
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();
        
        //calculations
        double diameter = (radius * 2);
        double area = (3.1415926 * (radius * radius));

        //print out
        System.out.println("The diameter is: " + diameter);
        System.out.println("The area is: " + area);

    }
}
