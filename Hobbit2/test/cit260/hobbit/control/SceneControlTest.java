/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.hobbit.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author joel
 */
public class SceneControlTest {
    
    public SceneControlTest() {
    }

    /**
     * Test of ChangeLifePoints method, of class SceneControl.
     */
    @Test
    public void testChangeLifePoints() {
        System.out.println("ChangeLifePoints");
        System.out.println("testcase1");
        double LifepointsLost = 0.0;
        double CurrentLifePoints = 10.0;
        SceneControl instance = new SceneControl();
        double expResult = 10.0;
        double result = instance.ChangeLifePoints(LifepointsLost, CurrentLifePoints);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
       public void testChangeLifePoints2() {
        System.out.println("ChangeLifePoints");
        System.out.println("testcase2");
        double LifepointsLost = 2.0;
        double CurrentLifePoints = 8.0;
        SceneControl instance = new SceneControl();
        double expResult = 6.0;
        double result = instance.ChangeLifePoints(LifepointsLost, CurrentLifePoints);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
       @Test
          public void testChangeLifePoints3() {
        System.out.println("ChangeLifePoints");
        System.out.println("testcase3");
        double LifepointsLost = 10.0;
        double CurrentLifePoints = 10.0;
        SceneControl instance = new SceneControl();
        double expResult = 0.0;
        double result = instance.ChangeLifePoints(LifepointsLost, CurrentLifePoints);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
}
