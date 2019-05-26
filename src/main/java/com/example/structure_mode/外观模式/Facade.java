package com.example.structure_mode.外观模式;

/**
 * 外观模式，很常见
 */
public class Facade {
    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;

    public Facade(){
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void MethodA(){
        System.out.println("方法组A()");
        one.MethodOne();
        two.MethodTwo();
        four.MethodFour();
    }

    public void MethodB(){
        System.out.println("方法组B()");
        two.MethodTwo();
        three.MethodThree();
    }
}


class SubSystemOne{
    public void MethodOne(){
        System.out.println("子系统方法一");
    }
}
class SubSystemTwo{
    public void MethodTwo(){
        System.out.println("子系统方法二");
    }
}
class SubSystemThree{
    public void MethodThree(){
        System.out.println("子系统方法三");
    }
}
class SubSystemFour{
    public void MethodFour(){
        System.out.println("子系统方法四");
    }
}