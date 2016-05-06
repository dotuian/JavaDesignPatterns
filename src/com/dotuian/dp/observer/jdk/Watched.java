package com.dotuian.dp.observer.jdk;

import java.util.Observable;

public class Watched extends Observable {

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if ((this.data == null && data != null) || !this.data.equals(data)) {
            this.data = data;
            this.setChanged();
        }

        this.notifyObservers(this);
    }

}
