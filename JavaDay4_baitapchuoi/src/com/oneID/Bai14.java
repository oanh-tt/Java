package com.oneID;

import java.util.Scanner;

public class Bai14 {
    static void kiemtranguyenamnguyenduong(){
        System.out.println("\nBài 14: Kiểm tra 1 số bất kỳ là số nguyên âm hay nguyên dương");
        System.out.print("Nhập số n: \t");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        if (n==0){
            System.out.println("0 không là số nguyên âm cũng không là số nguyên dương");
        }
        else if (n<0){
            System.out.println(n+" là số nguyên âm");
        }
        else {
            System.out.println(n+" là số nguyên dương");
        }
    }
}
