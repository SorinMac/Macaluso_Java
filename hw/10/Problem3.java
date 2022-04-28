//Sorin Macaluso
//hw11
//CMPT 220 
//Problem3.java

//

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
      Rational r1 = new Rational();
      Rational r2 = new Rational();

      //calls for the user input of the first fraction
      Scanner input = new Scanner(System.in);
      System.out.print("What is the fraction you want to input: ");
      String fractionsR1 = input.nextLine();
      Rational userInputR1 = new Rational();
      r1 = userInputR1.parseRationalNumber(fractionsR1);

      //calls for the user input of the second fraction
      System.out.print("What is the fraction you want to input: ");
      String fractionsR2 = input.nextLine();
      Rational userInputR2 = new Rational();
      r2 = userInputR2.parseRationalNumber(fractionsR2);
      
  
      // Display results
      System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
    }
}

class Rational extends Number implements Comparable<Rational> {
    // Data fields for numerator and denominator
    private long numerator = 0;
    private long denominator = 1;
  
    /** Construct a rational with default properties */
    public Rational() {
      this(0, 1);
    }
  
    /** Construct a rational with specified numerator and denominator */
    public Rational(long numerator, long denominator) {
      long gcd = gcd(numerator, denominator);
      this.numerator = (denominator > 0 ? 1 : -1) * numerator / gcd;
      this.denominator = Math.abs(denominator) / gcd;
    }

    //new method added from the assignment
    //addresses assining value of the nuemerator and denominator
    public static Rational parseRationalNumber(String s) {
      int numerator = 0;
      int denominator = 0;
      if(s.length() == 1){
        numerator = Integer.parseInt(s.substring(0,1));
        denominator = 1;
      }
      else{
        numerator = Integer.parseInt(s.substring(0,1));
        denominator = Integer.parseInt(s.substring(2,4));
      }
     
      Rational r1 = new Rational(numerator, denominator);

      return r1;
      
    }
    

  
    /** Find GCD of two numbers */
    private static long gcd(long n, long d) {
      long n1 = Math.abs(n);
      long n2 = Math.abs(d);
      int gcd = 1;
      
      for (int k = 1; k <= n1 && k <= n2; k++) {
        if (n1 % k == 0 && n2 % k == 0) 
          gcd = k;
      }
  
      return gcd;
    }
  
    /** Return numerator */
    public long getNumerator() {
      return numerator;
    }
  
    /** Return denominator */
    public long getDenominator() {
      return denominator;
    }
  
    /** Add a rational number to this rational */
    public Rational add(Rational secondRational) {
      long n = numerator * secondRational.getDenominator() +
        denominator * secondRational.getNumerator();
      long d = denominator * secondRational.getDenominator();
      return new Rational(n, d);
    }
  
    /** Subtract a rational number from this rational */
    public Rational subtract(Rational secondRational) {
      long n = numerator * secondRational.getDenominator()
        - denominator * secondRational.getNumerator();
      long d = denominator * secondRational.getDenominator();
      return new Rational(n, d);
    }
  
    /** Multiply a rational number to this rational */
    public Rational multiply(Rational secondRational) {
      long n = numerator * secondRational.getNumerator();
      long d = denominator * secondRational.getDenominator();
      return new Rational(n, d);
    }
  
    /** Divide a rational number from this rational */
    public Rational divide(Rational secondRational) {
      long n = numerator * secondRational.getDenominator();
      long d = denominator * secondRational.numerator;
      return new Rational(n, d);
    }
  
    @Override // Override toString()
    public String toString() {
      if (denominator == 1)
        return numerator + "";
      else
        return numerator + "/" + denominator;
    }
  
    @Override // Override the equals method in the Object class 
    public boolean equals(Object other) {
      if ((this.subtract((Rational)(other))).getNumerator() == 0)
        return true;
      else
        return false;
    }
  
    @Override // Implement the abstract intValue method in Number 
    public int intValue() {
      return (int)doubleValue();
    }
  
    @Override // Implement the abstract floatValue method in Number 
    public float floatValue() {
      return (float)doubleValue();
    }
  
    @Override // Implement the doubleValue method in Number 
    public double doubleValue() {
      return numerator * 1.0 / denominator;
    }
  
    @Override // Implement the abstract longValue method in Number
    public long longValue() {
      return (long)doubleValue();
    }
  
    @Override // Implement the compareTo method in Comparable
    public int compareTo(Rational o) {
      if (this.subtract(o).getNumerator() > 0)
        return 1;
      else if (this.subtract(o).getNumerator() < 0)
        return -1;
      else
        return 0;
    }
  }