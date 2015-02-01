/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.hobbit.model;

/**
 *
 * @author Bryant
 */
public class Location implements Serializable{
  
    //class instance variables 
    private boolean coordinates;

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
