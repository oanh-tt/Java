package com.oneID;

import java.sql.SQLOutput;
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
                    System.out.println("Nhập số hàng: ");
                    int hang = sc.nextInt();
                    System.out.println("Nhập số cột: ");
                    int cot = sc.nextInt();
                    if (hang!=cot){
                        System.out.println("Đây không phải ma trận vuông. Mời nhập lại");
                    }
                    else {
                        int[][] A = new int[hang][cot];
                        System.out.println("Nhập ma trận A:");
                        Mangdachieu.Nhapmatran(A, hang, cot);
                        System.out.println("In ra ma trận A");
                        Mangdachieu.Inmatran(A, hang, cot);
                        System.out.print("\nIn ra đường chéo chính của ma trận A: ");
                        Mangdachieu.Duongcheo(A, hang, cot);
                        System.out.print("\nSắp xếp hàng 2 của ma trận A theo chiều tăng dần: ");
                        Mangdachieu.Sapxephang(A, hang, cot);
                        System.out.print("\nIn ra các số nguyên tố trong ma trận A: ");
                        Mangdachieu.Insonguyento(A, hang, cot);
                    }
                    break;
                case 2:
                    System.out.println("Nhập mảng 1 chiều: ");
                    System.out.println("Nhập số phần tử của mảng: ");
                    int n = sc.nextInt();
                    int[] arr=new int[n];
                    Mang1chieu.nhapmang1chieu(arr);
                    System.out.println("In ra mảng vừa nhập");
                    Mang1chieu.show(arr);
                    Mang1chieu.Insonguyento(arr);
                    Mang1chieu.suamang(arr);
                    break;
            }
        }
    }
        static void menu(){
            System.out.println("\nNhập lựa chọn: ");
            System.out.println("1 - Bài 1: Mảng đa chiều");
            System.out.println("2 - Bài 2: Mảng một chiều");
            System.out.println("0 - Thoát chương trình");
            System.out.print("Lựa chọn của bạn là: ");
        }


        static boolean checksonguyento ( int number){
            if (number < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

