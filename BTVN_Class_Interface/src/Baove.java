import java.time.LocalDate;

public abstract class Baove extends Nhanvien{
    public Baove(String firstName, String lastName, LocalDate birthday) {
        super(firstName, lastName, birthday);
    }
    void baoVe(){
        System.out.println("Đảm bảo vấn đề an ninh trường học");
    }
}
