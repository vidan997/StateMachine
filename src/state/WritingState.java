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
public class WritingState extends State {

    private static WritingState instance;

    public static WritingState getInstance() {
        if(instance == null)
            instance = new WritingState();
        return instance;
    }
    
    
    
    @Override
    public String toString() {
        return "Writing state"; //To change body of generated methods, choose Tools | Templates.
    }

    

}
