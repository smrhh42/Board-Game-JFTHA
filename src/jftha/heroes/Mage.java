package jftha.heroes;

import jftha.items.MageRobe;
import jftha.items.SpellBook;
import jftha.spells.Fireball;
import jftha.spells.Shield;

public class Mage extends Hero{
    
    //Constructor
    public Mage(){
        this.setMagic(super.getMagic() + 2);
        this.setStrength(super.getStrength() - 2);
        this.setDefense(super.getDefense() - 3);
        this.setSpellSlots(super.getSpellSlots() + 2);
        this.addItem(new MageRobe());
        this.addItem(new SpellBook());
        this.addSpell(new Fireball());
        this.addSpell(new Shield());
    }
}
