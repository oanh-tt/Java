package com.oneID;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu();
            int choose = sc.nextInt();
            switch (choose) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Nhập vào số n: ");
                    int n = sc.nextInt();
                    if (n>0){
                        Bai1.Tongluythua2(n);
                    }else {
                        System.out.println("Số nhập vào phải lớn hơn 0");
                    }
                    break;
                case 2:
                    System.out.println("Nhập vào số n: ");
                    int n1 = sc.nextInt();
                    if (n1>0){
                        Bai2.Tongbai2(n1);
                    }else {
                        System.out.println("Số nhập vào phải lớn hơn 0");
                    }
                    break;
                case 3:
                    System.out.println("Nhập vào số n: ");
                    int n2 = sc.nextInt();
                    if (n2>=0){
                    Bai3.Tongbai3(n2);
                    }
                    else {
                        System.out.println("Số nhập vào phải >= 0");
                    }
                    break;
                case 4:
                    System.out.println("Nhập vào số n: ");
                    int n3 = sc.nextInt();
                    if (n3>0){
                    System.out.println("Số đảo ngược là: "+Bai4.Daonguocso(n3));
                    }
                    else {
                        System.out.println("Số nhập vào phải > 0");
                    }
                    break;
                case 5:
                    System.out.println("Nhập vào số n: ");
                    int n4 = sc.nextInt();
                    if (n4>0) {
                        Bai5.Sodoixung(n4);
                    }
                    else {
                        System.out.println("Số n phải >0.Mời nhập lại");
                    }
                    break;
                case 6:
                    System.out.println("Nhập vào số n: ");
                    int n5=sc.nextByte();
                    int arr[] = new int[n5];
                    if (n5>0) {
                        Bai6.nhapmang(arr);
                        System.out.println("In ra mảng: ");
                        Bai6.inmang(arr);
                        System.out.println();
                        int num = Bai6.sochancuoicung(arr);
                        if (num == -1) {
                            System.out.println("Mảng không có số chẵn");
                        } else {
                            System.out.println("Số chẵn cuối cùng trong mảng là: " + num);
                        }
                    }
                    else {
                        System.out.println("Số n phải >0.Mời nhập lại");
                    }
                    break;
                case 7:
                    System.out.println("Nhập vào số n: ");
                    int n6=sc.nextByte();
                    int arr1[] = new int[n6];
                    if (n6>0){
                    Bai6.nhapmang(arr1);
                    System.out.println("In ra mảng: ");
                    Bai6.inmang(arr1);
                    System.out.println();
                    int num1=Bai6.soamdautien(arr1);
                    if (num1==1){
                        System.out.println("Mảng không có số âm");
                    }
                    else {
                        System.out.println("Số âm đầu tiên trong mảng là: "+num1);
                    }
                    }
                    else {
                        System.out.println("Số n phải >0. Mời nhập lại");
                    }
                    break;
                case 9:
                    System.out.println("Nhập vào chiều cao: ");
                    int hight = sc.nextInt();
                    if (hight>0) {
                        Bai9.intamgiaccan(hight);
                    }
                    else {
                        System.out.println("Chiều cao nhập vào phải >0.Mời nhập lại");
                    }
                    break;
                case 10:
                    System.out.println("Nhập chiều cao: ");
                    int height = sc.nextByte();
                    System.out.println("Nhập chiều rộng: ");
                    int width =sc.nextByte();
                    if (height>0 && width >0){
                    Bai10.Inhinhchunhat(height,width);
                    }
                    else {
                        System.out.println("Chiều cao, chiều rộng phải > 0. Mời nhập lại");
                    }
                    break;
            }
        }
    }
            static void menu () {
                System.out.println("\nNhập lựa chọn: ");
                System.out.println("1 - Bài 1: Tính tổng S=1*2+...+n*2");
                System.out.println("2 - Bài 2: Tính tổng S=1 + 1/2+...+1/n");
                System.out.println("3 - Bài 3: Tính tổng S=1/2 + 3/4 + 5/6 +…+ (2n + 1)/(2n + 2)");
                System.out.println("4 - Bài 4: Đảo ngược số");
                System.out.println("5 - Bài 5: Kiểm tra số đối xứng");
                System.out.println("6 - Bài 6: Tìm số chẵn cuối cùng trong mảng 1 chiều");
                System.out.println("7 - Bài 7: Tìm số âm đầu tiên trong mảng 1 chiều");
                System.out.println("9 - Bài 9: In ra hình tam giác cân");
                System.out.println("10 - Bài 10: In ra hình chữ nhật");
                System.out.println("0 - Thoát chương trình");
                System.out.print("Lựa chọn của bạn là: ");
            }
        }


