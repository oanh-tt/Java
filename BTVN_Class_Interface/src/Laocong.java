import java.time.LocalDate;

public class Laocong extends Person {
    public Laocong(String firstName, String lastName, LocalDate birthday) {
        super(firstName, lastName, birthday);
    }
    void quetDon(){
        System.out.println("Đảm bảo vấn đề vệ sinh trong khuôn viên trường");
    }
}
