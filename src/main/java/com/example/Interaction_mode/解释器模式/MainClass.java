package com.example.Interaction_mode.解释器模式;

public class MainClass {

    public static void main(String[] args) {
        String num = "10";
        Context context = new Context().setInput(num);
        Expression plus = new PlusExpression();
        plus.interpret(context);
        System.out.println(context.getOutpout());
        plus.interpret(context);
        System.out.println(context.getOutpout());

        num = "20";
        context = new Context().setInput(num);
        plus = new MinusExpression();
        plus.interpret(context);
        System.out.println(context.getOutpout());

    }
}
