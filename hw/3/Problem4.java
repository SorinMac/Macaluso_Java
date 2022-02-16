//Sorin Macaluso
//hw3
//CMPT 220 
//Problem4.java


public class Problem4 {
    public static void main(String[] args){

        //calculations
        double pointX = Math.random() * (5 - -5) + -5;
        double pointY = Math.random() * (5 - -5) + -5;
        double distance = Math.pow((pointX * pointX) + (pointY * pointY), 0.5);

        //prints the output
        System.out.println("The line equation for two points (" + pointX + ", " + pointY + " )");
        System.out.println("and its distance to the center is " + distance);







    }
    
}
