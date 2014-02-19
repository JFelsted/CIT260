/*
 ************************************************************************
THIS IS THE TEST VERSION IN MY COURSE FILES
THIS IS THE TEST VERSION IN MY COURSE FILES
THIS IS THE TEST VERSION IN MY COURSE FILES
**************************************************************************
 */

package memory;

/**
 *
 * @author Janis
 */
public class Card {
    
    int number = 5; // for now to use until graphics can be added
    String shape = ""; 
    String color = "";
    boolean flipped = true; // indicates which side of the card is showing, True is face-up
    
    
    public Card(){
    
    }
    public void status(){
        if (flipped){
            System.out.println("Card display is " +number);
        }
    }
    
    public void symbolsNeeded(){
      int numSymbols;
      int numMatching;
      int numCards;
            
    }
}
