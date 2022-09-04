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
public class inventory {
    private  boolean water;
    private boolean food;
    private boolean firewood;
    private String weaponName;
    private String armorName;
    private int WeaponDamage;
    private int ArmorDefence;
    
    inventory()
    {
        this.water=false;
        this.food=false;
        this.firewood=false;
        this.WeaponDamage=0;
        this.ArmorDefence=0;
        this.weaponName=null;
        this.armorName=null;
    }

    /**
     * @return the water
     */
    public boolean isWater() {
        return water;
    }

    /**
     * @param water the water to set
     */
    public void setWater(boolean water) {
        this.water = water;
    }

    /**
     * @return the food
     */
    public boolean isFood() {
        return food;
    }

    /**
     * @param food the food to set
     */
    public void setFood(boolean food) {
        this.food = food;
    }

    /**
     * @return the firewood
     */
    public boolean isFirewood() {
        return firewood;
    }

    /**
     * @param firewood the firewood to set
     */
    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }

    /**
     * @return the weaponName
     */
    public String getWeaponName() {
        return weaponName;
    }

    /**
     * @param weaponName the weaponName to set
     */
    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    /**
     * @return the armorName
     */
    public String getArmorName() {
        return armorName;
    }

    /**
     * @param armorName the armorName to set
     */
    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    /**
     * @return the weaponDamage
     */
    public int getWeaponDamage() {
        return WeaponDamage;
    }

    /**
     * @param weaponDamage the weaponDamage to set
     */
    public void setWeaponDamage(int WeaponDamage) {
        this.WeaponDamage = WeaponDamage;
    }

    /**
     * @return the armorDefence
     */
    public int getArmorDefence() {
        return ArmorDefence;
    }

    /**
     * @param armorDefence the armorDefence to set
     */
    public void setArmorDefence(int ArmorDefence) {
        this.ArmorDefence = ArmorDefence;
    }
}
