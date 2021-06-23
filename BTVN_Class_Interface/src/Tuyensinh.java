import java.time.LocalDate;

public abstract class Tuyensinh extends Nhanvien{
    public Tuyensinh(String firstName, String lastName, LocalDate birthday) {
        super(firstName, lastName, birthday);
    }
    void tuyenSinh(){
        System.out.println("Thực hiện các công việc tuyển sinh cho nhà trường");
    }
}
