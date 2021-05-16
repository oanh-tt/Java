package com.oneID;

import java.util.Scanner;

public class Bai8 {
    static void demtufor() {
        System.out.println("\n Bài 8:");
        System.out.println("1. Đếm từ trong chuỗi chạy for:");
        System.out.print("- Nhập vào 1 chuỗi: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str.trim();
        int dem=0;
        char ch[] = new char[str.length()];
        for(int i=0;i<str.length();i++) {
            ch[i] = str.charAt(i);
            if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0))) {
                dem++;
            }
        }
        System.out.printf("- Số từ trong chuỗi trên là: %s", dem);
    }
// Đếm từ trong chuỗi chạy while
static void demtuwhile() {
    System.out.println("\n2. Đếm từ trong chuỗi chạy while:");
    System.out.print("- Nhập vào 1 chuỗi: ");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    str.trim();
    int i=0;
    int dem=0;
    char ch[] = new char[str.length()];
    while(i<str.length()) {
        ch[i] = str.charAt(i);
        if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0))) {
            dem++;
        }
        i++;
    }
    System.out.printf("- Số từ trong chuỗi trên là: %s", dem);
}
    static void demtudowhile() {
        System.out.println("\n3. Đếm từ trong chuỗi chạy dowhile:");
        System.out.print("- Nhập vào 1 chuỗi: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str.trim();
        int i=0;
        int dem=0;
        char ch[] = new char[str.length()];
        do {
            ch[i] = str.charAt(i);
            if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0))) {
                dem++;
            }
            i++;
        }while(i<str.length());
        System.out.printf("- Số từ trong chuỗi trên là: %s", dem);
    }
}
