//Sorin Macaluso
//Project5
//CMPT 220 
//Complex.java

//this is the complex class that will be used in Project5.java and Extra.java
//they will use this class to add, subtract, multiply, divide, and find the absolute value of 2 complex numbers


public class Complex extends Number implements Cloneable,Comparable<Complex> {
    //two data values that will be used throught the program
    private double a;
    private double b;

    Complex(double a, double b){
        //constuctor for when their are values of a and b
        this.a = a;
        this.b = b;
    }

    Complex(double a){
        //constructor for when you just have the value of a
        this.a = a;
        b = 0;
    }

    Complex(){
        //constuctor for when you don't have the value for a or b
        a = 0;
        b = 0;
    }

    public Complex getAdd(Complex o){
        //adds the a part and the b part
        double addA = 0;
        double addB = 0;
        addA = (a+o.getReal());
        addB = (b+o.getImaginary());
        Complex addNumber = new Complex(addA, addB);
        return addNumber;
    }

    public Complex getSubtract(Complex o){
        //subtracts the a part and the b part
        double subA = 0;
        double subB = 0;
        subA = (a-o.getReal());
        subB = (b-o.getImaginary());
        Complex subNumber = new Complex(subA, subB);
        return subNumber;
    }

    public Complex getMultipy(Complex o){
        //multiplies the a part and the b part
        double multA = 0;
        double multB = 0;
        multA = (a*o.getReal() - b*o.getImaginary());
        multB = (b*o.getReal()+a*o.getImaginary());
        Complex multNumber = new Complex(multA, multB);
        return multNumber;
    }

    public Complex getDivide(Complex o){
        //divides the a part and the b part
        double divA = 0;
        double divB = 0;
        double divisor = 0;
        divisor = (o.getReal()*o.getReal() + o.getImaginary()*o.getImaginary());
        divA = ((getReal()*o.getReal()) + (getImaginary()*o.getImaginary())) / divisor;
        divB = ((getImaginary()*o.getReal()) - (getReal()*o.getImaginary())) / divisor;
        Complex divNumber = new Complex(divA, divB);
        return divNumber;
    }

    public double getAbs(){
        //calculates the abs
        double abs = 0;
        abs = (a*a) + (b*b);
        abs = Math.sqrt(abs);
        return abs;
        
    }

    public String toString(Complex o){
        //makes the a and b into a complex string
        String imaginary = a + " + " + b + "i.";
        return imaginary;
    }

    public double getReal(){
        //return a 
        return a;
    }

    public double getImaginary(){
        //return b
        return b;
    }

    @Override
    public int intValue() {
        //changes a and b into a int
        a = (int)a;
        b = (int)b;
        return 0;
    }

    @Override
    public long longValue() {
        //changes a and b into a long
        a = (long)a;
        b = (long)b;
        return 0;
    }

    @Override
    public float floatValue() {
         //changes a and b into a float
        a = (float)a;
        b = (float)b;
        return 0;
    }

    @Override
    public double doubleValue() {
         //changes a and b into a double
        a = (double)a;
        b = (double)b;
        return 0;
    }

    @Override
    //cloans an object
    public Object clone() {
      try {
        return super.clone();
      }
      catch (CloneNotSupportedException ex) {
        return null;
      }
    }

    @Override
    //compare the object
    public int compareTo(Complex o) {
        if(getReal() - o.getReal() > 0){
            return 1;
        }
        else if(getReal() - o.getReal() < 0){
            return -1;
        }
        else{
            return 0;
        }
    }

}
