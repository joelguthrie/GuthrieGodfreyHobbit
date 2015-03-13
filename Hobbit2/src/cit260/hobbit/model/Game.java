/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.hobbit.model;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Bryant
 */
public class Game implements Serializable{
  
    //class instance variables
    private String totalTime;

    private Player player;

  
    ArrayList<Actor> actor;
    private Inventory inventory[];
    private Map map;
    
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

  public Inventory[] getInventory() {
        return inventory;
    }

    public void setInventory(Inventory[] inventory) {
        this.inventory = inventory;
    }

    public ArrayList<Actor> getActor() {
        return actor;
    }

    public void setActor(ArrayList<Actor> actor) {
        this.actor = actor;
    }
   
    public Game() {
    }

    
    
    public String getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.totalTime);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.totalTime, other.totalTime)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
