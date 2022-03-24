//Sorin Macaluso
//hw3
//CMPT 220 
//Project2.java

import java.util.Scanner;

public class Project2 {
    
    public static int module42(int[] firstArray){
        //makes array of 42
        int[] checkArray = new int[42];
        int total  = 0;

        //assigns the value 1 to the array of 42 at the spot of the remainder
        for(int i = 0; i<firstArray.length; i++){
            checkArray[firstArray[i] % 42] = 1;
        }

        //counts all the ones in the array of 42
        for(int k = 0; k<checkArray.length; k++){
            total = checkArray[k] + total;
        }

        //returns the total amount
        return total;
    }

    
    public static void main(String[] args){
        int[] firstNum = new int[10];
        int theResult = 0;

        Scanner input = new Scanner(System.in);

        //asks for the numbers the user wants
        for(int i = 0; i < firstNum.length; i++){
            System.out.print("What number do you want for the first set: ");
            firstNum[i] = input.nextInt();
        }

        //calls array
        theResult = module42(firstNum);

        //prints out what the result will be
        System.out.println("The amount of numbers that are in module42 is " + theResult + " .");
        
    }
}
