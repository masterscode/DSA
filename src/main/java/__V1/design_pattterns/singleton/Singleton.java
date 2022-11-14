package __V1.design_pattterns.singleton;

import lombok.ToString;

@ToString
public class Singleton {
    private static Singleton instance = null;

    private String name;
    private int value;

    private Singleton(){

    }

    private Singleton setName(String name){
        this.name = name;
        return this;
    }
    private Singleton setValue(int val){
        this.value = val;
        return this;
    }

    public static Singleton getInstance(String name, int v){
        instance = instance == null ? new Singleton().setName(name).setValue(v): instance;
        return instance;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("singleton", 1);
        System.out.println(singleton);
        System.out.println(Singleton.getInstance("another singleton", 2));

    }
}
