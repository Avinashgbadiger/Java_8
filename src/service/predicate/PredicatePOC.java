package service.predicate;

import java.util.Arrays;
import java.util.function.Predicate;

public interface PredicatePOC {

    static void main(String[] args) {
        Predicate<Integer> predicate = e -> e > 10000;
       // System.out.println(predicate.test(250000));

        Predicate<String> stringPredicate= e -> e.toLowerCase().startsWith("v");
        //System.out.println(stringPredicate.test("vicky"));

        Predicate<String> endCharPredicate= e -> e.toLowerCase().endsWith("h");

        //System.out.println(endCharPredicate.test("avinash"));

        //or
        Predicate<String> and=stringPredicate.and(endCharPredicate);

        System.out.println(and.test("vickyavinash"));

        int num[]={3,2,6,8,9,1};
        int sum = Arrays.stream(num).filter(e -> e%2==0).sum();
        System.out.println(sum);
    }
}
