package DesignPattern.BuilderDesignPattern;

public class BuilderDesignPattern {
    public static void main(String[] args) {
        Pizza p=new Pizza.Builder()
                .name("Margerrita")
                .size("Medium")
                .price(50f)
                .cheeze(true)
                .build();
        System.out.println(p);
    }

}
