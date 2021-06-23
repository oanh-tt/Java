import java.time.LocalDate;

public class Chuanbinhaphoc extends Sinhvien{
    public Chuanbinhaphoc(String firstName, String lastName, LocalDate birthday) {
        super(firstName, lastName, birthday);
    }
    void tanSinhvien(){
        System.out.println("Gồm các sinh viên mới trúng tuyển trong đợt tuyển sinh");
    }
}
