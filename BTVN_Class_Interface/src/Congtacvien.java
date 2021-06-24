import java.time.LocalDate;

public class Congtacvien extends Person implements Giangvien{
    public Congtacvien(String firstName, String lastName, LocalDate birthday) {
        super(firstName, lastName, birthday);
    }

    @Override
    public int soTiet() {
        int tiet = 30;
        System.out.println("Cộng tác viên dạy tối đa "+tiet+ " tiết/tuần");
        return tiet;

    }

    @Override
    public void giangDay() {
        System.out.println("Tiến hành giảng dạy sinh viên và hướng dẫn sinh viên về các kỹ năng tự học, nghiên cứu, trao đổi,...");

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
