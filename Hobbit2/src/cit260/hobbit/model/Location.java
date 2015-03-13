/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.hobbit.model;

import java.util.ArrayList;
import javafx.scene.Scene;

/**
 *
 * @author Bryant
 */
public class Location implements Serializable{
  
    //class instance variables 
    private boolean coordinates;
    
    private int row;
    private int Column;
    private boolean visited;
    private ArrayList<Actor> actors;
    private Scene scene;   
    
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return Column;
    }

    public void setColumn(int col) {
        this.Column = col;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    } 
 
    
    public Location() {
    }
    
    

    public boolean isCoordinates() {
        return coordinates;
    }

    public void setCoordinates(boolean coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "Location{" + "coordinates=" + coordinates + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (this.coordinates ? 1 : 0);
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
        final Location other = (Location) obj;
        if (this.coordinates != other.coordinates) {
            return false;
        }
        return true;
    }
    
    
    
    
}
