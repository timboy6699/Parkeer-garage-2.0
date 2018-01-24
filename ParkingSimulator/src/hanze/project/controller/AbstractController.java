package hanze.project.controller;

import hanze.project.logic.AbstractModel;

import javax.swing.*;

public abstract class AbstractController extends JPanel {

    // A controller should have a certain instance of the AbstractModel
    protected AbstractModel model;

    /**
     * Constructor of AbstractController with a logic belong to this controller
     * @param model AbstractModel that belongs to this controller
     */
    public AbstractController(AbstractModel model) {
        this.model = model;
    }
}
