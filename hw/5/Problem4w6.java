//Sorin Macaluso
//hw3
//CMPT 220 
//problem4w6.java

import java.util.Scanner;

public class Problem4w6 {
    //converts the seconds to HH:MM:SS
    public static String format(long seconds){
        
        long hours = 0;
        long min = 0;
        long sec = 0;
        String hhMmSs = " ";
        
        //calc the hours
        hours = (seconds/3600) % 24;

        //calc the seconds for min
        seconds = seconds % 3600;
        
        //calc the min
        min = (seconds/60);

        //calc the sec
        sec = seconds % 60;

        //makes the string
        hhMmSs = String.format("%02d:%02d:%02d", hours, min, sec);


        return hhMmSs;

        
        
    }
    public static void main(String[] args){

        String hoursMinSec = " ";

        //opens the scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total seconds: ");
        long totalSeconds = input.nextLong();

        //variable that is equal to the return
        hoursMinSec = format(totalSeconds);

        //prints the output out to the user
        System.out.println("The hours, minutes, and seconds for the total seconds " + totalSeconds + " is " + hoursMinSec);
    }

}
