/**
  *Date: 14/10/2022
 * @author Ihesinachi Nwankwo
 * e-mail: ihe.nwk@hotmail.co.uk
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

public class MiniMadLibs {
    public static void main(String[]args){
        
        String noun1, adjective1, noun2, adjective2, pluralNoun1,pluralNoun2, pluralNoun3, verbPresent, verbPast;
        String number;
        
        Scanner wordReader = new Scanner(System.in);
        
        System.out.println(" I need a noun: ");
        noun1 = wordReader.nextLine();
                
        System.out.println(" Now an adjective: ");
        adjective1 = wordReader.nextLine();
                
        System.out.println("Another noun: ");
        noun2 = wordReader.nextLine();
                
        System.out.println("And a number: ");
        number = wordReader.nextLine();
                
        System.out.println(" Another adjective: ");
        adjective2 = wordReader.nextLine();
                
        System.out.println(" A plural noun: ");
        pluralNoun1 = wordReader.nextLine();
                
        System.out.println("Another one: ");
        pluralNoun2 = wordReader.nextLine();
                
        System.out.println("One more: ");
        pluralNoun3 = wordReader.nextLine();
                
        System.out.println("A verb (infinitive form): ");
        verbPresent = wordReader.nextLine();
                
        System.out.println("Same verb (past participle");
        verbPast = wordReader.nextLine();
        
        System.out.print(noun1 + ": the " +  adjective1 +" frontier. " +"These are the voyages of the starship "+ noun2 +". " + "Its "+ number +" -year mission: to explore strange " + adjective2 +" "+pluralNoun1);
        System.out.print(", to seek out "+ adjective2 +" "+ pluralNoun1 +", to seek out " + adjective2 + " " + pluralNoun2 +" and "+ adjective2 +" "+ pluralNoun3 +", to boldly " + verbPresent + " where no one has "+ verbPast+ " before.");
        
        
    }
    
}
