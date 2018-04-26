package com.company;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer{
    private String text ;

    // 拉模型，传入进来的是被观察者的实例
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof ConcreteObserverable) {
            ConcreteObserverable mObserverable = (ConcreteObserverable) o;
            text = mObserverable.getText();
            System.out.println("text = " + text);
        }
    }
}
