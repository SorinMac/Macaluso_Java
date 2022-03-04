//Sorin Macaluso
//hw3
//CMPT 220 
//problem1w6.java

import java.util.Scanner;


public class Porblem1w6 {
    //method to calculate the multiplication of the individual digits in the number
    public static int multiplyDigits(long n){

        long number = n;
        int total = 1;

        //math to find the indiviual digits in the 10 place, 100 place, 1000 place, and so on
        while(n > 0){
            n = number % 10;
            if(n != 0){
                total = total * (int)n;
            number = number / 10;
            }
            
        }

        return total;

        
        
    }


    //main method
    public static void main(String[] args){

        long allMultipled = 0;
        
        //opens scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        long integer = input.nextLong();
        
        //method return sent to a variable
        allMultipled = multiplyDigits(integer);
        
        //prints out to the user
        System.out.println("The total of the mutilpicaton is: " + allMultipled);

        
    }

}


