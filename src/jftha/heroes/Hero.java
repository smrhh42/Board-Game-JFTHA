/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jftha.heroes;

import java.util.ArrayList;
import jftha.items.Item;
import jftha.spells.Spell;
import jftha.main.Effect;

public class Hero {
    //Determines how much damage can be dealth to an enemy through weapons
    private int strength;
    //Determines how many spaces the player can move per turn
    private int agility;
    //Determines how many MP(magic points) the player has, what spells the player can cast,
    //and how much damage can be dealt to an enemy
    private int magic;
    //Determines how much HP(health point) a player has and how much damage a player can endure
    private int defense;
    //Affect all skills by a little bit
    private int luck;
    //Determines how many items a player can hold at any time
    private int storage_space;
    //The items the Hero is currently carrying
    private ArrayList<Item> items;
    //Determines how many spells a player is able to cast
    private int spell_slots;
    //The spells the Hero currently knows
    private ArrayList<Spell> spells;
    //Determined by Defense stat. Also known as health points
    private int hp;
    //Determined by Magic stat. Also known as magic points
    private int mp;
    //Special to be determined by the defending class
    private Effect special; //***Should this be an Effect for an entirely new class?***
    
    //Constructor
    public Hero(){
        this.strength = 10;
        this.agility = 10;
        this.magic = 10;
        this.defense = 10;
        this.luck = 10;
        this.storage_space = 5;
        this.spell_slots = 2;
        this.hp = 60;
        this.mp = 30;
    }
    
    //Setter methods
    public void setStrength(int strength){
        this.strength = strength;
    }
    public void setAgility(int agility){
        this.agility = agility;
    }
    public void setMagic(int magic){
        this.magic = magic;
    }
    public void setDefense(int defense){
        this.defense = defense;
    }
    public void setLuck(int luck){
        this.luck = luck;
    }
    public void setStorageSpace(int storage_space){
        this.storage_space = storage_space;
    }
    public void setSpellSlots(int spell_slots){
        this.spell_slots = spell_slots;
    }
    public void setHP(int hp){
        this.hp = hp;
    }
    public void setMP(int mp){
        this.mp = mp;
    }
    
    //Getter Methods
    public int getStrength(){
        return strength;
    }
    public int getAgility(){
        return agility;
    }
    public int getMagic(){
        return magic;
    }
    public int getDefense(){
        return defense;
    }
    public int getLuck(){
        return luck;
    }
    public int getStorageSpace(){
        return storage_space;
    }
    public int getSpellSlots(){
        return spell_slots;
    }
    public int getHP(){
        return hp;
    }
    public int getMP(){
        return mp;
    }
}

