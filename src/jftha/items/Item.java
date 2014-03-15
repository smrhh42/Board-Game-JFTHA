package jftha.items;

import jftha.main.Buyable;
import java.util.ArrayList;

public class Item extends Buyable{

    private String rarity;
    
    public void setRarity(String newRarity){
        this.rarity = newRarity;
    }
    
    public String getRarity(){
        return this.rarity;
    }
}
