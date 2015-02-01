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
public class Items implements Serializable{
    
    private boolean Value;

    public Items() {
    }
    
    

    public boolean isValue() {
        return Value;
    }

    public void setValue(boolean Value) {
        this.Value = Value;
        
        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (this.Value ? 1 : 0);
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
        final Items other = (Items) obj;
        if (this.Value != other.Value) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Items{" + "Value=" + Value + '}';
    }
    
    
}
