//Sorin Macaluso
//hw11
//CMPT 220 
//Problem1.java

//uses the time class to calculate the elapse

import java.util.Scanner;

class Time implements Comparable<Time> {
    //assigns values
    private long time;
    private int seconds;
    private int min;
    private int hour;

    //constructor for time with no arg
    public Time() {
        time = System.currentTimeMillis();
    }

    //constuctor for time with the arg for only amount of seconds
    public Time(long timeMilli) {
        long timeInMilliSec = 0;
        //turn time back into milliseconds
        timeInMilliSec = (timeMilli * 1000);
        //assigns that value to time
        time = timeMilli;
        //calculates hour, min, and sec
        this.hour  = (int)(timeInMilliSec / (1000 * 60 * 60)) % 24;
        this.min = (int)(timeInMilliSec / (1000 * 60)) % 60;
        this.seconds = (int)(timeInMilliSec / (1000)) % 60;
    }

    //constuctor for the time at hour, min, and sec
    public Time(int hour, int min, int seconds) {
        long timeInMilliSec = 0;
        //turn time back into milliseconds
        timeInMilliSec = (hour * 3600000) + (min * 60000) + (seconds * 1000);
        //assigns that value to time
        time = timeInMilliSec;
        //calculates hour, min, and sec
        this.hour  = (int)(timeInMilliSec / (1000 * 60 * 60)) % 24;
        this.min = (int)(timeInMilliSec / (1000 * 60)) % 60;
        this.seconds = (int)(timeInMilliSec / (1000)) % 60;
    }

    //getter for the elpase sec
    public long getElapseSec(){
        return time;
        
    }

    
   //getter for the hour
   public long getHour() {
       return hour;
   }

   //getter for the min
   public long getMin() {
       return min;
   }

   //getter for the sec
   public long getSec() {
       time = (int)(time / (1000));
       return time;
   }

   //print method to print out the time 
   public void printTime() {
        System.out.println("The time is " + hour  + " hour " + min + " min " + seconds + " sec.");

   }


   //compare to method to use
    @Override
    public int compareTo(Time t) {
        long elapseTime = 0;
        elapseTime = getElapseSec() - t.getElapseSec();
        return (int)elapseTime;

    }
   

}


public class Problem1 {
    public static void main(String[] args) {
        //asks for the first time useing hour, min, and sec
        Scanner input = new Scanner(System.in);
        System.out.print("Enter time 1 (hour min seconds): ");
        int userHour = input.nextInt();
        int userMin = input.nextInt();
        int userSec = input.nextInt();

        input.close();

        //construcst the time and then prints it out
        Time time1 = new Time(userHour, userMin, userSec);
        time1.printTime();

        //prints out only the sec
        System.out.println("The seconds in time 1: " + time1.getSec());

        //asks for the seconds time in time seconds
        System.out.print("Enter time 2 (elapsed time): ");
        int userSec2 = input.nextInt();

        //constucts the time for the seconds time
        Time time2 = new Time(userSec2);
        time2.printTime();

        //prints out the seconds for time 2
        System.out.println("The seconds in time 2: " + time2.getElapseSec());

        //compares the two times
        long elapseTime = time1.compareTo(time2);

        //displays what the comapare time is
        System.out.println("time1.compareTo(time2)? " + elapseTime);


        


    }
}