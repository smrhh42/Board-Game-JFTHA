package jftha.heroes;

import java.util.Random;
import jftha.items.AnimalSkin;
import jftha.items.Ax;

public class Barbarian extends Hero{
    
    //Constructor
    public Barbarian(){
        this.setStrength(super.getStrength() + 2);
        this.setMagic(super.getMagic() - 2);
        this.addItem(new AnimalSkin());
        this.addItem(new Ax());
    }
    
    public void ifAtked(){
        Random rand = new Random();
        if((rand.nextInt(5) + 1) == 1){
            //attack back with 2x strength
        }
    }
}

