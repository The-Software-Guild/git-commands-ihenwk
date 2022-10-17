/**
 *Date: 13/10/2022
 * @author Ihesinachi Nwankwo
 */
package com.sg.basicprogrammingconceptsassessment;

import java.util.Scanner;


public class HealthyHearts {
    public static void main(String[] args){
    
        String stringAge;
        int age;
        int maxHeartRate;
        int lowHeartRange;
        int highHeartRange;

        System.out.println("What is your age?");

        Scanner myScanner = new Scanner(System.in);

        stringAge = myScanner.nextLine();

        age = Integer.parseInt(stringAge);

        maxHeartRate = 220 - age;

        lowHeartRange = (int) (Math.round(maxHeartRate * 0.5));

        highHeartRange = (int) (Math.round(maxHeartRate * 0.85));
        

        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute");
        System.out.println("Your target HR Zone is " + lowHeartRange + " - " + highHeartRange + " beats per minute");
    
    }
     
}
