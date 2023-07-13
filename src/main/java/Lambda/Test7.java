package main.java.Lambda;

public class Test7 {
    static void def(I i){
        System.out.println(i.abc("hello"));
    }

    public static void main(String[] args) {
        def((String str22)-> {return str22.length();});
    }
}

interface  I{
    int abc(String s);
}
