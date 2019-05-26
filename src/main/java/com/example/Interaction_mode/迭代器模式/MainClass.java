package com.example.Interaction_mode.迭代器模式;

public class MainClass {

    public static void main(String[] args) {
        ConcreteMyAggregate c = new ConcreteMyAggregate();
        c.addObject("aa");
        c.addObject("bb");
        c.addObject("cc");

        MyIterator iter = c.createIterator();
        while (iter.hasNext()) {
            System.out.println(iter.getCurrentObj());
            iter.next();
        }
    }
}
