/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author irem
 */
public abstract class NormalLoc extends Location {

    public NormalLoc( Player player,String name) {
        super(player);
        this.name=name;
    }

    
  
    public boolean getLocation() {
       return true;//Burada mı eğer ölürsek false çevireceğiz.
    }
    
    
}
