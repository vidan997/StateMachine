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
public abstract class State {

    public void doSomething(Paper paper) {
        printCurrentState();
    }

    private void printCurrentState() {
        System.out.println("====================================================");
        System.out.println("State: " + this);
        System.out.println("====================================================");
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final State other = (State) obj;
        if(this.toString().equals(other.toString())) return true;
        return false;
    }
    
}
