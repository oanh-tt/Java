import java.time.LocalDate;

public class Daratruong extends Sinhvien{
    public Daratruong(String firstName, String lastName, LocalDate birthday) {
        super(firstName, lastName, birthday);
    }
    void daRatruong(){
        System.out.println("Gồm các sinh viên đã tốt nghiệp");
    }
}
