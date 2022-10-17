
/**
 *
 * @author Ihesinachi Nwankwo
 */


package com.sg.basicprogrammingconceptsassessment;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    
    public static void main (String[]args){
        
        System.out.println("What is your dog's name?");
        Scanner animalNameScanner = new Scanner(System.in);
        String dogName = animalNameScanner.nextLine();
        
        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        System.out.println(dogName + " is:");
        
        
        int max = 100;
        int sumNumbers;
        int finalNumber;
        int randomNumber;
        int [] randomNumArr = new int[4];
        
        sumNumbers = 0;
       
        //for loop generates 4 random numbers and changes the range for the numbers on each iteration.
        Random rng = new Random();
        for (int i = 0; i <= 3; i++){
             randomNumber = rng.nextInt(max) + 1;
             sumNumbers = sumNumbers + randomNumber;
             int difference = max - randomNumber;
             max = difference;
             randomNumArr[i]= randomNumber;
             
        }
        
        // calculates the last number:
        finalNumber = 100 - sumNumbers;
        
        //Store elements in individual variables to link them to a breed of dog using print statements
       
        int num1 = randomNumArr[0];
        int num2 = randomNumArr[1];
        int num3 = randomNumArr[2];
        int num4 = randomNumArr[3];
            
        
        System.out.println(num1 + "%: St Bernanrd"); //Need to assign a random number to this 
        System.out.println(num2 +"%: Chihuahua"); //Need to assign a random number to this
        System.out.println(num3 +"%: Dramatic RedNosed Asian Pug"); //Need to assign a random number to this
        System.out.println(num4 +"%: Common Cur"); //Need to assign a random number to this
        System.out.println(finalNumber + "%: King Doberman"); //Need to assign a random number to this
        
        // add code here 
        
        System.out.println("");
        System.out.println("Wow, that's QUITE the dog!");
    }
    
}
