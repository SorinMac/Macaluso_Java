//Sorin Macaluso
//hw3
//CMPT 220 
//problem3w6.java

import java.util.Scanner;

public class Problem3w6 {
    //method to change the string
    public static String title(String s){
        String newS = " ";
        int location = 0;

        //for loop to go threw the string and long as it is
        for(int i = 0; i < s.length(); i++){
            location = s.indexOf(" " , location) + 1;

            //checks the locations to make sure it is not capitalizing a space
            if(s.charAt(location) != ' '){
                newS += Character.toUpperCase(s.charAt(location));
            }
            else{
                newS += s.charAt(i);
            }

            location = s.indexOf(" ", location + 1);
        }

        return newS;
        
    }


    public static void main(String[] args){
        
        String newString = " ";

        //opens scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String stringCap = input.next();

        //variable the return is equal to
        newString = title(stringCap);

        //prints the output to the user
        System.out.println("The new string is: " + newString);
        }
}


