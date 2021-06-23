import java.time.LocalDate;

public class Congtacvien extends Giangvien implements Dayhoc{
    public Congtacvien(String firstName, String lastName, LocalDate birthday) {
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
        System.out.println("Chỉ 1 số tiết trong tuần");
    }
}
