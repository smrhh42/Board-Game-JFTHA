package jftha.heroes;

import jftha.items.ShiningArmor;
import jftha.items.DivineBlade;
import jftha.spells.Heal;

public class Paladin extends Hero{
   
    //Constructor
    public Paladin(){
        this.setStrength(super.getStrength() + 5);
        this.setMagic(super.getMagic() + 5);
        this.setDefense(super.getDefense() + 5);
        this.setLuck(super.getLuck() +5);
        this.setHP(super.getHP() + 20);
        this.setMP(super.getMP() + 10);
        this.setSpellSlots(super.getSpellSlots() + 1);
        this.addItem(new ShiningArmor());
        this.addItem(new DivineBlade());
        this.addSpell(new Heal());
    }
    
}