package CoreJava.MethodReferenceLearning;
@FunctionalInterface
public interface Creator<T> {
    T create(String s);
}
