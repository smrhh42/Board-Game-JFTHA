package jftha.main;

import jftha.heroes.Barbarian;
import jftha.heroes.Hero;

public class Main {

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
    }
}
