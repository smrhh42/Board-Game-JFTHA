package jftha.heroes;

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
}

