package hanze.project.view;

import hanze.project.logic.AbstractModel;

import javax.swing.*;

public abstract class AbstractView extends JPanel
{
    // all views have a certain logic
    protected AbstractModel model;

    /**
     * Constructor of AbstractView that expects a logic belonging to this view.
     *
     * @param model AbstractModel that belongs to this view.
     */
    public AbstractView(AbstractModel model) {
        this.model = model;
        model.addView(this);

        // we use absolute positioning so we can set the layout to null
        setLayout(null);
    }

    public void updateView() {
        repaint();
    }

}
