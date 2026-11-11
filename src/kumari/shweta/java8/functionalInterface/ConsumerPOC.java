package kumari.shweta.java8.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerPOC {




    public static void main(String[] args) {

        List<Integer> value = Arrays.asList(2,3,5,6);
        //Type1
        value.forEach(i->System.out.print(i));



        Consumer<String> consumer=i->System.out.println("Hello");

        //Type 2 :
        Consumer<String> consumer1=new Consumer<String>() {
            @Override
            public void accept(String s) {
              System.out.println("Hello !!"+ s);
            }
        };

        consumer1.accept("Shweta");

    }
}
