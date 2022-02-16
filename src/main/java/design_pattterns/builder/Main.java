package design_pattterns.builder;

public class Main {
    public static void main(String[] args) {
        Person person = Person.builder()
                .firstName("emmanuel")
                .gender("male")
                .title("odogwu").build();
        System.out.println(person);
    }
}
