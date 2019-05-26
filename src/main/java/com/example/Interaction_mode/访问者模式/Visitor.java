package com.example.Interaction_mode.访问者模式;

/**
 * 访问者
 */
public interface Visitor {
    void visit(Park park);
    void visit(ParkA parkA);
    void visit(ParkB parkB);
}
