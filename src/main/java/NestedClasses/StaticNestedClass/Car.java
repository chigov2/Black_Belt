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
        System.out.println("Motor.countOfMotors: "+Motor.countsOfMotors);
        Motor motor = new Motor(350);
        System.out.println("new motor.horsePower: "+motor.horsePower);
        System.out.println("Car.numberOfCars: "+Car.numberOfCars);
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
            System.out.println("number of cars(Motor constructor: ) "+numberOfCars);
            this.horsePower = horsePower;
            countsOfMotors++;
        }

        @Override
        public String toString() {
            return "(toString)Motor: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test{
    public static void main(String[] args) {
        Car.Motor motor = new Car.Motor(200);
        System.out.println(motor);
        Car car = new Car("red",4,motor);
        Car car1 = new Car("white",3, new Car.Motor(300));
        System.out.println(car);
        System.out.println(car1);
        System.out.println("Car numberOfMotors: "+Car.numberOfCars);
        Car.method();
    }
}

class Z extends Car.Motor{
    public Z(int horsePower) {
        super(horsePower);
    }
}
