package service.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public interface ConsumerConcept {
     static void main(String[] args) {
         List<Integer> list= Arrays.asList(1,2,4,5,3,5);
         list.forEach(e -> System.out.println(e*2));

         Consumer<List<Integer>> listConsumer=e ->{
           for(Integer li:e)
           {
               System.out.println(li);
           }
         };
         Consumer<List<Integer>> listConsumer1=e ->{
           for(Integer li:e)
           {
               System.out.println(li*100);
           }
         };


         listConsumer.andThen(listConsumer1).accept(Arrays.asList(1,255,2,2));

    }
}
