//Sorin Macaluso
//hw3
//CMPT 220 
//Problem4.java

import java.util.Scanner;

public class problem4w5 {
    public static void main(String[] args){
        //createsa scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        double integer = input.nextDouble();
        double underSquare = integer;
        double outOfSquare = 1;
        double a = 2;

        //checks the square root and does the calculations
        while( a * a <= underSquare){
            if(underSquare % (a * a) == 0){
                underSquare = underSquare / (a * a);
                outOfSquare = outOfSquare * a;
            }
            else{
                a = a + 1;
            }
        }

        //checks what should be printed out
        if(outOfSquare != 1 && underSquare != 1){
            System.out.println("sqrt ( " + integer + " ) is " + outOfSquare + "*sqrt ( " + underSquare + " )");
        }
        if(underSquare == 1 && outOfSquare != 1){
            System.out.println("sqrt ( " + integer + " ) is " + outOfSquare);
        }
        if(underSquare != 1 && outOfSquare == 1){
            System.out.println("sqrt ( " + integer + " ) is " + "sqrt( " + underSquare + " )");
        }
        if(underSquare == 1 && outOfSquare == 1){
            System.out.println("sqrt ( " + integer + " ) is " +1);
        }

        



    }

}
