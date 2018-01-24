package hanze.project.logic;

import hanze.project.view.AbstractView;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractModel {
    // List of views that are linked to the logic
    private List<AbstractView> views;

    /**
     * Constructor for AbstractModel that creates a list with views that belong to the logic that is created.
     */
    public AbstractModel() {
        this.views = new ArrayList<AbstractView>();
    }

    /**
     * Method to add a view to the logic
     *
     * @param view AbstractView that belongs to the logic.
     */
    public void addView(AbstractView view) {
        this.views.add(view);
    }

    /**
     * Method to notify the views that belong to this logic that
     * an update is required because a change has been done.
     */
    public void notifyViews(){
        for (AbstractView view : this.views) {
            view.updateView();
        }
    }
}
