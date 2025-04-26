package service.supplier;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface SupplierConcept {
     static void main(String[] args) {

        Predicate<Integer> predicate= x -> x%2==0;
        Function<Integer,Integer> function= x -> x*10;
        Consumer<String> consumer=e -> System.out.println(e);
        Supplier<Integer> supplier= ()->  3;
         boolean test = predicate.test(function.apply(supplier.get()));
         if (test)
             consumer.accept("Even number :"+supplier.get());
         else System.out.println("Odd number :"+supplier.get());


     }
}
