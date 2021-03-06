import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        inputGiangVien();
        inputNhanVien();
        inputSinhVien();
    }

    public static void inputGiangVien() {
        Person person = new Person("Trần", "Oanh", LocalDate.of(1993,6,5));
        System.out.println(person);
        Fulltime full = new Fulltime("Nguyễn", "Hà", LocalDate.of(1988,10,5));
        System.out.println("Giảng viên: "+full);
        full.soTiet();
        full.giangDay();
        full.soanGiaoAn();
        full.quanLySinhVien();
        System.out.println();
        Congtacvien ctv = new Congtacvien("Nguyễn", "Quỳnh", LocalDate.of(1994,10,17));
        System.out.println("Cộng tác viên: "+ctv );
        ctv.soTiet();
        ctv.soanGiaoAn();
        ctv.giangDay();
        ctv.quanLySinhVien();

        System.out.println();
        Thinhgiang tg = new Thinhgiang("Lê", "Hà", LocalDate.of(1988,10,8));
        System.out.println("Thỉnh giảng: "+tg);
        tg.soTiet();
        tg.giangDay();
        tg.soanGiaoAn();
    }
    public static void inputNhanVien(){
        System.out.println();
        Tuyensinh ts = new Tuyensinh("Nguyễn", "Ngọc", LocalDate.of(2003,10,5));
        System.out.println("Tuyển sinh: "+ts);
        ts.tuyenSinh();

        System.out.println();
        Ketoan kt = new Ketoan("Nguyễn", "Huyền", LocalDate.of(1991,10,5));
        System.out.println("Kế toán: "+kt);
        kt.keToan();

        System.out.println();
        Laocong lc = new Laocong("Phạm", "Quyên", LocalDate.of(1986,9,5));
        System.out.println("Lao công: "+lc);
        lc.quetDon();

        System.out.println();
        Baove bv = new Baove("Trần", "Lộc", LocalDate.of(1993,7,5));
        System.out.println("Bảo vệ: "+bv);
        bv.baoVe();
    }

    public static void inputSinhVien(){
        System.out.println();
        Sinhvien sv = new Sinhvien("Nguyễn", "Lam", LocalDate.of(2000,3,6));
        System.out.println("Sinh Viên: "+sv);
        sv.hocTap();

    }



}
