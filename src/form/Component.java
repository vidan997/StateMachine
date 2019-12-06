/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Color;
import java.awt.Graphics;
import state.State;

public class Component {
    
    private State state;
    private State currentState;
    private int x;
    private int y;
    
    public Component(State state, int x, int y, State currentState) {
        this.state = state;
        this.x = x;
        this.y = y;
        this.currentState = currentState;
    }
    
    public void initComponent(Graphics graph) {
        graph.setColor(Color.black);
        graph.drawOval(x, y, 100, 100);
        if (state.equals(currentState)) {
            graph.setColor(Color.GREEN);
        } else {
            graph.setColor(Color.WHITE);
        }
        graph.fillOval(x, y, 100, 100);
        graph.setColor(Color.black);
        graph.drawString(state.toString(), x + 15, y + 50);
    }
    
    public void setCurrentState(State state){
        this.currentState = state;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
}
