/*
 ************************************************************************
THIS IS THE TEST VERSION IN MY COURSE FILES
THIS IS THE TEST VERSION IN MY COURSE FILES
THIS IS THE TEST VERSION IN MY COURSE FILES
**************************************************************************
 */

package memory;

import java.io.IOException;
import java.util.Scanner;



/**
 *
 * @authors Sarah M and Janis F
 */
public class Memory {
    
     Player player1;
     Player player2;        
     
     String instructions = " Welcome to a game of Memory!"
            + "\n\tYou may play against the computer or"
             + " another player."
            + "\n\tBegin by choosing the options menu where "
             + "you will choose number of players and the level of difficulty"
             + "\n\tSelect Play, the game will begin, and you may select two cards."
            + "\n\tThe object of the game is to make the most matches."
             +"\n\tHave Fun!!"
             + "\n";
    
    public static void main(String[] args) throws IOException {
        Memory myGame = new Memory();
        myGame.displayHelp();
        
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.getInput();
        
        Card card1 = new Card();
        card1.status();
        card1.symbolsNeeded();
        
    }
    
    public void displayHelp(){
       System.out.println(this.instructions);        
    }
}