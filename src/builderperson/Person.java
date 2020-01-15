package builderperson;

import java.util.Date;

public class Person {

    private String name;
    private String surname;
    private int age;
    private Date birthDate;
    private int height;
    private int weight;

    private Person(String name, String surname, int age, Date birthDate, int height, int weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.birthDate = birthDate;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {

        private String name;
        private String surname;
        private int age;
        private Date birthDate;
        private int height;
        private int weight;

        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setBirthDate(Date birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public PersonBuilder setHeight(int height) {
            this.height = height;
            return this;
        }

        public PersonBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Person build() {
            return new Person(name, surname, age, birthDate, height, weight);
        }
    }
}
