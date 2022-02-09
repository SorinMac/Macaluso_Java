//Sorin Macaluso
//hw2
//CMPT 220 
//Problem2.java

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
    
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the ball travel time in seconds: ");
        double time = input.nextDouble();

        //calculations
        double hieghtOfBuilding = ((0 * time) + (9.8 * ((time * time) / 2)));
        
        //print out
        System.out.println("The height of the building is " + hieghtOfBuilding + " meters.");
    }
}