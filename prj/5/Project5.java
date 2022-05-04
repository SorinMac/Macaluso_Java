//Sorin Macaluso
//Project5
//CMPT 220 
//Project5.java

//this porgram will use the complex class to create bojects of type complex and add, subtract, multiply, divide, and 
//find the absolute value of the two complex numbers.


import java.util.Scanner;

public class Project5 {
    public static void main(String[] args){
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

        //calls the add, subtract, multiply, divide, and absolute value methods in the complex class
        Complex addImagine = number1.getAdd(number2);
        Complex subImagine = number1.getSubtract(number2);
        Complex multImagine = number1.getMultipy(number2);
        Complex divImagine = number1.getDivide(number2);
        double abs = number1.getAbs();

        //prints out the infromation to the user
        System.out.println("( " + number1.getReal()+" + " + number1.getImaginary()+ "i )" + " + " + "( " + number2.getReal()+" + " + number2.getImaginary()+ "i ) = " + addImagine.getReal()+" + " + addImagine.getImaginary()+ "i" );
        System.out.println("( " + number1.getReal()+" + " + number1.getImaginary()+ "i )" + " - " + "( " + number2.getReal()+" + " + number2.getImaginary()+ "i ) = " + subImagine.getReal()+" + " + subImagine.getImaginary()+ "i" );
        System.out.println("( " + number1.getReal()+" + " + number1.getImaginary()+ "i )" + " * " + "( " + number2.getReal()+" + " + number2.getImaginary()+ "i ) = " + multImagine.getReal()+" + " + multImagine.getImaginary()+ "i" );
        System.out.println("( " + number1.getReal()+" + " + number1.getImaginary()+ "i )" + " / " + "( " + number2.getReal()+" + " + number2.getImaginary()+ "i ) = " + divImagine.getReal()+" + " + divImagine.getImaginary()+ "i" );
        System.out.println("| " + number1.getReal()+" + " + number1.getImaginary()+ "i |" + " = " + abs);



    }
}