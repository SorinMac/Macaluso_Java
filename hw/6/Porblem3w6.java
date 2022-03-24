//Sorin Macaluso
//hw3
//CMPT 220 
//problem3w6.java

import java.util.Scanner;

public class Porblem3w6 {
    public static int[] count(String s) {
        //new array
        int[] checkDigit = new int[10];
      
        for(int i = 0; i < s.length(); i++) {

            //if it finds a number adds one to the array that maches that number can't have 0 to check since it will be out of bounds
            if (Character.isDigit(s.charAt(i))){
                checkDigit[s.charAt(i) - '0']++;
            }

        }

        //returns the array with numbers
        return checkDigit;

       }

    public static void main(String[] args) {
        int spot = 1;

        //asks the user for their string
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the test string: ");
        String testString = input.nextLine();
        
        //calls method
        int[] digitAmounts = count(testString);
        
        //prints out the value of all numbers in the array if there is a 0 in a spot it will not print it out
        for (int i = 0; i < digitAmounts.length; i++) {
            if (digitAmounts[i] != 0){
                System.out.println("Digits " + spot++ + " appears " + digitAmounts[i]);
            }
      
        }
    
    }
    
}
