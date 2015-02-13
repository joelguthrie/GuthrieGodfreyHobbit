/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.hobbit.control;

/**
 *
 * @author joel
 */
public class InventoryControl {
   
    public double ChangeExperience(double ExperienceValue, double CurrentExperience){
        
        double TotalExperience;
        
	if(ExperienceValue < 0)
            return CurrentExperience;
        if (ExperienceValue > 10)
            return CurrentExperience;
        
	TotalExperience = CurrentExperience + ExperienceValue;
        
    return TotalExperience;


        }
    }


