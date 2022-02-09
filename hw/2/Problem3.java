//Sorin Macaluso
//hw2
//CMPT 220 
//Problem3.java

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
    
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the friction force in Newtons: ");
        double frictionForce = input.nextDouble();
        System.out.print("Enter the objects mass in kg: ");
        double massInKg = input.nextDouble();
        System.out.print("Enter the objects acceleration in m/s^2: ");
        double acceleration = input.nextDouble();
        
        //calculations
        double  coefficientFriction = (((frictionForce / massInKg) - acceleration)/9.8);
        
        //print out
        System.out.println("The coefficient for friction is " + coefficientFriction);

    }
}
