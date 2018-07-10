package com.behavioraldesignpatterns.strategy;

public class OperationMultiply implements Strategy {

    @Override
    public int doOperation(Integer a, Integer b) {
        return a * b;
    }
}

