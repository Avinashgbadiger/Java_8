package service.bifunction;

import java.util.function.BiFunction;

public interface BiFunctionImpl {
     static void main(String[] args) {
        BiFunction<String,Integer,Integer> biFunction= (x,y)-> (x.length()+y)*10;
         System.out.println(biFunction.apply("avinash",2));
    }
}
