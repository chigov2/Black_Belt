package main.java.NestedClasses.InnerClasses;

public class Car {
    String color;
    private int doorCount;
    Motor engine;
    static int numberOfCars;

//    public Car(String color, int doorCount, int horsePower) {
    public Car(String color, int doorCount) {
        Motor motor = new Motor(333);
        System.out.println("Car constructor: "+motor.horsePower);
        System.out.println("Car constructor");
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Motor(horsePower);
    }

    public void setEngine(Motor engine) {
        System.out.println("setEngine: "+doorCount);
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

   class Motor {
        private int horsePower;

        public Motor(int horsePower) {
            this.horsePower = horsePower;

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
        Car car = new Car("Black",4);
        //должны создать мотор
        Car.Motor motor = car.new Motor(325);
        car.setEngine(motor);
        System.out.println(motor);
        System.out.println(car);

        Car.Motor motor2 = new Car("white",5).new Motor(568);
        System.out.println(motor2);
    }
}


