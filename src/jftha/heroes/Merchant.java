package jftha.heroes;

import jftha.items.WoolClothing;
import jftha.items.WagonOfGoods;

public class Merchant extends Hero{
    
    //Constructor
    public Merchant(){
        this.setStorageSpace(super.getStorageSpace() + 3);
        this.setStrength(super.getStrength() - 2);
        this.setAgility(super.getAgility() + 2);
        this.setMagic(super.getMagic() - 5);
        this.setDefense(super.getDefense() - 2);
        this.setLuck(super.getLuck() + 5);
        this.addItem(new WoolClothing());
        this.addItem(new WagonOfGoods());
        
    }
    
}
