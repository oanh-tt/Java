package com.oneID;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            menu();
            int choose = sc.nextInt();
            switch (choose) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    Bai5_15.indexfor();
                    Bai5_15.indexwhile();
                    Bai5_15.indexdowhile();
                    break;
                case 2:
                    Bai8.demtufor();
                    Bai8.demtuwhile();
                    Bai8.demtudowhile();
                    break;
                case 3:
                    Bai6.bangcuuchuongfor();
                    break;
                case 4:
                    Bai7.tamgiac();
                    break;
                case 5:
                    Bai9.chuanhoachuoi();
                    break;
            }
        }

    }

    static void menu(){
        System.out.println("\nNhập lựa chọn: ");
        System.out.println("1 - Bài 5-15: In ra màn hình tất cả vị trí của 'o' và tổng số");
        System.out.println("2 - Bài 8: Đếm từ trong chuỗi");
        System.out.println("3 - Bài 6: In bảng cửu chương");
        System.out.println("4 - Bài 7: Nhập vào 3 cạnh, xác định đó có phải 3 cạnh tam giác, tam giac vuông,cân,đều");
        System.out.println("5 - Bài 9: Chuẩn hóa chuỗi");
        System.out.println("0 - Thoát chương trình");
        System.out.print("Lựa chọn của bạn là: ");

    }
    }

