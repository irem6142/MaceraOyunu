/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.xml.transform.Source;

/**
 *
 * @author irem
 */
public abstract  class BattleLoc extends Location {
  Canavar canavar;
  String award;
    public BattleLoc(Player player,String name,Canavar canavar,String award) {
        super(player);
        this.name=name;
        this.canavar=canavar;
        this.award=award;
    }
    
 
    public boolean getLocation() {
       int canavarSayisi=canavar.count();
        System.out.println("Şu an buradasınız :"+this.GetName()+"\nDikkatli olun burada "+ canavarSayisi+ " tane "+ canavar.getName()+" yaşıyor.");
        System.out.println("Savaş için =>S || Kaçmak için=>K");
        String s=input.nextLine();
        s=s.toUpperCase();
    
        
            if(s.equals("S"))
        {
            if( combo(canavarSayisi))
            {
                System.out.println();
                System.out.println(this.GetName()+" bölgesindeki düşmanlarınızı yendiniz ");
               
                if(this.award.equals("Food") && player.getInventory().isFood()==false)//Hiç kazanmamışsa false
                {
                    System.out.println(this.award +" kazandınız");
                    player.getInventory().setFood(true);
                }
                else if(this.award.equals("FireWood") && player.getInventory().isFirewood()==false)
                {
                    System.out.println(this.award +" kazandınız");
                    player.getInventory().setFirewood(true);
                }
                else if(this.award.equals("Water") && player.getInventory().isWater()==false)
                {
                    System.out.println(this.award +" kazandınız");
                    player.getInventory().setWater(true);
                }
                 return true;
                
            }
           if(player.GetHealthy()<=0)
           {
               System.out.println("Kaybettiniz");
              return  false;
           }
           
           
        }
       
        
        return true;
      
    }
    public boolean combo(int canavarSayisi){
       
        for(int i=0;i<canavarSayisi;i++)
        {
             int defCnavarHealthy=canavar.getHealth();//Canavarla dövüşürken mesela 2 canavar geldi diğerini öldürdüğümüzde diğerinin canı aynı olsun diye
        PlayerStats();
        EnemyStats();
           while(canavar.getHealth()>0 && player.GetHealthy()>0)
           {
               System.out.println("Vurun ya da Kaçın");
               String sec=input.nextLine();
               sec=sec.toUpperCase();
               if(sec.equals("V"))
               {
                   System.out.println("Oyuncu vurdu");
                   canavar.setHealth(canavar.getHealth()-player.getTotalDamage());
                 AfterHit();
                  
                   if(canavar.getHealth()>0)
                   {
                       System.out.println();
                       System.out.println(canavar.getName()+" vurdu");
                       player.SetHealthy(player.GetHealthy()+player.getInventory().getArmorDefence()-canavar.getDamage());
                      AfterHit();
                   }  
               }
                   else {
                       return false;
                   }
                   
                  
                   
           }
           
              
               if(canavar.getHealth() < player.GetHealthy())
               {
                   System.out.println("Tebrikler canavarı yendiniz.");
                   player.SetMoney(player.GetMoney()+canavar.getAward());
                   System.out.println("Yeni paranız :"+ player.GetMoney());
                   canavar.setHealth(defCnavarHealthy);//Canavarın canını tazeledik.
                   
               
           }
               else
               {
                   return false;
               }
               System.out.println("-------------------");
        }

        
        
        return true;
    }
    
    public void PlayerStats()
    {
       
         ;
        System.out.println("Oyuncu Bilgileri");
        System.out.println();
        System.out.println("Oyuncu gücü :"+player.getTotalDamage());
      
        if(player.getInventory().getWeaponDamage()>0)
        {
         System.out.println("Silah gücü: "+player.getInventory().getWeaponDamage());
         System.out.println("Oyuncu silahı :"+player.getInventory().getWeaponName());
        }
         if(player.getInventory().getArmorDefence()>0)
        {
            System.out.println("Oyuncu zırhı:"+player.getInventory().getArmorName());
         
        }
          System.out.println("Oyuncunun Canı :"+player.GetHealthy());
          System.out.println();
       
        
    }
    public void EnemyStats()
    {
        
         System.out.println("-----------------------------------");
        System.out.println(canavar.getName()+" Bilgileleri");
        System.out.println("");
       
        System.out.println("Canavar Ödülü :"+canavar.getAward());
        System.out.println("Canavarın hasarı :"+canavar.getDamage());
        System.out.println("Canavarın canı :"+canavar.getHealth());
        System.out.println();
        
    }
    public void AfterHit()//Vuruştan Sonra Can
    {
        
       
        System.out.println("Oyuncu Canı :"+player.GetHealthy());
         System.out.println(canavar.getName() +" canı :"+ canavar.getHealth());
         
        System.out.println("-----------------------------------------");
        
       
    }
    
}
