package hanze.project.main;

import hanze.project.controller.AbstractController;
import hanze.project.model.Simulator;

import javax.swing.*;


public class ParkingSimulatorMain {

    private Simulator simulator;
    private JFrame screen;
    private AbstractController SimulatorController;

    public ParkingSimulatorMain(){
        Simulator simulator = new Simulator();
        simulator.run();
    }

}