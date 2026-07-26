package CoreJava.LamdaFunctionLearning;

public class LamdaFunctionMain {
    public static void main(String[] args) {
        Calculator c=(int a, int b) ->  a+b; // this is lamda function applicable only on functional interface
        // functional interface means it has one abstract method (no body)
        System.out.println(c.calculate(1,7));

    }
}
