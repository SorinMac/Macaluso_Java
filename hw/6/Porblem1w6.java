//Sorin Macaluso
//hw3
//CMPT 220 
//problem1w6.java

public class Porblem1w6 {
    public static void main(String[] args){
        //creates the array
        int[] counts = new int[10];

        //gives a randoms spot on array from 0 - 9 a +1 100 times
		for (int i = 1; i <= 100; i++) {
			counts[(int)(Math.random() * 10)]++;
		}

        //prints out the output to user
		System.out.println("Count for each number between 0 and 9:");
		for (int i = 0; i < counts.length; i++) {
			System.out.println(i + "s: " + counts[i]);
		}
    }
    
}
