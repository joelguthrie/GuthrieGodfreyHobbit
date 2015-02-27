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
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of ChangeExperience method, of class InventoryControl.
     */
    @Test
    public void testChangeExperience() {
        System.out.println("ChangeExperience");

                      System.out.println("testcase1");
                //input values
        double ExperienceValue = 0.0;
        double CurrentExperience = 5.0;
        InventoryControl instance = new InventoryControl();
        // expected result
        double expResult = 5.0;
        double result = instance.ChangeExperience(ExperienceValue, CurrentExperience);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
        @Test
    public void testChangeExperience2() {
        System.out.println("ChangeExperience");

                      System.out.println("testcase2");
                //input values
        double ExperienceValue = 2.0;
        double CurrentExperience = 5.0;
        InventoryControl instance = new InventoryControl();
        // expected result
        double expResult = 7.0;
        double result = instance.ChangeExperience(ExperienceValue, CurrentExperience);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
        @Test
    public void testChangeExperience3() {
        System.out.println("ChangeExperience");

                      System.out.println("testcase3");
                //input values
        double ExperienceValue = 1.0;
        double CurrentExperience = 0.0;
        InventoryControl instance = new InventoryControl();
        // expected result
        double expResult = 1.0;
        double result = instance.ChangeExperience(ExperienceValue, CurrentExperience);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
