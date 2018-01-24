package hanze.project.main;

import hanze.project.runner.Runner;

public class Main {

    public static void main(String[] args) { // Main Thread

        Runner runner = new Runner();   // Runner Thread
        runner.setDaemon(false); // Daemon (true) or User (false)
        runner.start();

    }

}