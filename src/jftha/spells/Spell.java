package jftha.spells;

import java.util.ArrayList;
import jftha.main.Buyable;

public class Spell extends Buyable{
    private int mpCost;
    
    //Setter methods
    public void setmpCost(int newmpCost){
        this.mpCost = newmpCost;
    }
    
    //Gettter methods
    public int getmpCost(){
        return this.mpCost;
    }
}
