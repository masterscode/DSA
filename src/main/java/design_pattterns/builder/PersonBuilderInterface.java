package design_pattterns.builder;

public interface PersonBuilderInterface {
    PersonBuilderInterface firstName(String firstName);
    PersonBuilderInterface lastName(String lastName);
    PersonBuilderInterface gender(String gender);
    PersonBuilderInterface title(String title);
    Person build();
}
