package com.example.structure_mode.装饰模式;

public class MainClass {

    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        System.out.println("\n增加新的功能，飞行----------");
        FlyCar flycar = new FlyCar(car);
        flycar.move();

        System.out.println("\n增加新的功能，水里游---------");
        WaterCar waterCar = new WaterCar(car);
        waterCar.move();

        System.out.println("\n增加两个新的功能，飞行，水里游-------");
        WaterCar waterCar2 = new WaterCar(new FlyCar(car));
        waterCar2.move();

        // IO装饰模式示例
//		Reader r = new BufferedReader(new InputStreamReader(new FileInputStream(new File("d:/a.txt"))));
    }
}
