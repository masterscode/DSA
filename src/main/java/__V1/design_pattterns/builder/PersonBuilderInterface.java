package __V1.design_pattterns.builder;

public interface PersonBuilderInterface {
    PersonBuilderInterface firstName(String firstName);
    PersonBuilderInterface lastName(String lastName);
    PersonBuilderInterface gender(String gender);
    PersonBuilderInterface title(String title);
    PersonBuilderInterface email(String email);
    Person build();
}
