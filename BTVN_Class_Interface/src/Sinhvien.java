import java.time.LocalDate;

public class Sinhvien extends Person {

    public Sinhvien(String firstName, String lastName, LocalDate birthday) {
        super(firstName, lastName, birthday);
    }
    void hocTap(){
        System.out.println("Hoàn thành các khóa học");
    }
}
