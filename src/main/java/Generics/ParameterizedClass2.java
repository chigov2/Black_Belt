package main.java.Generics;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair1<String,Integer> pair1 = new Pair1<>("String value1",5);
        System.out.println("parameters of pair1: "+ pair1.getFirstValue()+ " and " +pair1.getSecondValue());
    Pair1<Integer,Double> pair2 = new Pair1<>(5,3.2);
        System.out.println("parameters of pair2: "+ pair2.getFirstValue()+ " and " +pair2.getSecondValue());

        System.out.println("----------");
        Pair2<String> pair22 = new Pair2<>("first","Second");
        System.out.println(pair22.getFirstValue() +" " + pair22.getSecondValue());
    }
}

class Pair1<V1,V2>{
    private V1 value1;
    private V2 value2;

    public Pair1(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue(){
        return value1;
    }
    public V2 getSecondValue(){
        return value2;
    }
}
class Pair2<V>{
    private V value1;
    private V value2;

    public Pair2(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V abc(V value){//<V>  здесь не надо
        return value;
    }

    public V getFirstValue(){
        return value1;
    }
    public V getSecondValue(){
        return value2;
    }
}
