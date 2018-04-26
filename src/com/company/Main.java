package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ConcreteObserverable mObserverable = new ConcreteObserverable();
        ConcreteObserver mObserver = new ConcreteObserver();
        mObserverable.addObserver(mObserver);
        mObserverable.setInformation("66666");
    }
}
