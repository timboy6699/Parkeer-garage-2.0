package hanze.project.main;

import hanze.project.logic.Simulator;

import javax.swing.*;

public class ParkingSimulator {

    private JFrame screen;
    private Simulator simulator;


    public ParkingSimulator(){
        simulator = new Simulator();

        screen = new JFrame("Parkeer Simulator");
        screen.setSize(540, 285);
        screen.setResizable(false);
        screen.setLayout(null);
        /**
         * Voor als we nieuwe controllers gaan toevoegen
         */
        //screen.getContentPane().add(fieldView);
        //screen.getContentPane().add(statView);
        //screen.getContentPane().add(runController);
        //screen.getContentPane().add(initController);
        //fieldView.setBounds(10, 10, 200, 200);
        //statView.setBounds(230, 10, 200, 200);
        //runController.setBounds(0, 210, 450, 50);
        //initController.setBounds(440, 10, 90, 130);
        screen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        screen.setVisible(true);
    }

}