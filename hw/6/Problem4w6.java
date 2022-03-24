//Sorin Macaluso
//hw3
//CMPT 220 
//problem3w6.java

import java.util.Scanner;

public class Problem4w6 {
    public static double[][] inverse(double[][] A, double answer){
        double placeholder = 0;

        //swtiches the spot of a and d
        placeholder = A[0][0];
        A[0][0] = A[1][1];
        A[1][1] = placeholder;

        //makes c and b negative
        A[0][1] = A[0][1] * -1;
        A[1][0] = A[1][0] * -1;

        //returns the new array
        return A;

    }

    public static void main(String[] args){
        //intalizing the varaibles needed
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        double partOne = 0;
        
        //scanner to ask for the inputs
        Scanner input = new Scanner(System.in);
        System.out.print("What do you want to input for a: ");
        a = input.nextInt();
        System.out.print("What do you want to input for b: ");
        b = input.nextInt();
        System.out.print("What do you want to input for c: ");
        c = input.nextInt();
        System.out.print("What do you want to input for d: ");
        d = input.nextInt();

        //intalizing the matrix array
        double[][] matrixArray = {{a , b}, {c, d}};

        //ther calculation for the first part of the inverse matrix
        partOne = (matrixArray[0][0] * matrixArray[1][1]) - (matrixArray[1][0] * matrixArray[0][1]);

        //checks if partOne = 0, since if partOne = 0 1/0 will reslut in syntax error
        if(partOne == 0){
            partOne = 0;
        }
        //will do the math is everything checks out
        else{
            partOne = 1 / partOne;
        }

        //print no invers if there is a 0 in partOne
        if(partOne == 0){
            System.out.println("No inverse for this matrix!");
        }
        //else will call the method
        else{
            //sets the returned array
            double[][] newMatrix = inverse(matrixArray, partOne);

            //prints information to the user
            System.out.println("The inverse of the inputed matrix is: ");
            System.out.println(newMatrix[0][0] * partOne + "     " + newMatrix[0][1] * partOne);
            System.out.println(newMatrix[1][0] * partOne + "     " + newMatrix[1][1] * partOne);
        }

        




    }
    
}
