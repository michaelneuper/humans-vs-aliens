/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Alien;
import Model.Human;

/**
 *
 * @author Michael.Neuper
 */
public class Controller {

    public Controller() {
    }
    
    public void AttackHuman(Human inHuman, Alien inAlien){
        System.out.println("Alien is attacking the human");
        int myWholeNumber1 = (int)(Math.random()*10); 
        System.out.println(myWholeNumber1);
        //do what happens to the human when it is being attacked
        inHuman.setHealth(inHuman.getHealth() - 1);
        inAlien.setBolts(inAlien.getBolts() - 1); 
    }
    
    public void AttackAlien(Human inHuman, Alien inAlien){
        System.out.println("Human is attacking the alien");
        //do what happens to the human when it is being attacked
        inAlien.setHealth(inAlien.getHealth() - 1);
        inHuman.setRounds(inHuman.getRounds() - 1); 
    }
    
    public void RunHuman(Human inHuman, Alien inAlien){
        System.out.println("Human is running from the alien");
        //do what happens to the human when it is being attacked
        inHuman.setRounds(inHuman.getRounds() - 1);
        int myWholeNumber2 = (int)(Math.random()*10); 
        System.out.println(myWholeNumber2);
       
    }
    
    public void RunAlien(Human inHuman, Alien inAlien){
        System.out.println("Alien is runnning from the human");
    }
    
}
