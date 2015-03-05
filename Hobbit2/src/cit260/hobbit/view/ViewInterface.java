/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.hobbit.view;

/**
 *
 * @author Bryant
 */
public interface ViewInterface {

    public void display();
    public String getInput();
    public boolean doAction(Object obj);
}
