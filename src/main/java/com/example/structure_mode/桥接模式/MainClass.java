package com.example.structure_mode.桥接模式;

public class MainClass {
    public static void main(String[] args) {

        // 销售联想的笔记本电脑
        Computer2 c = new Laptop2(new Lenovo());
        c.sale();

        // 销售神舟的台式机
        Computer2 c2 = new Desktop2(new Shenzhou());
        c2.sale();

        // Dell 神舟的台式机
        Computer2 c3 = new Pad2(new Dell());
        c3.sale();
    }
}
