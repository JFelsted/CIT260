/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

/**
 *
 * @author Sarawr
 */
public class Board {
    int rows = 6;
    int columns = 9;
    
    public Board(){
    }
   
    public void displayGrid() {
        System.out.println("\n\tThe board is " + this.rows + " by " 
                           + this.columns + " in size.");
        //will eventually show actually grid, not text//
        }
    }