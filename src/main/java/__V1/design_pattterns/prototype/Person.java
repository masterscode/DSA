package __V1.design_pattterns.prototype;

import lombok.Data;

import java.util.Objects;

@Data
public class Person {
    private String name;
    private Boolean isMarried;
    private int age;

    public Person(){

    }
    public Person(Person person){
        this.name= person.getName();
        this.age = person.getAge();
        this.isMarried = person.getIsMarried();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name) && isMarried.equals(person.isMarried);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isMarried, age);
    }

    public Person cloneMe(){
        return new Person(this);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();

    }
}
