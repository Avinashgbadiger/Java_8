package service.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public interface CreationOfStreams {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,23,5,6);
        list.stream();

        Integer[] num={54,2,4,2,21,3,5};
       Stream<Integer> num1 = Arrays.stream(num);
        Stream<Integer> integerStream = Stream.of(4, 2, 2, 2);

        Stream<Integer> limit = Stream.iterate(0, e -> e + 1).limit(5);

        Stream<Integer> distinct = Stream.generate(() ->(int)Math.random()+88).limit(5);
        distinct.forEach(System.out::println);

        Integer i = Stream.iterate(0, e -> e + 1)
                .limit(10)
                .peek(System.out::println)
                .max((a, b) -> b - a)
                .get();
    }
}
