/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author irem
 */
public abstract class Location {
    Scanner input=new Scanner(System.in);
   protected  Player player;
   protected  String name;
    
    
    public Location(Player player)
    {
       this.player=player;
      
        
    }
    public abstract boolean getLocation();
    
    //Setter-Getter
    
    public void SetPlayer(Player player)
    {
        this.player=player;
    }
    public Player GetPlayer()
     {
   return player;
      }
    
    public void SetName(String Name)
    {
        this.name=name;
    }
    public String GetName()
     {
   return name;
      }
   
    
}
