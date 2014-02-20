    /*
  ************************************************************************
THIS IS THE TEST VERSION IN MY COURSE FILES
THIS IS THE TEST VERSION IN MY COURSE FILES
THIS IS THE TEST VERSION IN MY COURSE FILES
**************************************************************************
 */

package memory;

import java.util.Scanner;

/**
 *
 * @author Janis
 */
public class GetPlayersListView {
    

    int numPlayers=2;
   // int playerIndex;
    
     public String[] listOfPlayerNames = new String[numPlayers];
    
    public GetPlayersListView() {
        
    }
    
    public String[] getInput(){
        int playerIndex;
        
        Scanner inFile = new Scanner(System.in);
        
        for  ( playerIndex=0; playerIndex < numPlayers; playerIndex++){
            System.out.println("Please enter the name of player #" +(playerIndex+1)+ ": ");
            String playersName;
            playersName = inFile.nextLine();
            playersName = playersName.trim();
            
            //add names to player list of names
            this.listOfPlayerNames[playerIndex]=playersName;
           
        }
            
            String[] newNameList = new String[playerIndex];
            for (int i = 0; i< playerIndex;i++)
                newNameList[i]=this.listOfPlayerNames[i];
            
            
            this.displayNameList(newNameList);
            
            
     return newNameList;   
    }
    
    public void displayNameList(String[] names){
        System.out.println("\tHere is the unsorted list of players in the game");
     
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                break;
            }
                
            int namePosition = i+1;
            System.out.println("\t   " + namePosition + "\t" + names[i]);
        }
    }
    
    
}

    
    
    
