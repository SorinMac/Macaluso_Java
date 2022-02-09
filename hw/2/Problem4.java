//Sorin Macaluso
//hw2
//CMPT 220 
//Problem4.java

import java.util.Scanner;

public class Problem4 {
    
    public static void main(String[] args) {
    
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

        //calculations
        double years = (minutes /  525600);
        double days = ((minutes % 525600) / 1440);
        
        //print out
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");

    }
}

