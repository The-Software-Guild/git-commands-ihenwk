/**
 * 
 * @author Ihesinachi Nwankwo
 */
package com.sg.basicprogrammingconceptsassessment;

import java.util.Random;
import java.util.Scanner;


public class RockPaperScissors {
    public static void main (String[]args){
        
        boolean startAgain;
        startAgain = true;
        
        while (startAgain == true) {
            //use do-while loop to start the game again here
            System.out.println("Hello, What is your name?");

            Scanner nameInput = new Scanner(System.in);
            String playerName = nameInput.nextLine();

            System.out.println("Well "+ playerName + "...");

            System.out.println("How many rounds would you like to play? You can play up to 10 rounds");

            //Takes input from user for number of rounds they want to play:

            Scanner myRounds = new Scanner(System.in);
            String numRounds = myRounds.nextLine();

            int pickedRounds = Integer.parseInt(numRounds);

            int userWins;
            int compWins;
            int tiesGame;

                   

                    userWins = 0;
                    compWins = 0;
                    tiesGame = 0;


            if (pickedRounds <= 10 && pickedRounds > 0){

                for (int i = 0; i < pickedRounds; i++){

                    System.out.println("Let's play! Rock, paper, scissors?");
                    System.out.println("Type '1' for Rock");
                    System.out.println("Type '2' for Paper");
                    System.out.println("Type '3' for Scissors");


                    //Takes input for rock paper scissors for user.
                    Scanner input = new Scanner(System.in);
                    String inputRps = input.nextLine();

                    int usersChoice = Integer.parseInt(inputRps);

                    //This will allow computer to randomly generate its choice for rock, paper,scissors

                    Random RpsChoice = new Random();
                    int computerChoice = RpsChoice.nextInt(3)+ 1;     //put +1 so that computer picks a number between 1 and 3.
                    //System.out.println("computer chose: "+ computerChoice);

                    //Conditional statements that need to be evaluated to determine the outcome of the round. 

                    if (usersChoice == 2 && computerChoice == 1){
                        System.out.println("Congratulations, " + playerName + " you won this round!");
                        userWins += 1;
                        //return userWins;
                    }

                    if (usersChoice == 2 && computerChoice == 2){
                        System.out.println("It's a tie.");
                        tiesGame += 1;
                        //return tiesGame;
                    }

                    if (usersChoice == 2 && computerChoice == 3){
                        System.out.println("The Computer won. " + "Losing sucks "+ playerName + ". Better luck next round.");
                        compWins += 1;
                       // return compWins;
                    }

                    if (usersChoice == 1 && computerChoice == 1){
                        System.out.println("It's a tie.");
                        tiesGame += 1;
                        //return tiesGame;
                    }

                    if (usersChoice == 1 && computerChoice == 2){
                        System.out.println("The Computer won. " + "Losing sucks "+ playerName + ". Better luck next round.");
                        compWins += 1;
                        //return compWins;
                    }

                    if (usersChoice == 1 && computerChoice == 3){
                        System.out.println("Congratulations, "+ playerName + " you won this round!");
                        userWins += 1;
                        //return userWins;
                    }

                    if (usersChoice == 3 && computerChoice == 1){
                        System.out.println("The Computer won. " + "Losing sucks " +playerName + ". Better luck next round.");
                        compWins += 1; 
                        //return compWins;
                    }

                    if (usersChoice == 3 && computerChoice == 2){
                        System.out.println("Congratulations, "+ playerName + " you won this round!");
                        userWins += 1;
                        //return userWins;
                    }

                    if (usersChoice == 3 && computerChoice == 3){
                        System.out.println("It's a tie.");
                        tiesGame += 1;
                        //return tiesGame;
                    }
                     System.out.println("");
                     System.out.println("---The Score So Far---");
                     System.out.println(playerName + " wins: " + userWins);
                     System.out.println("Computer wins: " + compWins); 
                     System.out.println("Ties: " + tiesGame);
                     System.out.println("");


                }


                //Declares how many ties, user wins and computer wins there are


                    //Conditional statements used to determine who the winner of the game is. 
                    System.out.println("And the winner is....");

                    if (userWins > compWins && userWins > tiesGame){
                        System.out.println("Congratulations, " + playerName + " you won the game!! ");
                    }

                    if (compWins > userWins && compWins > tiesGame){
                        System.out.println("Better luck next time! The computer won! ");
                    }

                    if (tiesGame > compWins && tiesGame > userWins){
                        System.out.println("It's a tie! No winners or losers today! ");
                    } 

                    if (tiesGame == compWins && tiesGame == userWins){
                        System.out.println("It's a tie! No winners or losers today! ");
                    }

                    System.out.println(" ");
                    System.out.println("---The Final Score ---");
                    System.out.println(playerName + " wins: " + userWins);
                    System.out.println("Computer wins: " + compWins); 
                    System.out.println("Ties: " + tiesGame);
                    System.out.println("  ");
                    
                    // Code executed if player does not state number of rounds between 1 - 10.
            } else {
                    System.out.println("Error: TRY AGAIN!! Please choose the number of rounds you would like to play.");
                    System.out.println("You can play up to 10 rounds");}
                    Scanner playAgain = new Scanner(System.in);

                   // Asks player if they want to play again

                    System.out.println(" Do you want to play again?");
                    System.out.println("Type 'y' for yes");
                    System.out.println("Type 'n' for no");

                    if (playAgain.next().equals("y")){
                        startAgain = true;

                    } else{
                        startAgain = false;
                    }

}        
       
    }
    
}
