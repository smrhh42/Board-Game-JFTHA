package jftha.spells;

import jftha.main.Buyable;

public class Spell extends Buyable{
    private int mpCost;
    
    // Constructor
    public Spell() {
    }
    
    // Setter methods
    public void setmpCost(int newmpCost){
        this.mpCost = newmpCost;
    }
    
    // Gettter methods
    public int getmpCost(){
        return this.mpCost;
    }
}
