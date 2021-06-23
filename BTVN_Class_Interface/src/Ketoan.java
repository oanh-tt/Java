import java.time.LocalDate;

public abstract class Ketoan extends Nhanvien{
    public Ketoan(String firstName, String lastName, LocalDate birthday) {
        super(firstName, lastName, birthday);
    }


    void keToan(){
        System.out.println("Kết toán lương, quản lý thu chi của trường học");
    }
}
