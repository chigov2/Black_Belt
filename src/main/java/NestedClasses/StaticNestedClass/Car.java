package main.java.NestedClasses.StaticNestedClass;

import java.sql.SQLOutput;

public class Car {
    String color;
    int doorCount;
    Motor engine;
    static int numberOfCars;

    public Car(String color, int doorCount, Motor engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
        numberOfCars++;
    }

    static void  method(){
        System.out.println("method -----------");
        System.out.println(Motor.countsOfMotors);
        Motor motor = new Motor(350);
        System.out.println(Car.numberOfCars);
//        System.out.println(motor.horsePower);
        System.out.println(new Car("Blue",6,new Motor(500)));
    }
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

   static class Motor {
        private int horsePower;
        static int countsOfMotors;

        public Motor(int horsePower) {
            System.out.println(numberOfCars);
            this.horsePower = horsePower;
            countsOfMotors++;
        }

        @Override
        public String toString() {
            return "Motor: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test{
    public static void main(String[] args) {
        Car.Motor m = new Car.Motor(200);
        System.out.println(m);
        Car car = new Car("red",4,m);
        Car car1 = new Car("white",3, new Car.Motor(300));
        System.out.println(car);
        System.out.println(car1);
        System.out.println(Car.numberOfCars);
        Car.method();
    }
}

class Z extends Car.Motor{
    public Z(int horsePower) {
        super(horsePower);
    }
}
