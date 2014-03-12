/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package board.game.jftha;

/**
 *
 * @author tue75856
 */
public class BoardGameJFTHA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hero hero = new Hero();
        int strength = hero.getStrength();
        System.out.println("hero strength = " + strength);
        Barbarian barb = new Barbarian();
        strength = barb.getStrength();
        System.out.println("barb strength = " + strength);
        
        int magic = hero.getMagic();
        System.out.println("hero magic = " + magic);
        magic = barb.getMagic();
        System.out.println("barb magic = " + magic);
        
        Dice dice = new Dice();
        int roll = dice.getRoll();
        System.out.println("roll number = " + roll);
        
        //This is Josh here just to test committing
    }
}
