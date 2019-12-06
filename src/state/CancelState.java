/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import model.Paper;

/**
 *
 * @author student1
 */
public class CancelState extends State {

     private static CancelState instance;

    public static CancelState getInstance() {
        if(instance == null)
            instance = new CancelState();
        return instance;
    }
    
    
    @Override
    public String toString() {
        return "Cancel state"; //To change body of generated methods, choose Tools | Templates.
    }
}
