//Sorin Macaluso
//hw10
//CMPT 220 
//Project4.java

//reads in a file of choice of babyames, this is done when the use inputs the year of baby names they are interesed in.
//while they are read in they are also being turned into a string to be added to the Arraylist<BabyNames>.
//after this another method is passed the year the name and the Arraylist<BabyNames> to find the rank based on the name.

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

//class for the BabyName type
class BabyName{
    private String name;
    private String gender;
    private int rank;

    BabyName(String name, String gender, int rank){
        this.name = name;
        this.gender = gender;
        this.rank = rank;

    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getRanks() {
        return rank;
    }

}

public class Project4{

    //golabal variable to be use later
    public static String genderName = " ";

    //first method to input the file and read throught the file and then make the arraylist
    private static ArrayList<BabyName> loadNames(String fileName) {
        
        ArrayList<BabyName> babyNameList = new ArrayList<>();
        
        int rank = 1;
        
            File file = new File(fileName);
            Scanner input = new Scanner(fileName);


            //decides gender of the name
            int gender = 0;

            if(genderName.charAt(0) == 'M' || genderName.charAt(0) == 'm'){
                gender = 1;
            }

            if(genderName.charAt(0) == 'F' || genderName.charAt(0) == 'f'){
                gender = 2;
            }

            //split the string and then pass the values to the constructor BabyName
            while(input.hasNext()){
                String namesBaby = "";
                for(int i = 0; i<5 ; i++){
                    namesBaby = namesBaby + " " + input.next();
                }

                String[] nameSplitter = namesBaby.split(" ");

                BabyName string = new BabyName(nameSplitter[gender], genderName, rank);
                babyNameList.add(string);

                rank++;

            }

        return babyNameList;
    }
    

    

    public static BabyName findName(String name, int year, ArrayList<BabyName> names){
        int place = 0;
        BabyName checkName = names.get(place);

        //while try to find the name in the arraylist names
        try{
            while (true) {
                checkName = names.get(place);

                if (checkName.getName().equals(name)){
                    break;
                }
                place++;
            }
        //if an error this will print out
        } catch (IndexOutOfBoundsException e){
            throw new IndexOutOfBoundsException("The name " + name + " is not ranked for this year.");
        }

        return null;
    }


    
    public static void main(String[] args){
        //asks for user input of year, gender, and name
        Scanner input  = new Scanner(System.in);
        System.out.print("What year do you want to search: ");
        String year = input.nextLine();

        System.out.print("What gender is the name: ");
        String genderName = input.nextLine();

        System.out.print("What is the name: ");
        String name = input.nextLine();

        //closes the input line
        input.close();
        
        //turns the year into an int to be used later
        int yearInt = Integer.parseInt(year);

        //creates the nameList array to hold the arraylist of babynames form the file
        ArrayList<BabyName> nameList = new ArrayList<>();

        //trys to open the file and send it to loadNames to then load the baby names in
        try{
            nameList = loadNames(year + ".txt");
            
        } catch (Exception e) {
            System.out.println("This file does not excist.");
        }

        //after loading all the baby names passes to findName to find the name at its rank
        findName(name, yearInt, nameList);
    }

}
