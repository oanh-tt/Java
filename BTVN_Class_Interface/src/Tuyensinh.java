import java.time.LocalDate;

public class Tuyensinh extends Person{
    public Tuyensinh(String firstName, String lastName, LocalDate birthday) {
        super(firstName, lastName, birthday);
    }
    void tuyenSinh(){
        System.out.println("Thực hiện các công việc tuyển sinh cho nhà trường");
    }
}
