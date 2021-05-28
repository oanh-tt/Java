package com.oneID;

import java.util.Locale;
import java.util.Scanner;

public class Bai1 {
    static void chuachuoi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi A: ");
        String strA= sc.nextLine();
        System.out.println("Nhập chuỗi B: ");
        String strB= sc.nextLine();
        String str1= strA.toLowerCase();
        String str2=strB.toLowerCase();

        if (str1.contains(str2)==true){
            System.out.println("Chuỗi A chứa chuỗi B");
        }
        else if (str2.contains(str1)==true){
            System.out.println("Chuỗi B chứa chuỗi A");
        }
        else {
            System.out.println("Chuỗi A và B không chứa nhau");
        }

    }
}
