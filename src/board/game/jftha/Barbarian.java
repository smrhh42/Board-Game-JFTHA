/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package board.game.jftha;

public class Barbarian extends Hero{
    
    //Constructor
    public Barbarian(){
        this.setStrength(super.getStrength() + 2);
        this.setMagic(super.getMagic() - 2);
    }
}

