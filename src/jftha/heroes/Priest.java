package jftha.heroes;

import jftha.items.Chasuble;
import jftha.items.Bible;
import jftha.spells.Heal;

public class Priest extends Hero{
    
    //Constructor
    public Priest(){
        this.setMP(super.getMP() + 10);
        this.setHP(super.getHP() - 10);
        this.addItem(new Chasuble());
        this.addItem(new Bible());
        this.addSpell(new Heal());
    }
    
}
