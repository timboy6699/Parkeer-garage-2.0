package hanze.project.view;

import hanze.project.main.ParkingSimulator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIView {
    private JButton startSimulator;
    private JButton stopSimulator;
    private JPanel panelMain;

    public GUIView() {
        startSimulator.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ParkingSimulator();
            }
        });
        stopSimulator.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        frame.setContentPane(new GUIView().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(200, 200);
        frame.setResizable(false);
        frame.setLayout(null);
    }
}
