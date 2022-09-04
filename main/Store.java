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
public class Store extends NormalLoc {
  Scanner input=new Scanner(System.in);
   
int secim,secim1;
    public Store(Player player) {
        super(player, "Mağaza");
    }
    
  
    
    @Override
    public boolean getLocation() {
       
       secim();
       return true;//Burada mı eğer ölürsek false çevireceğiz.
    }
    
    //Mağaza giriş
    public void secim()
    {
        while(secim1!=3)
        {
         System.out.println("===Mağazaya Hoş Geldiniz===");
         System.out.println("Paranız: "+player.GetMoney());
         System.out.println("1-Silah || 2-Zırh || 3-Çıkış");
          secim1=input.nextInt();
         switch(secim1)
         {
             case 1:
                 silah();
                 break;
             case 2:
                 zirh();
                 break;
             case 3:
                 System.out.println("===Mağazadan çıktınız===");
                 System.out.println();
                 System.out.println();
                 break;
         }
        }
         
         
    }
    
    //Silah alımı
    public void silah()
    {
        
       while(secim!=4)
       {
           int damage=0,price=0;//Siahın hasar ve para miktarı
           String wName=null;//Silahın adı
            System.out.println();
        System.out.println("===SİLAHLAR===");
            System.out.println("1-Bıçak || Hasar=>5  || Parası=>5");
            System.out.println("2-Tüfek || Hasar=>10 || Parası=>10");
            System.out.println("3-Kılıç || Hasar=>15 || Parası=>15");
            System.out.println("4-Çıkış");
            System.out.print("Seçiminiz :");
             secim=input.nextInt();
            
            
           switch(secim)
           {
               case 1:
                   damage=5;
                   price=5;
                   wName="Bıçak";
                   break;
               case 2:
                   damage=10;
                   price=10;
                   wName="Tüfek";
                   break;
               case 3:
                   damage=15;
                   price=15;
                   wName="Kılıç";
                   break;
               case 4:
                   System.out.println("==Çıkış yaptınız==");
                   break;
               default:
                   System.out.println("Geçersiz İşlem");
                  
             }
           if(player.GetMoney()>=price && secim!=4)
           {
           player.getInventory().setWeaponDamage(damage);
           player.getInventory().setWeaponName(wName);
           player.SetMoney(player.GetMoney()-price);
               System.out.println("Almış olduğunuz silah :"+player.getInventory().getWeaponName()+ "|| Yeni hasar verme gücünüz: "+player.getTotalDamage()+"|| Kalan paranız "
         + ": "+player.GetMoney() +"silahın gücü :"+ player.getInventory().getWeaponDamage());
                 
           }
           else if(player.GetMoney()<price)
           {
               System.out.println("Paranız yetersiz..");
           }
          
 
                          
                  
                   
                   
                  
           
        
       }
       
        
        
       
    }
    public void zirh()
    {
        while(secim!=4)
        {
          int aDefence=0,price=0;//Siahın hasar ve para miktarı
           String aName=null;//Silahın adı
            System.out.println();
        System.out.println("===ZIRHLAR===");
            System.out.println("1-Hafif || Koruma=>5  || Parası=>5");
            System.out.println("2-Orta || Koruma=>10 || Parası=>10");
            System.out.println("3-Ağır || Koruma=>15 || Parası=>15");
            System.out.println("4-Çıkış");
            System.out.print("Seçiminiz :");
             secim=input.nextInt();
             
            
           switch(secim)
           {
               case 1:
                   aDefence=5;
                   price=5;
                   aName="Hafif zırh";
                   break;
               case 2:
                   aDefence=10;
                   price=10;
                   aName="Orta zırh";
                   break;
               case 3:
                   aDefence=15;
                   price=15;
                   aName="Ağır zırh";
                   break;
               case 4:
                   System.out.println("==Çıkış yaptınız==");
                   break;
               default:
                   System.out.println("Geçersiz İşlem");
                   break;
                           
             }
           if(player.GetMoney()>=price && secim!=4)
           {
           player.getInventory().setArmorDefence(aDefence);
           player.getInventory().setArmorName(aName);
           player.SetMoney(player.GetMoney()-price);
          System.out.println("Almış olduğunuz zırh :"+player.getInventory().getArmorName()+ "|| Engellenen hasar: " + player.getInventory().getArmorDefence()+"|| Kalan paranız "
         + ": "+player.GetMoney() );
                 
           }
           else if(player.GetMoney()<price )
           {
               System.out.println("Paranız yetersiz..");
           }
          
          
 
            
        }
       
    }
    
   
}
