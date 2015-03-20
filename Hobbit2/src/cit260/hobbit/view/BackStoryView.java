/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.hobbit.view;
import cit260.hobbit.view.StartProgramView;

/**
 *
 * @author Bryant
 */

     
     public class BackStoryView extends View {
    
      public BackStoryView(){
      super ( "\n"
        +                  "\n****************************************************"
        +                  "\n                                                   *"
        +                  "\n             Welcome "+ playersName + "            *"
        +                  "\n In order to complete your quest it will be        *"
        +                  "\n necessay to explore this vast world. By traveling *"
        +                  "\n to different location on the map, you will go     *"
        +                  "\n around gathering the necessary resources to defeat*"
        +                  "\n your foes.                                        *"
        +                  "\n                                                   *"
        +                  "\n Please select your map to continue your quest     *"
        +                  "\n M - Map //needs to be created                     *"
        +                  "\n****************************************************");
  }
      
    @Override
    public boolean doAction(Object obj) {
    char value = (char) obj;
    
    value = Character.toUpperCase(value);
        switch (value){
           case 'M':
                
                break;
            
            default:
                System.out.println("\n **** Invalid Choice. Choose another ******");
                break;
        }
        return false;
        
    
    
}
     }
