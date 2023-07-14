package main.java.Lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierEx1 {
//    метод будет создавать три машины, помещать все это в аррайлист
//    и возвращать этот лист нам.
//    а какие машины он будет создавать - мы будем прописывать в лямбда выражении
//    когда будем вызывать этот метод из main
    public static ArrayList<Car> getThreeCars(Supplier<Car> carSupplier){
        ArrayList<Car> carArrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            carArrayList.add(carSupplier.get());
        }
        return carArrayList;
    }

//  метод будет получать объект и менять его. как менять - будет записано м main
    public static void changeCar(Car car, Consumer<Car> carConsumer){
        carConsumer.accept(car);
    }

/////// main///////////////////
    public static void main(String[] args) {
        ArrayList<Car> cars = getThreeCars(()-> new Car("White","Nissan",1.6));
        System.out.println(cars);
        System.out.println("----------------");

        changeCar(cars.get(0),car -> {
            car.color = "Red";
            car.engine = 2d;
            System.out.println("Consume-----");
            System.out.println("Upgraded car0" + car);
        });
        System.out.println(cars);
    }
}

class Car {
    String color;
    String model;
    Double engine;

    public Car(String color, String model, Double engine) {
        this.color = color;
        this.model = model;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car {" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
