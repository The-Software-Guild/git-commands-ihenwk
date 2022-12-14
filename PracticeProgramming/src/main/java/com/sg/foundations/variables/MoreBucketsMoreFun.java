/**
  *Date: 12/10/2022
 * @author Ihesinachi Nwankwo
 * e-mail: ihe.nwk@hotmail.co.uk
 */
package com.sg.foundations.variables;

public class MoreBucketsMoreFun {
    public static void main(String[] args) {

        int butterflies, beetles, bugs;

        butterflies = 6;
        beetles = 9;

        bugs = butterflies + beetles;
        System.out.println("There are only " + butterflies + " butterflies,");
        System.out.println("but there are " + bugs + " bugs in all.");

        System.out.println("Uh oh, my dog ate one.");
        butterflies--; //used a decrement operator
        System.out.println("Now there are only " + butterflies + " butterflies left.");
        System.out.println("But there are still " + bugs + " bugs left...");
        System.out.println("Wait a minute!");
        System.out.println("... maybe my computer can't do math, after all!");
    }
    
    
}
