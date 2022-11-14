package __V1.design_pattterns.builder;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Person {
    private String firstName, lastName, gender, title, email;

    private Person(PersonBuilderImpl builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.gender = builder.gender;
        this.title = builder.title;
        this.email = builder.email;
    }

    public static PersonBuilderInterface builder(){
        return new PersonBuilderImpl();
    }

    private static class PersonBuilderImpl implements PersonBuilderInterface {
        private String firstName, lastName, gender, title, email;

        public PersonBuilderImpl(){
            //
        }
        @Override
        public PersonBuilderInterface firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        @Override
        public PersonBuilderInterface lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        @Override
        public PersonBuilderInterface gender(String gender) {
            this.gender = gender;
            return this;
        }

        @Override
        public PersonBuilderInterface title(String title) {
            this.title = title;
            return this;
        }

        @Override
        public PersonBuilderInterface email(String email) {
            this.email = email;
            return this;
        }

        @Override
        public Person build() {
            return new Person(this);
        }
    }
}
