package jftha.heroes;

import jftha.items.WoolClothing;
import jftha.items.WagonOfGoods;
import jftha.main.*;

public class Merchant extends Hero {
    
    final double discount = 1 - 0.25;
    
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
    
    /** Merchant version of buy that gives a discount for every purchase.
     * 
     * @param buy The item being bought.
     * @return True if the purchase went through
     */
    @Override
    public boolean buy(Buyable buy){
        int currentGold = this.getGold();
        //If character has the gold
        if(currentGold >= buy.getGoldCost()){
            double gold = currentGold - (buy.getGoldCost() * discount);
            currentGold = (int) Math.round(gold);
            this.setGold(currentGold);
            return true;
        }
        return false;
    }
    
    /**
     * 
     * @param enemy
     */
    @Override
    public void attackEnemy(Hero enemy){
        //Can only perform attacks with items and spells.
    }
}
