package com.behavioraldesignpatterns.strategy;

public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.performStrategy(10,10));

        context = new Context(new OperationMultiply());
        System.out.println(context.performStrategy(10,10));

        context = new Context(new OperationSubstract());
        System.out.println(context.performStrategy(10,10));
    }

}
