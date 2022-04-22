//Sorin Macaluso
//hw10
//CMPT 220 
//Problem2.java

//uses try and catch and then throw to try for something then throw back to catch if an error if needed.
//uses a custome class to pass back the error message when it is needed.

import java.util.Scanner;

//class for the BinaryFromatException exception
class BinaryFormatException extends Exception { 
    public BinaryFormatException(String errorMessage) {
        super(errorMessage);
    }
}

public class Problem3 {
    //method for the binary to decimal tansfer
    public static double bin2Dec (String binaryString) throws BinaryFormatException{
        //goes to another method to check
        boolean check  = checkBinaryString(binaryString);

        if(check == false){
            //the throw if the error happend
            throw new  BinaryFormatException("This is not a binary string.");
        }
        else{
             //math to turn decimal to binary
            double bin2Dec = 0;

            for(int i = binaryString.length() - 1; i >= 0 ; i--){

            if(binaryString.charAt(i) == '1'){
                bin2Dec += Math.pow(2, binaryString.length() - i - 1);

            }

        }

        System.out.println("Your number in decimal is " + (int)bin2Dec + " .");
        
        return bin2Dec;
        
    }
}
    //method for the binary string check
    public static boolean checkBinaryString (String binaryString){
        boolean binaryOrNot = false;
        char check = ' ';

        for(int i = 0; i<binaryString.length(); i++){
            check = binaryString.charAt(i);
            if(check == '1' || check == '0'){
                binaryOrNot = true;
            } else{
                binaryOrNot = false;
                break;
            }
        }

        return binaryOrNot;
    }
    public static void main(String[] args){
        //asks for user input
        String binary = " ";
        Scanner input = new Scanner(System.in);
        System.out.print("What binary string do you want to use: ");
        binary = input.nextLine();
        
         //try and catch to cathc the error that might be thrown by the bin2Dec method
        try{
            bin2Dec(binary);
        } catch(BinaryFormatException ex) {
            System.out.println("This is not a binary string.");
        } 
    }
}