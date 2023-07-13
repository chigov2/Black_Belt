package main.java.Lambda;

public class Test7 {
    static void def(I i){
        System.out.println(i.abc("hello"));
    }

    public static void main(String[] args) {
        int i = 10;
        def((String str22)-> {
            System.out.println(i);
            return str22.length() + i;});
    }
}

interface  I{
    int abc(String s);
}
