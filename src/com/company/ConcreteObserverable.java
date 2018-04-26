package com.company;

import java.util.Observable;

public class ConcreteObserverable extends Observable {
    private String text;
    public void setInformation(String text) {
        this.text = text;
        setChanged();
        notifyObservers();
    }

    public String getText() {
        return text;
    }
}
