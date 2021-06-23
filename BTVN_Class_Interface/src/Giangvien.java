import java.time.LocalDate;

public abstract class Giangvien extends Person{
    public Giangvien(String firstName, String lastName, LocalDate birthday) {
        super(firstName, lastName, birthday);
    }
    int sotiet;

    abstract void thoiGian();
}
