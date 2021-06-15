import java.util.Scanner;
import java.util.regex.Pattern;

public class inputPass {
    static void checkFormatPass(){
        String password = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{10,}$";;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập password: ");
        String pass = sc.nextLine();
        if(Pattern.matches(password,pass)==true){
            System.out.println("Password pass");
        }else if (pass.length()<10){
            System.out.println("Mật khẩu yếu");
        }else {
            System.out.println("Mật khẩu chưa đủ mạnh");
        }
    }
}

