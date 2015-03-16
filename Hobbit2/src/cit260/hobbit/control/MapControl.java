/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.hobbit.control;

import cit260.hobbit.model.Map;
import javafx.scene.Scene;

/**
 *
 * @author joel
 */
public class MapControl {

  static Map createMap() {
    Map map = new Map( 20,20);
    
    Scene[] scenes = createScenes();
    
    GameControl.assignScenesToLocations(map, scenes);
      return null;
    
    
    }

    static void moveActorsToStartingLocation(Map map) {
  System.out.println("\n **** move actors function stub ******");      }


    }
    

