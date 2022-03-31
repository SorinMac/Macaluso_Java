//Sorin Macaluso
//hw8
//CMPT 220 
//problem1w7.java

//This program takes the quadraic equation and turn it into a class. In this class
//the user can call the getDiscriminat and getRoot1 and getRoot2 method.

import java.util.Scanner;

public class Problem1w7 {
    public static void main(String[] args){
      //opens scanner for input
      Scanner input = new Scanner(System.in);
      System.out.print("What is the a, b, and c: ");
      double a = input.nextDouble();
      double b  = input.nextDouble();
      double c = input.nextDouble();

      //calls the constuctor passing it the values a b and c
      QuadradicEqaution equation = new QuadradicEqaution(a,b,c);

      //calculates the discriminat
      double discriminant = equation.getDiscriminant();

      //checks the discriminat to makes sure there can be roots found
      if(discriminant == 0){
        System.out.println("The eqaution has no roots.");
      }
      else{
        //if there can be roots the root methods will be called
        double root1 = equation.getRoot1();
        double root2 = equation.getRoot2();
        System.out.println("The two roots are " + root1 + " and " + root2 + " .");
      }
      
    }
  }

//class for the quadratic equation
class QuadradicEqaution {
    private double a;
    private double b;
    private double c;
  
  
    //constructior for the a, b, and c value
    QuadradicEqaution(double a, double b, double c) {
      this.a = a;
      this.b = b;
      this.c = c;
    }
  
    //return a value
    double getA() {
      return a;
    }
  
    //return b value
    double getB() {
      return b;
    }
  
    //return c value
    double getC() {
      return c;
    }

    //return the discriminat if the dirsiminant is 0 returns that instead
    double getDiscriminant(){
        double discriminant = (b*b) - (4*a*c);
        if(discriminant == 0){
          discriminant = 0;
        }
        else{
          discriminant = (b*b) - (4*a*c);
        }
        return discriminant;
    }


    //returns root 1
    double getRoot1(){
        double root1 = -b + (Math.pow(getDiscriminant(), 0.5)) / 2*a;
        return root1;
    }


    //returns root 2
    double getRoot2(){
        double root2 = -b + (Math.pow(getDiscriminant(), 0.5)) / 2*a;
        return root2;
    }
  }

