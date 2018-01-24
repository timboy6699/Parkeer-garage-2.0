package hanze.project.runner;

import hanze.project.model.Simulator;

public class Runner extends Thread {

    public void run(){

        Simulator simulator = new Simulator();
        simulator.run();

    }

}
