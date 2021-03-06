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
                case 6:
                    Bai10.tongcacchusocua1so();
                    break;
                case 7:
                    Bai12.phuongtrinhbacnhat();
                    break;
                case 8:
                    Bai13.tongsochiahet3();
                    break;
                case 9:
                    Bai14.kiemtranguyenamnguyenduong();
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
        System.out.println("6 - Bài 10: Tính tổng các chữ số trong 1 số bất kỳ");
        System.out.println("7 - Bài 12: Viết chương trình giải phương trình bậc nhất");
        System.out.println("8 - Bài 13: Tính tổng các số từ 0-n mà chia hết cho 3");
        System.out.println("9 - Bài 14: Kiểm tra 1 số bất kỳ là số nguyên âm hay nguyên dương");
        System.out.println("0 - Thoát chương trình");
        System.out.print("Lựa chọn của bạn là: ");

    }
    }

