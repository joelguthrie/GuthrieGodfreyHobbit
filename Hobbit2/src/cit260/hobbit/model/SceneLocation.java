/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.hobbit.model;

import java.util.Objects;

/**
 *
 * @author Sir Guthrie el Nobel
 */
public class SceneLocation implements Serializable{
    private String Visited;
    private String LocationsRemaining;

    public SceneLocation() {
    }

    
    
    public String getVisited() {
        return Visited;
    }

    public void setVisited(String Visited) {
        this.Visited = Visited;
    }

    public String getLocationsRemaining() {
        return LocationsRemaining;
    }

    public void setLocationsRemaining(String LocationsRemaining) {
        this.LocationsRemaining = LocationsRemaining;
    }

    @Override
    public String toString() {
        return "SceneLocation{" + "Visited=" + Visited + ", LocationsRemaining=" + LocationsRemaining + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.Visited);
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
        final SceneLocation other = (SceneLocation) obj;
        if (!Objects.equals(this.Visited, other.Visited)) {
            return false;
        }
        if (!Objects.equals(this.LocationsRemaining, other.LocationsRemaining)) {
            return false;
        }
        return true;
    }
    
    
}
