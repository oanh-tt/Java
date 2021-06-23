import java.time.LocalDate;

public class Danghoc extends Sinhvien{
    public Danghoc(String firstName, String lastName, LocalDate birthday) {
        super(firstName, lastName, birthday);
    }
    void dangHoc(){
        System.out.println("Gồm các sinh viên đang học");
    }
}
