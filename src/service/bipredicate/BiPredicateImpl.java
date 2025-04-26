package service.bipredicate;

import java.util.function.BiPredicate;

public interface BiPredicateImpl {
    public static void main(String[] args) {
        BiPredicate<Integer,String> biPredicate= (x,y)-> x==y.length();
        System.out.println(biPredicate.test(7,"avinash"));
    }
}
