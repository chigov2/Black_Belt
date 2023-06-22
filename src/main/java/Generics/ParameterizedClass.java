package main.java.Generics;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<String> test= new Info<>("test1");
        System.out.println(test);
    }
}

class Info<T>{
    private T value;
    //constructor
    public Info(T value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "(["+value+"])";
    }
}
