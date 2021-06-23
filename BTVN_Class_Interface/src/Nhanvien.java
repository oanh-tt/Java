import java.time.LocalDate;

public abstract class Nhanvien extends Person {

    public Nhanvien(String firstName, String lastName, LocalDate birthday) {
        super(firstName, lastName, birthday);
    }
   int rank;

    public Nhanvien() {
        super.work();
    }

    public abstract void thoiGian();
}