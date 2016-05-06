package com.dotuian.dp.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    protected String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * 
     * @param observer
     */
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    /**
     * 
     * @param observer
     */
    public void detach(Observer observer) {
        this.observers.remove(observer);
    }
    
    public void nodifyObservers() {
        for(Observer o : this.observers) {
            o.update(this);
        }
    }

}
