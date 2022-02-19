package design_pattterns.builder;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Person person = Person.builder()
                .firstName("emmanuel")
                .gender("male")
                .email("ogbinaka")
                .title("odogwu").build();

        Person.builder().email("").firstName("").build();
        log.info(person.toString());
    }
}
