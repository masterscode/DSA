package design_pattterns.prototype;

import lombok.Data;

@Data
public class Prototype implements Cloneable {

    private String name;
    private int count;

    public Prototype() {
    }

    public Prototype(Prototype src) {
        count = src.count;
        name = src.name;

        String num = new StringBuilder(new StringBuilder("070351140205").reverse().substring(0, 10)).reverse().toString();

    }


    public static String last10Digits(String str){
        return str.startsWith("+") ?
                str.replace("+234", "") :
                str.startsWith("234") ?
                        str.replace("234", "")
                        : str.substring(1);
    }

    @Override
    public Prototype cloned() {
        return new Prototype(this);
    }

    @Override
    public boolean equals(Object o){
        var other = (Prototype) o;
        return (other.count== this.count) && other.name.equals(this.name);
    }

    @Override
    public int hashCode(){
        return 0;
    }

    public static void main(String[] args) {
        Prototype prototype = new Prototype();

//        prototype.c
    }
}
