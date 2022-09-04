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

public class Game {
    Scanner input=new Scanner(System.in);
    
    
    Player player;
    Location location;
   
    
    public void log()
    {
        System.out.println("===Macera Oyununa Hoş Geldiniz===");
        System.out.print("Adınız :");
        String name=input.nextLine();
        player=new Player("a");
        player.SelectChar();//Player sınıfında
        start();
        
        
    }
    int num;
    public void start()
    {
        while(true)
        {
            System.out.println();
            System.out.println();
        System.out.println("===Mekanlar===");
         System.out.println("1-Güvenli Ev =>Canınız yenilenir.");
        System.out.println("2-Orman =>Karşınıza ayı çıkabilir.");
        System.out.println("3-Mağara =>Karşınıza vampir çıkabilir.");
        System.out.println("4-Nehir =>Karşınıza zombi çıkabilir.");
         System.out.println("5-Mağaza =>Zırh veya silah alabilirsiniz.");
       
        System.out.print("Hangi mekana gitmek istiyorsanız mekan numarasını tuşlayınız :");
         num=input.nextInt();
         System.out.println();
         System.out.println();
     while(num<0 || num>5)
     {
         System.out.print("Geçerli bir bölge giriniz: ");
           num=input.nextInt();
           
     }
     switch(num)
     {
         case 1:
            location =new SafeHouse(player);
             break;
         case 2:
            location =new Forest(player);
         break;
         case 3:
              location =new Magara(player);
           break;
         case 4:
             location =new River(player);
             break;
         case 5:
             location =new Store(player);
             break;
             
     }   
             
         if(num==1)
         {
             if(player.getInventory().isFirewood()&&player.getInventory().isFood()&&player.getInventory().isWater())
             {
                 System.out.println("!!!!!Tebrikler kazandınız!!!!!");
                 break;
             }
           
         }
         if(!location.getLocation())
      {
          System.out.println("Oyun Bitti ");
          break;
      }
           
       
           
         
 
     
      
    
        }
       
    }
   
   
}
