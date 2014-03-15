package jftha.heroes;

public class Thief extends Hero{

    //Constructor
    public Thief(){
        this.setLuck(super.getLuck() + 2);
    }
}
