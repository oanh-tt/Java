package com.oneID;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu();
            int choose = sc.nextInt();
            switch (choose) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    Bai1.chuachuoi();
                    break;
                case 2:
                    Bai2.xoakytutrung();
                    break;
                case 3:
                    Bai3.validateemail();
                    break;
            }

        }
    }
    static void menu () {
        System.out.println("\nNhập lựa chọn: ");
        System.out.println("1 - Bài 1: Kiểm tra 1 chuỗi chứa nội dung của chuỗi khác không");
        System.out.println("2 - Bài 2: Loại bỏ ký tự trùng nhau trong chuỗi");
        System.out.println("3 - Bài 3: Validate định dạng mail");
        System.out.println("0 - Thoát chương trình");
        System.out.print("Lựa chọn của bạn là: ");
    }
}

