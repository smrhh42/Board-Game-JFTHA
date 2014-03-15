/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jftha.heroes;

public class Ninja extends Hero{
    
    //Constructor
    public Ninja(){
        this.setAgility(super.getAgility() + 2);
        this.setDefense(super.getDefense() - 2);
    }
}
