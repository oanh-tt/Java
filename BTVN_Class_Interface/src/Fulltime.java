import java.time.LocalDate;

public class Fulltime  extends Giangvien implements Dayhoc{
    public Fulltime(String firstName, String lastName, LocalDate birthday) {
        super(firstName, lastName, birthday);
    }

    @Override
    public void lenLop() {
        System.out.println("Lên lớp dạy học");
    }

    @Override
    public void soanGiaoAn() {
        System.out.println("Soạn giáo án cho buổi lên lớp");

    }
    @Override
    public void thoiGian(){
        System.out.println("Làm việc full thời gian");
    }
}
