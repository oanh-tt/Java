import java.time.LocalDate;

public class Person {
    public Person(String firstName, String lastName, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person [birthday=" + birthday + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }
    String firstName;
    String lastName;
    LocalDate birthday;

    public void work() {
        System.out.println("work 8 hours day");
    }

}
