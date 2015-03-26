/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.hobbit.model;

import hobbit2.Hobbit2;

/**
 *
 * @author Bryant
 */
public class Map implements Serializable{
 
    //class instance variables
    private float rowCount;
    private float columnCount;
    private boolean instanceLocations;

    private Game[] game;
    private Location[][] locations;
    private int noOfRows;
    private int noOfColumns;
   
    public Game[] getGame() {
        return game;
    }

    public void setGame(Game[] game) {
        this.game = game;
    }
    
    public Map() {
    }
    
    public Map(int noOfRows, int noOfColumns){
        if (noOfRows < 1 || noOfColumns < 1) {
            System.out.println("The number of rows and columns must not be less than 0");
             }
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        this.locations = new Location[noOfRows][noOfColumns];
        
        
        for(int row = 0; row < noOfRows; row++){
            for(int Column = 0; Column < noOfColumns; Column++){
                Location location = new Location();
                location.setColumn(Column);
                location.setRow(row);
                location.setVisited(false);
                
                locations[row][Column] = location;
                
                
            }
        }
        
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

    public Location[][] getLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            public enum Scene{
            Start,
            Finish,
            skills,
            supplies,
            dragon;

        private void setMapSymbol(String _st_) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setBlocked(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setTravelTime(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private Scene setDescription(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        }
    private static Scene[] createScenes() throws MapControlException{
  
        Game game = Hobbit2.getCurrentGame();
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = null;
        startingScene = 
        startingScene.setDescription(
         ""
        +                  "\n****************************************************"
        +                  "\n                                                   *"
        +                  "\n                     Welcome                       *"
        +                  "\n In order to complete your quest it will be        *"
        +                  "\n necessay to explore this vast world. By traveling *"
        +                  "\n to different location on the map, you will go     *"
        +                  "\n around gathering the necessary resources to defeat*"
        +                  "\n your foes.                                        *"
        +                  "\n                                                   *"
        +                  "\n Please select your map to continue your quest     *"
        +                  "\n M - Map //needs to be created                     *"
        +                  "\n****************************************************");
  
        startingScene.setMapSymbol(" ST ");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.Start.ordinal()] = startingScene;
        
        Scene finishingScene = null;
        finishingScene.setDescription(
         "So here we are at the end of our adventure. To the end we must go but is it the end, or merely a beginning?");
        finishingScene.setMapSymbol(" ST ");
        finishingScene.setBlocked(false);
        finishingScene.setTravelTime(240);
        scenes[SceneType.Finish.ordinal()] = finishingScene;
        return null;
        
        
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes){
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.Start.ordinal()]);
        locations[9][9].setScene(scenes[SceneType.Finish.ordinal()]);
    }
    
}
