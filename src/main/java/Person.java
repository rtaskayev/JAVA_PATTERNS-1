import java.util.OptionalInt;

public class Person {

    protected final String name;
    protected final String surname;
    protected int age;
    private String address = null;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        return age != 0;
    }

    public boolean hasAddress() {
        return address == null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        this.age++;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder();
    }

    @Override
    public String toString() {
        return "{Person: NAME=" + name + " SURNAME=" + surname + " AGE=" + age + " ADDRESS=" + address + "}";

    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.surname.hashCode();
    }

}