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
public class Player {
    Scanner input=new Scanner(System.in);
    private inventory inventory;
    private int damage;
    private int rHealthy;//Güvenli eve gidince hiç değişmeyecek can
    private int healthy;
    private int money;
    private String name;
    private String Cname;//Karakter adı
    
    
    public Player(String name)
    {
        this.name=name;
        this.inventory= new inventory();
    }
    
    
    public void SelectChar()
    {
       switch(showMenu())
       {
           case 1:
           {
        initPlayer("Samuray",10,5,18);
          break;
           }
           
            case 2:
           {
          initPlayer("Şovalye",15,10,21);
          break;
           }
           
            case 3:
           {
           initPlayer("Okçu",20,15,24);
          break;
           }
          
           
       }
        System.out.println();
        System.out.println();
        System.out.println("Seçmiş olduğunuz karakter :"+ GetName()+ " || Parası :"+ GetMoney()+ " || Hasarı :"+ GetDamage()+ " || Sağlığı :"+ GetHealthy());
        System.out.println();
        System.out.println();
    }
    
    public int showMenu()
    {
         System.out.println();
        System.out.println();
        System.out.println("===KARAKTERLER===");
      
        System.out.println("id=1 || Ad:Samuray || Para:10 || Hasar:5 || Sağlık: 18");
        System.out.println("id=2 || Ad:Şovalye|| Para:15 || Hasar:10 || Sağlık: 21");
        System.out.println("id=3 || Ad:Okçu || Para:20 || Hasar:15 || Sağlık: 24");
        System.out.print("id numaralarına göre bir  karakter Seçiniz :");
        System.out.println();
        System.out.println();
        int chNum=input.nextInt();
        if(chNum<1 || chNum>3)
        {
            System.out.println("Geçerli bir id numarası yazınız");
            chNum=input.nextInt();
        }
        return chNum;
       
    }
    public void initPlayer(String Cname,int money,int damage,int healthy)
    {
          SetName(Cname);
          SetDamage(damage);
          SetMoney(money);
          SetHealthy(healthy);
         
          SetrHealthy(healthy);
    }
    
    public int getTotalDamage()
    {
        return this.GetDamage()+this.getInventory().getWeaponDamage();
    }

    /**
     * @return the inventory
     */
    //Getter-Setter
    public void SetDamage(int damage)
    {
        this.damage=damage;
    }
    public int GetDamage()
    {
        return damage;
    }
    
    public void SetHealthy(int healthy)
    {
        this.healthy= healthy;
    }
    public int GetHealthy()
    {
        return  healthy;
    }
    
    public void SetMoney(int money)
    {
        this.money=money;
    }
    public int GetMoney()
    {
        return money;
    }
    
    public void SetName(String name)
    {
        this.name=name;
    }
    public String GetName()
    {
        return name;
    }
    
    public void SetrHealthy(int rHealthy)
    {
        this.rHealthy=rHealthy;
    }
    public int GetrHealthy()
    {
        return rHealthy;
    }
    //
    public inventory getInventory() {
        return inventory;
    }

    /**
     * @param inventory the inventory to set
     */
    public void setInventory(inventory inventory) {
        this.inventory = inventory;
    }
    
    
    
}
