//Sorin Macaluso
//hw9
//CMPT 220 
//Problem1.java

//uses a method to split a string with the users delimeteres

// JA: You are missing the last substring
import java.util.Scanner;

public class Problem1 {
    //method to split the string
    public static double split(char[] delimeters, String realString){
        int endValue = 0;
        int o = 0;

        //nested for loop that checks each char in the original string to the delimeter string
        for(int i  = 0; i<realString.length(); i++){
            for(int j = 0; j<delimeters.length; j++){
                    //this if statment check if the char in the string at i is a delimeter
                    //if it is then it will print out the begingng (o) and the end (endValue)
                    //then will move o along the string by setting it equal to i+1
                    if(realString.charAt(i) == delimeters[j]){
                        endValue = i;
                        System.out.print(realString.substring(o , endValue) + " ");
                        o = i+1;
                    }
            }
        }

        return 0.0;
    }
    public static void main(String[] args){
        //Scanner to ask the user for input
        Scanner input = new Scanner(System.in);
        System.out.print("What string are you looking to sperate: ");
        String inputString = input.nextLine();
        System.out.print("What are your delimeters: ");
        String delimerantString = input.nextLine();

        //takes the delimeters as a string and turns it into a chacater array
        char[] delimeterArray = delimerantString.toCharArray();
        

        split(delimeterArray, inputString);
    



    }
    
}
