/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package board.game.jftha;

import java.util.*;

public class Dice {
    int roll;
    
    //Constructor
    public Dice(){
        Random rand = new Random();
        this.roll = rand.nextInt(4) + 1;
    }
    
    protected int getRoll(){
        return roll;
    }
    
}
