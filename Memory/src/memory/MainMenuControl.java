/*
 ************************************************************************
THIS IS THE TEST VERSION IN MY COURSE FILES
THIS IS THE TEST VERSION IN MY COURSE FILES
THIS IS THE TEST VERSION IN MY COURSE FILES
**************************************************************************
 */

package memory;

import java.io.IOException;

/**
 *
 * @author Sarawr
 */
public class MainMenuControl {
    public MainMenuControl() {
        
    } 

    public void startGame() throws IOException /*Case S*/{
        Game newGame = new Game();
        newGame.startGame();
    }
    
    public void displayOptionMenu()/*Case O*/ {
        OptionMenuView optionMenuView = new OptionMenuView();
        optionMenuView.getInput();
    }
    public void displayHelpMenu()/*Case H*/ {     
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.getInput();
    }
                            
}
