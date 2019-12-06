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
public class ReviewState extends State {

    private static ReviewState instance;

    public static ReviewState getInstance() {
        if(instance == null)
            instance = new ReviewState();
        return instance;
    }
    
    @Override
    public String toString() {
        return "Review state"; //To change body of generated methods, choose Tools | Templates.
    }
}