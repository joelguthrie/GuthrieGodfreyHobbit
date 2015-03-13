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
public class Dragon implements Serializable{
    private Float LifePoints;
    private String MathRiddles;

    private DragonLocation dragonlocation;

    public DragonLocation getDragonlocation() {
        return dragonlocation;
    }

    public void setDragonlocation(DragonLocation dragonlocation) {
        this.dragonlocation = dragonlocation;
    }
    
    public Dragon() {
    }

    
    
    public Float getLifePoints() {
        return LifePoints;
    }

    public void setLifePoints(Float LifePoints) {
        this.LifePoints = LifePoints;
    }

    public String getMathRiddles() {
        return MathRiddles;
    }

    public void setMathRiddles(String MathRiddles) {
        this.MathRiddles = MathRiddles;
    }

    @Override
    public String toString() {
        return "Dragon{" + "LifePoints=" + LifePoints + ", MathRiddles=" + MathRiddles + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.LifePoints);
        hash = 97 * hash + Objects.hashCode(this.MathRiddles);
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
        final Dragon other = (Dragon) obj;
        if (!Objects.equals(this.LifePoints, other.LifePoints)) {
            return false;
        }
        if (!Objects.equals(this.MathRiddles, other.MathRiddles)) {
            return false;
        }
        return true;
    }
    
}
