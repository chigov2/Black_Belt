package main.java.Generics;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<String> test= new Info<>("test");
        String s = test.getValue();
        System.out.println(s);

        System.out.println(test);
        Info<Integer> test1= new Info<>(5);
        Integer i = test1.getValue();
        System.out.println(test1);
        System.out.println(i);
    }
}

class Info<T>{
    private T value;
    //constructor
    public Info(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }
    @Override
    public String toString() {
        return "(["+value+"])";
    }


}
