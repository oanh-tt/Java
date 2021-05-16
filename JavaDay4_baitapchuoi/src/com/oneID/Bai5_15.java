package com.oneID;

public class Bai5_15 {
    static String str = "You only live once, but if you do it right, once is enough";

    // In ra màn hình Ixdex của ký tự o trong chuỗi chạy for
    static void indexfor() {
        System.out.println("\nBài 5-15:");
        int dem=0;
        System.out.print("1. Vị trí của tất cả 'o' trong chuỗi chạy for: ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o') {
                System.out.print(i + "\t");
                dem++;
            }
        }
        System.out.println("\n- Số ký tự 'o' có trong chuỗi: "+dem);
    }

    // In ra màn hình Ixdex của ký tự o trong chuỗi chạy while
    static void indexwhile() {
        int i=0;
        int dem=0;
        System.out.print("\n2. Vị trí của tất cả 'o' trong chuỗi chạy while: ");
        while (i < str.length()) {
            if (str.charAt(i) == 'o') {
                System.out.print(i + "\t");
                dem++;
            }
            i++;
        }
        System.out.println("\n- Số ký tự 'o' có trong chuỗi: "+dem);
    }
    // In ra màn hình Ixdex của ký tự o trong chuỗi chạy dowhile
    static void indexdowhile() {
        int i=0;
        int dem=0;
        System.out.print("\n3. Vị trí của tất cả 'o' trong chuỗi chạy dowhile: ");
        do {
            if (str.charAt(i) == 'o') {
                System.out.print(i + "\t");
                dem++;
            }
            i++;
        }
            while(i < str.length());
        System.out.println("\n- Số ký tự 'o' có trong chuỗi: "+dem);
        }
    }

