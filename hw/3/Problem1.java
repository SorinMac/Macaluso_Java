//Sorin Macaluso
//hw3
//CMPT 220 
//Problem4.java

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args){

        //create a scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();


        //calculations
        double discrimenant = (b*b) - (4*a*c);
        double rootOne = (-b + (Math.pow((b*b) - (4*a*c), 0.5))) / 2*a;
        double rootTwo = (-b - (Math.pow((b*b) - (4*a*c), 0.5))) / 2*a;

        if (discrimenant > 0){
            //print the roots
            System.out.println("Root 1 = " + rootOne + " Root 2 = " + rootTwo);
        }
        else if(discrimenant == 0){
            //prints one root
            System.out.print("Your quadratic formula has one root " + rootOne + " .");
        }
        else{
            //prints none of the roots
            System.out.println("Your quadratic equation has no real roots.");
        }

    }
    
}
