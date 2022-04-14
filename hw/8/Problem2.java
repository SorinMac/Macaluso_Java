//Sorin Macaluso
//hw9
//CMPT 220 
//Problem2.java

//Sorts objects into boxes of maximum weight 10


import java.util.Scanner;


public class Problem2 {
    public static void main(String[] args) {
        //asks the user for input
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of objects: ");
        int amountOfObjects  = input.nextInt();
        int [] Objects = new int[amountOfObjects];
        int boxNumebr = 0;

        //adds the weight of the objects to an array
        for(int i=0;i<amountOfObjects;i++){
            System.out.print("Enter weight of the objects: ");
            int objectsWeight = input.nextInt();
            Objects[i] = objectsWeight;
        }

        //sorting method from least to greatest
        for (int i = 0; i < amountOfObjects; i++) {
            int least = i;

            for(int j=i+1;j<amountOfObjects; j++){
                if (Objects[j] < Objects[least]) {
                    least = j;
                }

                int tempvalue = Objects[i];
                Objects[i] = Objects[least];
                Objects[least] = tempvalue;          
            }
 
    }
    //makeing a to fromat the output nicer
    System.out.println(" ");

        //first if is a check to make sure the same value is not used twice, does nothing a skip
        for(int i=amountOfObjects-1;i>-1;i--){
            
            if(Objects[i]==11){
                
            }
            //elseif creates a box with one in it for the inputs that are odd
            else if(i==0){
                boxNumebr++;
                System.out.println("Box " + Objects + " has " + Objects[i]);
            }
            //handles the boxes when it finds two values that make 10
            else{
                for(int j=i-1; j>-1; j--){
                    if(Objects[i] + Objects[j]<=10){
                        boxNumebr++;
                        System.out.println("Box " + boxNumebr + " has " + Objects[i] + " and " + Objects[j]);
                        Objects[i]=11;
                        Objects[j]=11;
                        j=-2;
                        

                    }
                    //if not makes an single slot box for the end
                    else if(j==0){
                        boxNumebr++;
                        System.out.println("Box " + Objects + " has " + Objects[i]);
                        Objects[i]=11;
                        

                    }
            
                }

            }
        }

    }
    
}
