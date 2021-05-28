package com.oneID;

import java.util.Scanner;

public class Bai2 {
    static void xoakytutrung() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = sc.nextLine();
        String str1="";
        for (int i = 0; i < str.length(); i++) {
            String s=str.substring(i,i+1);
            if (str1.indexOf(s)==-1){
                str1=str1.concat(s);
            }
        }
        System.out.println("Chuỗi sau khi xóa ký tự trùng: "+str1);
    }
}
