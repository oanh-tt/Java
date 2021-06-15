import java.util.Scanner;

public class ngaythang {
    static void inNgaythang() {
        Scanner sc = new Scanner(System.in);
        int n;
        try {
            do {
                System.out.println("Mời bạn nhập số bất kỳ: ");
                n = sc.nextInt();
            }while (n<0);
            if (n > 0 && n < 13) {
                System.out.printf("%s là tháng trong năm", n);
                if (n == 2) {
                    System.out.printf("\nTháng %s có 28 hoăc 29 ngày",n);
                } else if (n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12) {
                    System.out.printf("\nTháng %s có 31 ngày",n);
                } else {
                    System.out.printf("\nTháng %s có 30 ngày",n);
                }
            } else {
                System.out.printf("%s không phải là tháng trong năm", n);
            }

        }catch (Exception e){
            System.out.println("n nhập vào phải là 1 số");
        }
    }
}
