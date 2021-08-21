/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Michael.Neuper
 */
public class Human {
    
    private String name;
    private int rounds;
    private int health;

    public Human() {
    }

    public Human(String name, int rounds, int health) {
        this.name = name;
        this.rounds = rounds;
        this.health = health;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
    
    
}
