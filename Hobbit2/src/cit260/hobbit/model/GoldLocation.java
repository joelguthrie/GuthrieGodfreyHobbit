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
public class GoldLocation implements Serializable{
    private String MathLocation;
    private Float Gold;

    public GoldLocation() {
    }

    
    
    public String getMathLocation() {
        return MathLocation;
    }

    public void setMathLocation(String MathLocation) {
        this.MathLocation = MathLocation;
    }

    public Float getGold() {
        return Gold;
    }

    public void setGold(Float Gold) {
        this.Gold = Gold;
    }

    @Override
    public String toString() {
        return "GoldLocation{" + "MathLocation=" + MathLocation + ", Gold=" + Gold + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.MathLocation);
        hash = 71 * hash + Objects.hashCode(this.Gold);
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
        final GoldLocation other = (GoldLocation) obj;
        if (!Objects.equals(this.MathLocation, other.MathLocation)) {
            return false;
        }
        if (!Objects.equals(this.Gold, other.Gold)) {
            return false;
        }
        return true;
    }
    
    
}
