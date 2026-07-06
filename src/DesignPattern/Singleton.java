package DesignPattern;

public class Singleton {
    private static volatile Singleton instance;

    public String getData() {
        return data;
    }

    private  String data;
    private Singleton(String data) {// constructor not accessible from outside
        this.data=data;
    }

    public static Singleton getInstance(String data){
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance=new Singleton(data);
                }
            }
        }

        return instance;
    }
}
