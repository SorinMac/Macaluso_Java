//Sorin Macaluso
//hw3
//CMPT 220 
//problem3w5.java

import java.util.Scanner;

public class problem3w5 {
    public static void main(String[] args){

        //creates scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a genome string: ");
        String genome = input.nextLine();
        int firstOccurance = 0;
        int secondOccurance = 0;
        int secondOccuraceTag = 0;
        int secondOccuraceTaa = 0;
        int secondOccuraceTga = 0;
        String gene = "";
        boolean done = false;

            //while loop to handle when it goes into a loop
            while(! done){
                firstOccurance = genome.indexOf("ATG", firstOccurance);
                secondOccuraceTag = genome.indexOf("TAG", secondOccurance);
                secondOccuraceTaa = genome.indexOf("TAA", secondOccurance);
                secondOccuraceTga = genome.indexOf("TGA", secondOccurance);
                
                //checks the TAG tag
                if(genome.indexOf("TAG", secondOccuraceTag) > 0){
                    if(genome.indexOf("TAG", secondOccuraceTag) >= 0 && genome.indexOf("TAG", secondOccuraceTag + 3) < secondOccurance){
                        secondOccurance = genome.indexOf("TAG", firstOccurance +3);
                    }

                }

                //checks the TAA tag
                if(genome.indexOf("TAA", secondOccuraceTaa) > 0){
                    if(genome.indexOf("TAA", secondOccuraceTaa) >= 0 && genome.indexOf("TAA", secondOccuraceTaa + 3) < secondOccurance){
                        secondOccurance = genome.indexOf("TAA", firstOccurance + 3);
                    }
                }
                
                //checks the TGA tag
                if(genome.indexOf("TGA", secondOccuraceTga) > 0){
                    if(genome.indexOf("TGA", secondOccuraceTga) >= 0 && genome.indexOf("TGA", secondOccuraceTga + 3) < secondOccurance){
                        secondOccurance = genome.indexOf("TGA", firstOccurance + 3);
                    }
                }
                //gives the gene
                if(secondOccurance > firstOccurance){
                    gene = genome.substring(firstOccurance + 3, secondOccurance);
                }
                
                //changes the value fo done so the loop stops
                if(secondOccurance < 0){
                    done = true;
                }
                
                //makes it so that it geos through the whole string
                firstOccurance = secondOccurance + 3;
                secondOccurance = firstOccurance + 3;
                
                //different print statments
                if(firstOccurance == 0){
                    System.out.println("There is no genome");
                }
                else{
                    System.out.println(gene);
                }

        
                
                
        
            }
        }

           
}
