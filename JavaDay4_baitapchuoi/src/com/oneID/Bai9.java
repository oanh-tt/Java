package com.oneID;

import java.util.Scanner;

public class Bai9 {
    static void chuanhoachuoi(){
        System.out.println("\nBài 9: Chuẩn hóa chuỗi");
        System.out.print("Nhập vào 1 chuỗi: \t");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str=str.trim();
        String newStr;
        char ch[] = new char[str.length()];
        for(int i=0;i<str.length();i++) {
            ch[i] = str.charAt(i);
            if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0))) {
                ch[i]=Character.toUpperCase(ch[i]);
            }
        }
        newStr=String.valueOf(ch);
        newStr=newStr.trim();
        newStr=newStr.replaceAll("\\s+"," ");
        System.out.println("Chuỗi sau khi đổi: "+newStr);
    }
}
