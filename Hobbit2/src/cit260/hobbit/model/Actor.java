
package cit260.hobbit.model;

import java.awt.Point;

/**
 *
 * @author joel
 */
public enum Actor implements Serializable{
 
    hobbit("The player who comes from hobbiton to destroy things"),
    Smaug("Evil dragon who destroy more things"),
    Salesman("Really, you don't know?"),
    Goldpouch("holds more gold"),
    ExperienceMedallion("holds Experience points"),
    Gold("gold"),
    Sword("duh"),
    Shield("blocks stuff");
    
       private final String description;
       private final Point coordinates; 
       
       
       private Location[] location;
       private Game[] game;

    public Location[] getLocation() {
        return location;
    }

    public void setLocation(Location[] location) {
        this.location = location;
    }

    public Game[] getGame() {
        return game;
    }

    public void setGame(Game[] game) {
        this.game = game;
    }
       
    Actor (String description){
        this.description = description;
        coordinates = new Point(1,1);    }
    

    public String getDescription() {
        return description;}

    public Point getCoordinates() {
        return coordinates;   }

}
