//Sorin Macaluso
//hw3
//CMPT 220 
//problem2w6.java

import java.util.Scanner;

public class Porblem2w6 {
    //method to convert the decimal to binary
    public static String decimalToBinary(int value){

        String binary = " ";
        boolean trueFalse = false;

        //while loop to hold the math
        while(trueFalse == false){

            //math to conver the decimal to binary
            int check = 0;

            check  =  value % 2;

            //the check is used to see weather it should output a 0 or a 1
            if(check == 0){
                binary += "1"; // JA: This logic is reversed
            }
            else{
                binary += "0";
            }

            //does the division to make the original int smaller
            if(value > 1){
                value = value / 2;
            }
            else{
                trueFalse = true;
            }
            

        }

        return binary;

   }    

    public static void main(String[] args){
        //opens scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int decimal = input.nextInt();

        //sets return value equal to a variable
        String newBinary = decimalToBinary(decimal);

        //prints the variable out as output
        System.out.println("Your number in binary is: " + newBinary);
    }

}
