package jftha.heroes;

public class Priest extends Hero{
    
    //Constructor
    public Priest(){
        this.setMP(super.getMP() + 10);
        this.setHP(super.getHP() - 10);
    }
    
}
