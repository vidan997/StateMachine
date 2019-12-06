/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JFrame;
import process.PaperReviewProcess;

/**
 *
 * @author student1
 */
public class Main {

    public static void main(String[] args) {
        
        PaperReviewProcess paperReviewProcess = new PaperReviewProcess();
        paperReviewProcess.process();
    }
}
