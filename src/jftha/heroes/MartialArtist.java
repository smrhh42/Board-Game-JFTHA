package jftha.heroes;

public class MartialArtist extends Hero{
    
    //Constructor
    public MartialArtist(){
        this.setStrength(super.getStrength() + 2);
        this.setAgility(super.getAgility() + 2);
        this.setHP(super.getHP() + 10);
        this.setMP(super.getMP() + 10);
    }
    
}
