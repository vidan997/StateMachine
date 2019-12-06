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
public class RejectState extends State {

    private static RejectState instance;

    public static RejectState getInstance() {
        if(instance == null)
            instance = new RejectState();
        return instance;
    }
    
    @Override
    public String toString() {
        return "Reject state"; //To change body of generated methods, choose Tools | Templates.
    }
}
