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
public class SafeHouse extends NormalLoc {
  
      SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }
      @Override
    public boolean getLocation() {
        System.out.println();
        System.out.println();
        player.SetHealthy(player.GetrHealthy());
        System.out.println("Canınız yenilendi .");
        System.out.println("===Güvenli evdesiniz.===");
        System.out.println();
         System.out.println();
       return true;//Burada mı eğer ölürsek false çevireceğiz.
    }
    
}
