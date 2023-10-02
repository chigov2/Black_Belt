package main.java.Kata.Practeice.Test.Level8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListFiltering2 {

    public static void main(String[] args) {
//        List<Object> list = Arrays.asList("373", "xyz", "145");
        List<Object> list = List.of(1, 2, "a", "b", 0, 15);
        filterList(list);
    }
    public static List<Object> filterList(final List<Object> list) {
        List<String> stringList = list.stream().map(Object::toString).map(x -> {
                    try {
                        System.out.print(Integer.parseInt(x) + ",");
                        return x;
                    } catch (NumberFormatException ex) {
                        return null;
                    }
                }
        ).filter(Objects::nonNull).toList();
        List<Object> objectList = new ArrayList<Object>(stringList);

        System.out.println();
        System.out.println(objectList);

        return objectList;
    }
}


interface Kata {
    static List<Object> filterList(List<Object> list) {
        return list.stream().filter(Integer.class::isInstance).toList();
    }
}

//return list.stream().filter(x -> x instanceof Integer).toList();
//
//
//
//public static List filterList(final List list) {
//        return (List<Object>) list.stream().filter( e -> e instanceof Integer ).collect(Collectors.toList());
//        }
//
//
//
//public static List<Object> filterList(final List<Object> list) {
//        // Return the List with the Strings filtered out
//        return list.stream()
//        .filter(not(li -> li instanceof String))
//        .collect(Collectors.toList());
//        }
//
//
//public static List filterList(final List list) {
//        return (List) list.stream().filter(o -> !o.getClass().equals(String.class)).collect(java.util.stream.Collectors.toList());
//        }
//
//public static List filterList(final List<?> list) {
//        return list.stream()
//        .filter(o -> o instanceof Number)
//        .collect(toList());
//        }
//
//public static List<Object> filterList(final List<Object> list) {
//        // Return the List with the Strings filtered out
//        return list.stream().filter(v -> v instanceof Integer).toList();
//        }