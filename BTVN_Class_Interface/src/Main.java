import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Class");
        demoPerson();
    }

    public static void demoPerson(){
        Person person = new Person("Steve", "Jobs", LocalDate.of(1969, 10, 02));
        System.out.println(person);
    }
}
