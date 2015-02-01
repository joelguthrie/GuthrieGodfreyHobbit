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
public class Map implements Serializable{
 
    //class instance variables
    private float rowCount;
    private float columnCount;
    private boolean instanceLocations;

    public Map() {
    }
    
    

    public float getRowCount() {
        return rowCount;
    }

    public void setRowCount(float rowCount) {
        this.rowCount = rowCount;
    }

    public float getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(float columnCount) {
        this.columnCount = columnCount;
    }

    public boolean isInstanceLocations() {
        return instanceLocations;
    }

    public void setInstanceLocations(boolean instanceLocations) {
        this.instanceLocations = instanceLocations;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + ", instanceLocations=" + instanceLocations + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Float.floatToIntBits(this.rowCount);
        hash = 53 * hash + Float.floatToIntBits(this.columnCount);
        hash = 53 * hash + (this.instanceLocations ? 1 : 0);
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
        final Map other = (Map) obj;
        if (Float.floatToIntBits(this.rowCount) != Float.floatToIntBits(other.rowCount)) {
            return false;
        }
        if (Float.floatToIntBits(this.columnCount) != Float.floatToIntBits(other.columnCount)) {
            return false;
        }
        if (this.instanceLocations != other.instanceLocations) {
            return false;
        }
        return true;
    }
    
    
    
}
