package jftha.heroes;

import jftha.items.WoolClothing;
import jftha.items.WagonOfGoods;
import jftha.main.*;

public class Merchant extends Hero{
    
    final double discount = 0.25;
    
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
    
    @Override
    public boolean buy(Buyable buy){
        int f = buy.getGoldCost(); 
        f -= (buy.getGoldCost() * discount);
        //need setter and getter for gold
        //this.getGold() - f;
        return false;
    }
    
    @Override
    public void atkEnemy(){
        //Can only perform attacks with items and spells.
    }
}
