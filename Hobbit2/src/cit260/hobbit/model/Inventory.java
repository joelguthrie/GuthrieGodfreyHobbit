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
public class Inventory implements Serializable{
    
    //class instance variables 
    private boolean inventoryType;
    private float quantityinStock;
    private float requiredAmount;
        
    public enum Item{
            goldpouch,
            ExperienceMedallion,
            Gold,
            Sword,
            Shield;
        }
    
    private Game game;

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
    
    public Inventory() {
    }
    
    

    public boolean isInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(boolean inventoryType) {
        this.inventoryType = inventoryType;
    }

    public float getQuantityinStock() {
        return quantityinStock;
    }

    public void setQuantityinStock(float quantityinStock) {
        this.quantityinStock = quantityinStock;
    }

    public float getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(float requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    @Override
    public String toString() {
        return "Inventory{" + "inventoryType=" + inventoryType + ", quantityinStock=" + quantityinStock + ", requiredAmount=" + requiredAmount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.inventoryType ? 1 : 0);
        hash = 67 * hash + Float.floatToIntBits(this.quantityinStock);
        hash = 67 * hash + Float.floatToIntBits(this.requiredAmount);
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
        final Inventory other = (Inventory) obj;
        if (this.inventoryType != other.inventoryType) {
            return false;
        }
        if (Float.floatToIntBits(this.quantityinStock) != Float.floatToIntBits(other.quantityinStock)) {
            return false;
        }
        if (Float.floatToIntBits(this.requiredAmount) != Float.floatToIntBits(other.requiredAmount)) {
            return false;
        }
        return true;
    }
    
    
    
}
