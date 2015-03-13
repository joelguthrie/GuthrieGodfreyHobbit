/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.hobbit.control;


import cit260.hobbit.model.Game;
import cit260.hobbit.model.Inventory;
import cit260.hobbit.model.Inventory.Item;
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
        
        Inventory[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveActorsToStartingLocation(map);
        
    }

    public static Inventory[] createInventoryList() {
          
       
        
        Inventory[] inventory = 
                  new Inventory[item.5];

        
          Inventory goldpouch = new Inventory();
          goldpouch.setDescription("GoldPouch");
          goldpouch.setQuantityinStock(0);
          goldpouch.setRequiredAmount(0);
          inventory[Item.goldpouch.ordinal()] = goldpouch;
          
          Inventory ExperienceMedallion = new Inventory();
          ExperienceMedallion.setDescription("ExperienceMedallion");
          ExperienceMedallion.setQuantityinStock(0);
          ExperienceMedallion.setRequiredAmount(0);
          inventory[Item.ExperienceMedallion.ordinal()] = ExperienceMedallion;
          
          Inventory Gold = new Inventory();
          Gold.setDescription("Gold");
          Gold.setQuantityinStock(0);
          Gold.setRequiredAmount(0);
          inventory[Item.Gold.ordinal()] = Gold;
          
          Inventory Sword = new Inventory();
          Sword.setDescription("Sword");
          Sword.setQuantityinStock(0);
          Sword.setRequiredAmount(0);
          inventory[Item.Sword.ordinal()] = Sword;
          
          Inventory Shield = new Inventory();
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
                       tempInventoryItem = inventoryList[j];
                       inventoryList[j] = inventoryList[j+1];
                       inventoryList[j+1] = tempInventoryItem;
                       
                   }
               }
           }
           
            return inventoryList;
        }
}

