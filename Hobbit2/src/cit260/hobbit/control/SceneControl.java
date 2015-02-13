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
public class SceneControl {
    public double ChangeLifePoints(double LifepointsLost, double CurrentLifePoints){
        
        double TotalLifePoints;
        
	if(CurrentLifePoints < 0)
            return -1;
        
	TotalLifePoints = CurrentLifePoints - LifepointsLost;
        
    return TotalLifePoints;
}
}