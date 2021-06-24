import java.time.LocalDate;

public class Fulltime  extends Person implements Giangvien{
    public Fulltime(String firstName, String lastName, LocalDate birthday) {
        super(firstName, lastName, birthday);
    }

    @Override
    public int soTiet() {
        int tiet = 40;
        System.out.println("Giảng viên full time dạy tối đa "+tiet+ " tiết/tuần");
        return tiet;
    }

    @Override
    public void giangDay() {
        System.out.println("Tiến hành giảng dạy sinh viên và hướng dẫn sinh viên ");
    }

    @Override
    public void quanLySinhVien() {
        System.out.println("Tham gia công tác đánh giá kết quả học tập của sinh viên");

    }

    @Override
    public void soanGiaoAn() {
        System.out.println("Thực hiện xây dựng các kế hoạch giảng dạy.");

    }
}
