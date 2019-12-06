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
public class AcceptedState extends State {

    private static AcceptedState instance;

    public static AcceptedState getInstance() {
        if(instance == null)
            instance = new AcceptedState();
        return instance;
    }
    
    
    
    @Override
    public String toString() {
        return "Accepted state"; //To change body of generated methods, choose Tools | Templates.

    }
}
