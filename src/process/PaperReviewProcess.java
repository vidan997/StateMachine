/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package process;

import form.panelState;
import form.PanelButton;
import form.frmMain;
import form.pnlCurrentState;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Paper;
import state.AcceptedState;
import state.CancelState;
import state.RejectState;
import state.ReviewState;
import state.WritingState;

/**
 *
 * @author student1
 */
public class PaperReviewProcess {

    private final Paper paper;
    frmMain frmMain;
    javax.swing.JButton btnoption1;
    javax.swing.JButton btnoption2;
    javax.swing.JButton btnoption3;
    javax.swing.JButton btnoption4;
    boolean options = false;

    public PaperReviewProcess() {
        frmMain = new frmMain();
        paper = new Paper();
        connect();
        defaultOptions();
        frmMain.getCurrentStatePanel().setCurrentState(paper.getCurrentState());
        frmMain.pack();
        frmMain.setVisible(true);

    }

    public void connect() {
        btnoption1 = frmMain.getPanelButton().getOption1Btn();
        btnoption2 = frmMain.getPanelButton().getOption2Btn();
        btnoption3 = frmMain.getPanelButton().getOption3Btn();
        btnoption4 = frmMain.getPanelButton().getOption4Btn();
        btnoption1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                option1();
            }
        });
        btnoption2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                option2();
            }
        });
        btnoption3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                option3();
            }
        });
        btnoption4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                option4();
            }

        });
    }

    public void process() {
        frmMain.getPanelState().setCurrentState(paper.getCurrentState());
        frmMain.getPanelState().repaint();
        frmMain.getCurrentStatePanel().setCurrentState(paper.getCurrentState());
        defaultOptions();
    }

    public void option1() {
        if (!options) {
            if (paper.getCurrentState().equals(WritingState.getInstance())) {
                btnoption1.setText("I need to write more (dont change state)");
                btnoption2.setVisible(true);
                btnoption3.setVisible(true);
                btnoption2.setText("Send to review");
                btnoption3.setText("Cancel writing");
                options = true;
            }
            if (paper.getCurrentState().equals(ReviewState.getInstance())) {
                btnoption1.setText("Continue reviewing (dont change state)");
                btnoption2.setText("Accept paper.");
                btnoption3.setText("Reject paper.");
                btnoption4.setText("Return paper to further work.");
                btnoption2.setVisible(true);
                btnoption3.setVisible(true);
                btnoption4.setVisible(true);
                options = true;
            }
            if (paper.getCurrentState().equals(AcceptedState.getInstance()) || paper.getCurrentState().equals(CancelState.getInstance())
                    || paper.getCurrentState().equals(RejectState.getInstance())) {
                JOptionPane.showMessageDialog(frmMain, "This is final state.");
            }
        } else {
            defaultOptions();
        }
    }

    public void option2() {
        if (paper.getCurrentState().equals(WritingState.getInstance())) {
            paper.goToState(ReviewState.getInstance());
            process();
        } else if (paper.getCurrentState().equals(ReviewState.getInstance())) {
            paper.goToState(AcceptedState.getInstance());
            process();
        }
    }

    public void option3() {

        if (paper.getCurrentState().equals(WritingState.getInstance())) {
            paper.goToState(CancelState.getInstance());
            process();
        } else if (paper.getCurrentState().equals(ReviewState.getInstance())) {
            paper.goToState(RejectState.getInstance());
            process();
        }
    }

    public void option4() {
        if (paper.getCurrentState().equals(ReviewState.getInstance())) {
            paper.goToState(WritingState.getInstance());
            process();
        }
    }

    private void defaultOptions() {
        btnoption2.setVisible(false);
        btnoption3.setVisible(false);
        btnoption4.setVisible(false);
        btnoption1.setText("Do something with paper.");
        options = false;
    }
}
