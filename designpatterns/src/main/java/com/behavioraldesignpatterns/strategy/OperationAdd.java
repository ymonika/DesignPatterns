package com.behavioraldesignpatterns.strategy;

public class OperationAdd implements Strategy {

    @Override
    public int doOperation(Integer a, Integer b) {
        return a+b;
    }
}
