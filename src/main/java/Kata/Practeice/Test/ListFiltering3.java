package main.java.Kata.Practeice.Test;

import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering3 {
    public static void main(String[] args) {

    }

    public static List<Object> filterList(List<Object> list) {
        List<Object> collect = list.stream().filter(f -> f instanceof Integer).collect(Collectors.toList());

        return  collect;
    }
    }

