//Sorin Macaluso
//Project5
//CMPT 220 
//Extra.java

//this will use this class to add, subtract, multiply, divide, and find the absolute value of 3 complex numbers
//these calculations will be later used to find the area of the three complex points.

import java.util.Scanner;

// JA: This is not calculating correctly
public class Extra {
    public static void main(String[] agrs){
        //asks the user for the first complex number
        double a = 0;
        double b = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Input 0 for missing value.");
        System.out.print("Enter the first complex number: ");
        a = input.nextDouble();
        b = input.nextDouble();

        Complex number1 = new Complex(a, b);
        
        //asks the user for the second complex number
        System.out.println("Input 0 for missing value.");
        System.out.print("Enter the second complex number: ");
        a = input.nextDouble();
        b = input.nextDouble();

        Complex number2 = new Complex(a, b);

        //asks the user for the thrid complex number
        System.out.println("Input 0 for missing value.");
        System.out.print("Enter the second complex number: ");
        a = input.nextDouble();
        b = input.nextDouble();

        Complex number3 = new Complex(a, b);

        //calcutlations to find the area of the three complex number points
        Complex sub1 = number2.subtract(number3);
        Complex sub2 = number3.subtract(number1);
        Complex sub3 = number1.subtract(number2);
        Complex mult1 = number1.multipy(sub1);
        Complex mult2 = number2.multipy(sub2);
        Complex mult3 = number3.multipy(sub3);
        Complex add1 = mult1.add(mult2);
        Complex add2 = add1.add(mult3);
        double last = add2.abs();
        last = last/2;

        //prints the area to the user
        System.out.println("The area of you three complex points is: " + last);


    }
}