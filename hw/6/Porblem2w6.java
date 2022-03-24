//Sorin Macaluso
//hw3
//CMPT 220 
//problem2w6.java

import java.util.Scanner;

public class Porblem2w6 {
    public static void main(String[] args){
        //two arrays of 6 for the x and the y points
        int[] xArray = new int[6];
        int[] yArray = new int[6];
        int area = 0;

        //scanner for the x and the y input
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < xArray.length; i++){
            System.out.print("What is the x point: ");
            xArray[i] = input.nextInt();
        }

        for(int i = 0; i < yArray.length; i++){
            System.out.print("What is the y point: ");
            yArray[i] = input.nextInt();
        }

        //calculating the area
        area = (xArray[0] * yArray[1] + xArray[1] * yArray[2] + xArray[2] * yArray[3] + xArray[3] * yArray[4] + xArray[4] * yArray[5]) - (yArray[0] * xArray[1] + yArray[1] * xArray[2] + yArray[2] * xArray[3] + yArray[3] * xArray[4] + yArray[4] * xArray[5]);

        area = area / 2;

        //printing out the area
        System.out.println("The area of the convex polygon is " + area);






        
    }
      
}
