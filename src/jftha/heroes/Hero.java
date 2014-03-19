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
    //Determines how much damage can be dealt to an enemy through weapons
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
    private int maxHP;
    private int currentHP;
    //Determined by Magic stat. Also known as magic points
    private int maxMP;
    private int currentMP;
    //Special to be determined by the defending class
    private Effect special; //***Should this be an Effect for an entirely new class?***
    
    private boolean isGhost;
    
    //Constructor
    public Hero(){
        this.strength = 10;
        this.agility = 10;
        this.magic = 10;
        this.defense = 10;
        this.luck = 10;
        this.storage_space = 5;
        this.spell_slots = 2;
        this.maxHP = 60;
        this.maxMP = 30;
        this.items = new ArrayList<>(this.storage_space);
        this.spells = new ArrayList<>(this.spell_slots);
        this.isGhost = false;
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
        this.items.ensureCapacity(storage_space);
    }
    public void setSpellSlots(int spell_slots){
        this.spell_slots = spell_slots;
        this.spells.ensureCapacity(spell_slots);
    }
    public void setHP(int hp){
        this.maxHP = hp;
    }
    public void setMP(int mp){
        this.maxMP = mp;
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
        return maxHP;
    }
    public int getMP(){
        return maxMP;
    }
    
    public void castSpell(){
        
    }
    
    public void makeGhost(){
        this.isGhost = true;
        //Cannot hold items, except spiritual items (see Items).
        this.items.clear(); // Need to check for spiritual items
        //Regen MP
        this.currentMP = this.maxMP;        
        //Cannot be hit, except by spiritual items or items/spells with Phantom Pain ability.
        
        //Can cast only Spectre Shot spell (cost 1 SE).
        this.spells.clear(); //save current spell in another arraylist incase player comes back;
        this.spells.add(null); // spectre shot;
        
        //If killed again (all of MP depleted), you are eliminated from the game.
        //if(isEliminated = true){ lose turn phase};
        
        //Note: Only certain items, such as spirit weapons, can drain SE.
    }
    
    public void unGhost(){
        this.isGhost = false;
        this.currentHP = this.maxHP;
        //Lose Spectre Shots;
    }
    
    public void atkEnemy(){
        //This player's turn
        //cannot atk ghost unless this character have spiritual item
        //This player's action
        //
        
    }
    //
    public boolean addItem(Item item) {
        if(!items.contains(item) && items.size() < storage_space) {
            if(items.add(item))
                return true;
        }
        return false;
    }
    
    public boolean addSpell(Spell spell) {
        if(!spells.contains(spell) && spells.size() < spell_slots) {
            if(spells.add(spell))
                return true;
        }
        return false;
    }
}

