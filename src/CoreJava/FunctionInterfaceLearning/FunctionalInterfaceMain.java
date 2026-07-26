package CoreJava.FunctionInterfaceLearning;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceMain {
    public static void main(String[] args) {
        Predicate<Integer> p = ( i) ->  i%2==0;
//        System.out.println(p.test(10));
        Function<Integer,String> f = (i)->{
            if(i>18)    return "person is adult";
            else return  "person is minor";
        };
//        System.out.println(f.apply(19));

        Consumer<String> c = (i) -> System.out.println("My name is "+i);
//        c.accept("Anurag");

        Supplier <Integer> s =()->  (int)(Math.random()*100);
        System.out.println(s.get());
    }

}
