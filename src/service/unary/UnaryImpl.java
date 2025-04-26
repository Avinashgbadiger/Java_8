package service.unary;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public interface UnaryImpl {

     static void main(String[] args) {
         UnaryOperator<Integer> unaryOperator= e -> e*10;

         System.out.println(unaryOperator.apply(10));

         BinaryOperator<String> binaryOperator =(a,b) -> a.toUpperCase()+b.toUpperCase();
         System.out.println(binaryOperator.apply("avinash"," Badiger"));

    }

}
