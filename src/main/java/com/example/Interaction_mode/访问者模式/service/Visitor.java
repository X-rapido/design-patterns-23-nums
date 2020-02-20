package com.example.Interaction_mode.访问者模式.service;

import com.example.Interaction_mode.访问者模式.service.impl.Park;
import com.example.Interaction_mode.访问者模式.service.impl.ParkA;
import com.example.Interaction_mode.访问者模式.service.impl.ParkB;

/**
 * 访问者
 */
public interface Visitor {
    void visit(Park park);
    void visit(ParkA parkA);
    void visit(ParkB parkB);
}
