package main.java.Kata.Practeice.Stream_course;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamLessons {
    public static void main(String[] args) {
        IntStream.of(120, 410, 85, 32, 314, 12)
                .filter(x -> x < 300)
                .map(x -> x + 11)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("--------------------------");
        Stream.of(1, 2, 3)
                .forEach(System.out::println);

        System.out.println("--------------------------");
        String str = Math.random() > 0.5 ? "I'm feeling lucky" : null;
        Stream.ofNullable(str)
                .forEach(System.out::println);

        System.out.println("--------------------------");
        Stream.generate(() -> 6)
                .limit(6)
                .forEach(System.out::println);

        System.out.println("--------------------------");
        Stream.iterate(2, x -> x + 6)
                .limit(6)
                .forEach(System.out::println);

        System.out.println("--------------------------");
        Stream.iterate(1, x -> x * 2)
                .limit(6)
                .forEach(System.out::println);

        System.out.println("--------------------------");
        Stream.iterate(2, x -> x < 25, x -> x + 6)
                .forEach(System.out::println);

        System.out.println("--------------------------");
        Stream.iterate(4, x -> x < 100, x -> x * 4)
                .forEach(System.out::println);

        System.out.println("--------------------------");
        Stream.concat(
                Stream.of(10),
                Stream.of(4,16))
                .forEach(System.out::println);
        System.out.println("--------------------------");
        Stream.Builder<Integer> streamBuilder = Stream.<Integer>builder()
                .add(0)
                .add(1);
        for (int i = 2; i <= 8; i += 2) {
            streamBuilder.accept(i);
        }
        streamBuilder
                .add(9)
                .add(10)
                .build()
                .forEach(System.out::println);

        System.out.println("--------------------------");
        LongStream.range(-10L, -5L)
                .forEach(System.out::println);

        System.out.println("--------------------------");
        Stream.of(120, 410, 85, 32, 314, 12)
                .filter(x -> x > 100)
                .forEach(System.out::println);

        System.out.println("-------map-------------------");
        Stream.of("3", "4", "5")
                .map(Integer::parseInt)
                .map(x -> x + 10)
                .forEach(System.out::println);

        System.out.println("--------------------------");
        List<String> integers = Arrays.asList("44", "373", "xyz", "145");
        integers.forEach(str1 -> {
                    try {
                        System.out.println(Integer.parseInt(str1));
                    }catch (NumberFormatException ex) {
                        System.out.println("Can't format this string");
                    }
                }
        );

        System.out.println("-------flatMapToInt-------------------");
        Stream.of(2, 3, 0, 1, 3)
                .flatMapToInt(x -> IntStream.range(0, x))
                .forEach(System.out::println);

        System.out.println("--------x*x*x------------------");
        Stream.of(1, 2, 3, 4, 5, 6)
                .flatMap(x -> {
                    switch (x % 2
                    ) {
                        case 0:
                            return Stream.of(x, x*x, x*x*2
                            );
                        case 1:
                            return Stream.of(x);
                        case 2:
                        default:
                            return Stream.empty();
                    }
                })
                .forEach(System.out::println);

        System.out.println("---------mapMulti-----------------");
        Stream.of(1, 2, 3, 4, 5, 6)
                .mapMulti((x, consumer) -> {
                    if (x % 2 == 0) {
                        consumer.accept(-x);
                        consumer.accept(x);
                    }
                })
                .forEach(System.out::println);
        System.out.println("--------------------------");


//        System.out.println("--------------------------");


//        System.out.println("--------------------------");


//        System.out.println("--------------------------");


//        System.out.println("--------------------------");
    }

}
