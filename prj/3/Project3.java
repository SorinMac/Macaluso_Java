//Sorin Macaluso
//Project 3
//CMPT 220 
//Project3.java

//This program uses a 2D array and has a mirror room inputed in.
//The 2D array does not need user input on how many rows or columns are needed.
//This program then uses specal directional checkers to change the direction based on the mirrors.

import java.util.Scanner;

public class Project3 {
    public static void main(String[] args){
        //intalizing variables
        int row = 40; // JA: Why 40x40?
        int column = 40;
        char[][] mirror = new char[row][column];
        row = 0;
        column = 0;
        int i = 0;
        int count = 0;
        int rowInArray = 0;
        int columnInArray = 0;
        String checkValue = " ";
        int x = 0;
        int y = 0;
        
        //this method allows the user to input each line of the array without specfiying row and column size
        //there are not more than two lines of x's
        while(count<2){
            System.out.println("Enter the line in the Maze: ");

            Scanner input = new Scanner(System.in);
            String string = input.next();
            i=0;

            //checks if the characters are x's
            if(string.charAt(1)=='x' || string.charAt(2) == 'x'){
                count += 1;
            }

            //the the point on string to the array up to the point of array size
            while(i < string.length()){
                mirror[row][column]=string.charAt(i);
                i += 1;
                column += 1;
            }
            //these are some values used later in printing for finding row and column size of array
            row += 1;
            rowInArray += 1;
            column = 0;
            columnInArray = string.length();

        }
        row = 0;
       
        //finds the * value
        //star value is 42
        while(mirror[row][column] != 42){
            
            //if there is no star in column then increase column by one
            while((column < rowInArray && mirror[row][column] != 42)){
                column += 1;
            }
            
            //if at the end go to next row and start again
            if(column == rowInArray){
                column = 0;
                row += 1;
            }
        }


        //assigind directional values to the code
        if(row == 0){
            checkValue = "down";
        }
        else if(column == 0){
            checkValue = "right";
        }
        else if(column == columnInArray){
            checkValue = "left";
        }
        else{
            checkValue = "up";
        }

        //assigns the values row and column to x and y
        x = row;
        y = column;

        while(mirror[x][y] != 'x'){
                //the direction that down should have
                while(checkValue == "down"){
                    x += 1;

                    //to check for other directions in the array
                    if(mirror[x][y] == '/'){
                        checkValue = "left";
                    }
                    else if(mirror[x][y] == '\\'){
                        checkValue = "right";
                    }
                    else if(mirror[x][y] == 'x' ){
                        checkValue = "stop";
                    }
                }
                //the direction that up should be
                while(checkValue == "up"){
                    x -= 1;

                    //to check for other directions in the array
                    if(mirror[x][y] == '/'){
                        checkValue = "right";
                    }
                    else if(mirror[x][y] == '\\'){
                        checkValue = "left";
                    }
                    else if(mirror[x][y] == 'x' ){
                        checkValue = "stop";
                    }

                }
                //the direction that right should be
                while(checkValue == "right"){
                    y += 1;

                    //to check for other dircetions in the array
                    if(mirror[x][y] == '/'){
                        checkValue = "up";
                    }
                    else if(mirror[x][y] == '\\'){
                        checkValue = "down";
                    }
                    else if(mirror[x][y] == 'x' ){
                        checkValue = "stop";
                    }
                
                }
                //the direction that left should be
                while(checkValue == "left"){
                    y -= 1;

                    //to check for other directions in the array
                    if(mirror[x][y] == '/'){
                        checkValue = "down";
                    }
                    else if(mirror[x][y] == '\\'){
                        checkValue = "up";
                    }
                    else if(mirror[x][y] == 'x' ){
                        checkValue = "stop";
                    }
                
                }

            }   
            
        //assigns the end value of x to an &
        mirror[x][y] = '&';

        row = 0;
        column = 0;
        System.out.println("Your exit is marked with the & symbole.");

        //this will print out every column point in the amount of rows
        while(row < rowInArray){
            if(column < columnInArray){
                //prints out every column point point by point
                System.out.print(mirror[row][column]);
                column += 1;
            }
            //will print a new line if there at the end and increase row by 1 to go through each row
            else{
                System.out.println("");
                row += 1;
                column = 0;
            }
        }


    }
}

