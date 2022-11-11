public class PersonBuilder {

    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder() {
    }


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if ((age < 0) || (age > 150)) {
            throw new IllegalArgumentException("Age is incorrect. It is " + age + ", but should be from 1 to 150 years");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if ((name == null) || (surname == null)) {
            throw new IllegalStateException("Name and/or Surmname is missing. These are required parameters and have to be set");
        }
        return new Person(name, surname, age, address);
    }
}