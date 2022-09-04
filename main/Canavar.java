/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Random;

/**
 *
 * @author irem
 */
public class Canavar {
    private int damage,award,maxNum,health;
    private String name,award1;

    /**
     * @return the damage
     */
    public Canavar(String name,int damage,int award,int maxNum,int health)
    {
        this.name=name;
        this.damage=damage;
        this.award=award;
        this.maxNum=maxNum;
        this.health=health;
      
    }
    
    public int count()//Canavar sayısı
    {
        Random r=new Random();
        return r.nextInt(this.maxNum)+1;
    }           
    
    
    public int getDamage() {
        return damage;
    }

    /**
     * @param damage the damage to set
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * @return the award
     */
    public int getAward() {
        return award;
    }

    /**
     * @param award the award to set
     */
    public void setAward(int award) {
        this.award = award;
    }

    /**
     * @return the maxnum
     */
    public int getMaxnum() {
        return maxNum;
    }

    /**
     * @param maxnum the maxnum to set
     */
    public void setMaxnum(int maxNum) {
        this.maxNum = maxNum;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
    }
    
    
   
}
