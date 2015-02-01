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
public class DragonLocation implements Serializable{
    private Boolean Requirements;
    private float DragonAttack;
    private float HobbitAttack;
    private Float TotalPoints;

    public DragonLocation() {
    }

    
    
    public Boolean getRequirements() {
        return Requirements;
    }

    public void setRequirements(Boolean Requirements) {
        this.Requirements = Requirements;
    }

    public float getDragonAttack() {
        return DragonAttack;
    }

    public void setDragonAttack(float DragonAttack) {
        this.DragonAttack = DragonAttack;
    }

    public float getHobbitAttack() {
        return HobbitAttack;
    }

    public void setHobbitAttack(float HobbitAttack) {
        this.HobbitAttack = HobbitAttack;
    }

    public Float getTotalPoints() {
        return TotalPoints;
    }

    public void setTotalPoints(Float TotalPoints) {
        this.TotalPoints = TotalPoints;
    }

    @Override
    public String toString() {
        return "DragonLocation{" + "Requirements=" + Requirements + ", DragonAttack=" + DragonAttack + ", HobbitAttack=" + HobbitAttack + ", TotalPoints=" + TotalPoints + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.Requirements);
        hash = 59 * hash + Float.floatToIntBits(this.DragonAttack);
        hash = 59 * hash + Float.floatToIntBits(this.HobbitAttack);
        hash = 59 * hash + Objects.hashCode(this.TotalPoints);
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
        final DragonLocation other = (DragonLocation) obj;
        if (!Objects.equals(this.Requirements, other.Requirements)) {
            return false;
        }
        if (Float.floatToIntBits(this.DragonAttack) != Float.floatToIntBits(other.DragonAttack)) {
            return false;
        }
        if (Float.floatToIntBits(this.HobbitAttack) != Float.floatToIntBits(other.HobbitAttack)) {
            return false;
        }
        if (!Objects.equals(this.TotalPoints, other.TotalPoints)) {
            return false;
        }
        return true;
    }
    
    
}
