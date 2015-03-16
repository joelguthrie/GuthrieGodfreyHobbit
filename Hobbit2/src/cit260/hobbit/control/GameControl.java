/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.hobbit.control;


import cit260.hobbit.model.Game;
import cit260.hobbit.model.InventoryItem;
import cit260.hobbit.model.InventoryItem.Item;
import cit260.hobbit.model.Location;
import cit260.hobbit.model.Map;
import cit260.hobbit.model.Player;
import hobbit2.Hobbit2;

/**
 *
 * @author joel
 */
public class GameControl {

    public static void createNewGame(Player player) {
        Game game = new Game();
        Hobbit2.setCurrentGame(game);
        
        game.setPlayer(player);
        
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveActorsToStartingLocation(map);
        
    }

    public static InventoryItem[] createInventoryList() {
       
          
       
        
        InventoryItem[] inventory = 
                  new InventoryItem[InventoryItem.5];

        
          InventoryItem goldpouch = new InventoryItem();
          goldpouch.setDescription("GoldPouch");
          goldpouch.setQuantityinStock(0);
          goldpouch.setRequiredAmount(0);
          inventory[Item.goldpouch.ordinal()] = goldpouch;
          
          InventoryItem ExperienceMedallion = new InventoryItem();
          ExperienceMedallion.setDescription("ExperienceMedallion");
          ExperienceMedallion.setQuantityinStock(0);
          ExperienceMedallion.setRequiredAmount(0);
          inventory[Item.ExperienceMedallion.ordinal()] = ExperienceMedallion;
          
          InventoryItem Gold = new InventoryItem();
          Gold.setDescription("Gold");
          Gold.setQuantityinStock(0);
          Gold.setRequiredAmount(0);
          inventory[Item.Gold.ordinal()] = Gold;
          
          InventoryItem Sword = new InventoryItem();
          Sword.setDescription("Sword");
          Sword.setQuantityinStock(0);
          Sword.setRequiredAmount(0);
          inventory[Item.Sword.ordinal()] = Sword;
          
          InventoryItem Shield = new InventoryItem();
          Shield.setDescription("Shield");
          Shield.setQuantityinStock(0);
          Shield.setRequiredAmount(0);
          inventory[Item.Shield.ordinal()] = Shield;
          
        return inventory;

}
            
        public static InventoryItem[] getSortedInventoryList(){
           InventoryItem[] originalInventoryList =
                   Hobbit2.getCurrentGame().getInventory();
           
           InventoryItem[] inventoryList = originalInventoryList.clone();
           
           for (int i = 0;i < inventoryList.length-1; i++){
               for (int j = 0; j < inventoryList.length-1-i; j++ ){
                   if (inventoryList[j].getDescription().compareToIgnoreCase(inventoryList[j+1].getDescription()) > 0)
                   {
                       InventoryItem tempInventoryItem = inventoryList[j];
                       inventoryList[j] = inventoryList[j+1];
                       inventoryList[j+1] = tempInventoryItem;
                       
                   }
               }
           }
           
            return inventoryList;
 
        }
            private static void assignScenesToLocations(Map map, Map.Scene[] scenes){
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.Start.ordinal()]);
        locations[9][9].setScene(scenes[SceneType.Finish.ordinal()]);
    }
}

