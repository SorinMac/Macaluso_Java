//Sorin Macaluso
//hw11
//CMPT 220 
//Problem2.java

//this uses the animal, tiger, chicken classes to assigin weights to different tiger and chicken
//then compares those different chicken and tigers and sort them in a list

public class Problem2 {
    public static void main(String[] args) {
        //main method of input that the assignment had
        Animal[] list = new Animal[5];
        list[0] = new Chicken();
        list[0].setWeight(4.5);
        list[1] = new Tiger();
        list[1].setWeight(46.6);
        list[2] = new Chicken();
        list[2].setWeight(1.5);
        list[3] = (Animal)(list[0].clone());
        list[3].setWeight(7.5);
        list[4] = (Animal)(list[1].clone());

        //array to sort
        java.util.Arrays.sort(list);
        for (int i = 0; i < list.length; i++) {
        System.out.println("weight: " + list[i].getWeight());
        }
        
    }

}
  //animal class to assigne the weight to the animals that are made
  abstract class Animal implements Cloneable,Comparable<Animal>{
    private double weight;
    
    public double getWeight() {
      return weight;
    }
    
    public void setWeight(double weight) {
      this.weight = weight;
    }

    //the override to user clone
    @Override
    public Object clone() {
      try {
        return super.clone();
      }
      catch (CloneNotSupportedException ex) {
        return null;
      }
    }

    //the override to user to use the compareto
    @Override
    public int compareTo(Animal o) {
      if (getWeight() - o.getWeight() > 0)
        return 1;
      else if (getWeight() - o.getWeight() < 0)
        return -1;
      else
        return 0;
    }

    
    
  }
  

  //the chicken class to make the chickem
  class Chicken extends Animal {

    public Chicken() {

    }

    
    


  }

  //the tiger class to make the tiger
  class Tiger extends Animal {
    
    public Tiger() {

    }

    
    
  }

  
    

  
  

