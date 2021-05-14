package com.oneID;

public class Songuyento {
    // In ra n số nguyên tố đầu tiên
    static void nsonguyentowhile(int n){
        int i =2;
        int dem=0;
        System.out.println(n + " số nguyên tố đầu tiên chạy while:");
        while (dem<n){
            if (checksonguyento(i)){
                System.out.println(" "+i);
                dem++;
            }
            i++;
        }
    }
    static void nsonguyentodowhile(int n){
        int i =2;
        int dem=0;
        System.out.println(n + " số nguyên tố đầu tiên chạy dowhile:");
        do {
            if (checksonguyento(i)){
                System.out.println(" "+i);
                dem++;
            }
            i++;
        } while (dem<n);
    }
    // in ra n số nguyên tố đầu tiên dùng for
    static void nsonguyentofor(int n) {
        int i=2;
        System.out.println(n + " số nguyên tố đầu tiên chạy for:");
        for (int dem = 0; dem < n; i++) {
            if (checksonguyento(i)) {
                System.out.println(" " + i);
                dem++;
            }
        }
    }


    //Liệt kê các số nguyên tố nhỏ hơn 100
    static void nguyentonho100for(){
        System.out.println("Các số nguyên tố nhỏ hơn 100 chạy for: ");
        for (int i=2;i<=100;i++){
            if (checksonguyento(i)){
                System.out.println(i);
            }
        }
    }
    static void nguyentonho100while(){
        int i=2;
        System.out.println("Các số nguyên tố nhỏ hơn 100 chạy while: ");
        while (i<100){
            if (checksonguyento(i)){
                System.out.println(" "+i);
            }
            i++;
        }
    }
    static void nguyentonho100dowhile(){
        int i=2;
        System.out.println("Các số nguyên tố nhỏ hơn 100 chạy dowhile: ");
        do {
            if (checksonguyento(i)){
                System.out.println(" "+i);
            }
            i++;
        } while (i<100);
    }
    static boolean checksonguyento(int number) {
        if (number < 2) {
            return false;
        }
        for (int i=2;i<=Math.sqrt(number);i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
