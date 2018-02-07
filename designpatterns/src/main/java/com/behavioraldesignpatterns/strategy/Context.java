package com.behavioraldesignpatterns.strategy;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int performStrategy(Integer a, Integer b) {
        return this.strategy.doOperation(a,b);
    }
}
