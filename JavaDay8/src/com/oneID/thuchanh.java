package com.oneID;

import java.util.Random;
import java.util.Scanner;

public class thuchanh {
    static void Intentuoi() {
        String ten;
        int tuoi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        ten = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        //int tuoi = Integer.valueOf(sc.nextLine());
        tuoi = sc.nextByte();
        sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String diachi = sc.nextLine();
        System.out.printf("Tôi tên là %s, năm nay tôi %d tuổi, tôi đến từ %s", ten, tuoi, diachi);
    }

    static String Intentuoi1() {
        String ten;
        int tuoi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        ten = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        //int tuoi = Integer.valueOf(sc.nextLine());
        tuoi = sc.nextByte();
        sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String diachi = sc.nextLine();
        String str = "Tôi tên là " + ten + ", năm nay tôi " + tuoi + ", tôi đến từ " + diachi;
        //System.out.printf("Tôi tên là %s, năm nay tôi %d tuổi, tôi đến từ %s", ten, tuoi, diachi);
        return str;
    }

    static void sosanhso() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int n1 = sc.nextInt();
        Random rand = new Random();
        int n2 = rand.nextInt(100);
        System.out.println("In ra số ngẫu nhiên: " + n2);
        if (n1 > n2) {
            System.out.println("Lớn hơn rồi");
        } else if (n1 < n2) {
            System.out.println("Nhỏ hơn rồi");
        } else {
            System.out.println("Bằng nhau kìa");
        }
    }
    static void songaunhien(){
        Random rand=new Random();
        int number=0;
        while (number<=90){
            number= rand.nextInt(100);
            System.out.println(number);
        }
        if (number>90) {
            System.out.println("Số ngẫu nhiên lớn hơn 90, dừng chương trình");
        }
    }
}
