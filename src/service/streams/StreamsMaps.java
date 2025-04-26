package service.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface StreamsMaps {
    public static void main(String[] args) {

        Stream<String> avinash = Stream.of("avinash", "vicky", "what");
        Stream<Integer> limit = Stream.generate(() -> ThreadLocalRandom.current().nextInt(0, 100)).limit(5);
//        limit.forEach(System.out::println);

        Stream<Integer> limit1 = Stream.iterate(0, n -> n + 1).limit(10);
        limit1.forEach(System.out::println);
        System.out.println("---------------------");
        List<Integer> list=Arrays.asList(6,43,641,99,867,2,10,20,66);
        List<Integer> filteredList = list.stream().filter(e -> e % 2 == 0)
                .map(e -> e / 2)
                .distinct()
                .sorted((a,b)-> b-a)
                .collect(Collectors.toList());

        filteredList.forEach(System.out::println);
    }
}
