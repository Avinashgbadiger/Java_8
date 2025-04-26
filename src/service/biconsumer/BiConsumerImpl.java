package service.biconsumer;

import java.util.function.BiConsumer;

public interface BiConsumerImpl {
    public static void main(String[] args) {
        BiConsumer<String,Integer> biConsumer=(x,y)-> System.out.println(x.length()+y);
       biConsumer.accept("avinash",22);
    }
}
