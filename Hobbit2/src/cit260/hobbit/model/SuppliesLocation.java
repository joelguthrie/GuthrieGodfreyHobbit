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
public class SuppliesLocation implements Serializable{
    
    private String Items;
    private Float Gold;

    public SuppliesLocation() {
    }

    
    
    public String getItems() {
        return Items;
    }

    public void setItems(String Items) {
        this.Items = Items;
    }

    public Float getGold() {
        return Gold;
    }

    public void setGold(Float Gold) {
        this.Gold = Gold;
    }

    @Override
    public String toString() {
        return "SuppliesLocation{" + "Items=" + Items + ", Gold=" + Gold + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.Items);
        hash = 23 * hash + Objects.hashCode(this.Gold);
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
        final SuppliesLocation other = (SuppliesLocation) obj;
        if (!Objects.equals(this.Items, other.Items)) {
            return false;
        }
        if (!Objects.equals(this.Gold, other.Gold)) {
            return false;
        }
        return true;
    }
   
    
}
