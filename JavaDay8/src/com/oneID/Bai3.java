package com.oneID;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Bai3 {
    static void validateemail(){
        String EMAIL_PATTERN =
                "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập mail: ");
        String email = sc.nextLine();
        if (Pattern.matches(EMAIL_PATTERN,email)==true){
            System.out.println("Email nhập vào đúng định dạng");
        }
        else {
            System.out.println("Email nhập vào không đúng định dạng");
        }
    }
}
