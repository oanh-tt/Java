import java.time.LocalDate;

public class Thinhgiang extends Person implements Giangvien{
    public Thinhgiang(String firstName, String lastName, LocalDate birthday) {
        super(firstName, lastName, birthday);
    }

    @Override
    public int soTiet() {
        int tiet = 5;
        System.out.println("Thỉnh giảng dạy tối đa "+tiet+ " tiết/tuần");
        return tiet;
    }

    @Override
    public void giangDay() {
        System.out.println("Thỉnh giảng là việc cơ sở giáo dục mời người đủ tiêu chuẩn quy định của pháp luật đến giảng dạy"
        );

    }

    @Override
    public void quanLySinhVien() {

    }

    @Override
    public void soanGiaoAn() {
        System.out.println("Thực hiện xây dựng các kế hoạch giảng dạy, các bài giảng theo yêu cầu cùa nhà trường.");

    }

}
