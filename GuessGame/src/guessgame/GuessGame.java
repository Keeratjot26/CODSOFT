/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessgame;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random(); // AN INSTANCE/OBJECT OF RANDOM CLASS IS BEING CREATED WHICH IS USED TO GENERATE A RANDOM NUMBER 
        boolean playAgain; // DETERMINES IF ANOTHER ROUND SHOULD BE PLAYED OR NOT BASED ON USERS INPUT
        //EACH ROUND OF DO WHILE LOOP REPRESENTS A NEW ROUND
        do {
            int generatedNum = random.nextInt(100)+1; // A RANDOM NUMBER IS GENERATED BETWEEN 1 TO 100 
            int userNum = 0;
            int attempts = 0;
            int maxAttempts = 5;
            int score = 10; // INITIALIZING THE SCORE TO 10 
            boolean correctGuess = false; // initialized with false because at the start of the game user hasnt guessed the number corectly 
            
            System.out.println("A number between 1 and 100 has been chosen. Can you guess it?");
             while(attempts<maxAttempts && !correctGuess){
             
                 System.out.print("Enter your guess(Attempt "+(attempts+1)+ " of "+ maxAttempts + "): ");
                 userNum = sc.nextInt();
                 attempts++;
                 
                 if(userNum < generatedNum){
                     System.out.println("Too Low!! Try Again");
                     score -= 2; // 10 - 2 for wrong answer in each attempt!!
                 }
                 else if (userNum > generatedNum){
                 System.out.println("Too High!! Try Again");
                 score -= 2; 
             }
                 else{
                     System.out.println("Correct!! You have guessed the number!");
                     System.out.println("Your Score is :"+ score);
                     break;
                 }
                
             }
             if(!correctGuess){
                 System.out.println("Sorry you have reached the maximum number of attempts!!\nThe number was "+generatedNum);
                 System.out.println("Your Score is :"+ score);
             }
             
            System.out.print("Do you want to play again? (Yes/No): ");
            playAgain = sc.next().equalsIgnoreCase("Yes");
        }while(playAgain);
        System.out.println("Thanks for Playing!!");                                
}
                    
}
