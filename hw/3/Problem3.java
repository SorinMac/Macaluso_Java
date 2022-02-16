//Sorin Macaluso
//hw3
//CMPT 220 
//Problem4.java

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args){

        //create a scanner
        Scanner input = new Scanner(System.in);
        System.out.print("What are coordinates for the two points: ");
        double xOne = input.nextDouble();
        double yOne = input.nextDouble();
        double xTwo = input.nextDouble();
        double yTwo = input.nextDouble();

        //calculations
        double m = (yTwo - yOne) / (xTwo - xOne);
        double b = yOne - (m * xOne);

        //prints part of the output
        System.out.print("The line equation for two points (" + xOne + " , " + yOne + ") (" + xTwo + " , " + yTwo + " )");

        if(m != 1){
            //prints the m output
            System.out.print(" is y = " + m + " x");
        }
        else if( m == 1){
            System.out.print(" is y = x");
        }

        if(b != 0 && b < 0){
            //prints the output b if negeative
            System.out.println(" - " + (b * -1));
        }
        else if(b != 0 && b > 0){
            //prints the output b if postivie
            System.out.println(" + " + b);
        }
        else if(b == 0){
            System.out.println("");
        }
        
    }
   
    
}
