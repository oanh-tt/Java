package com.oneID;

import java.util.Scanner;

public class Bai10 {
    static void tongcacchusocua1so(){
        System.out.println("\nBài 10: Tính tổng các chữ số trong 1 số bất kỳ");
        int tong=0;
        int sodu;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương bất kỳ: \t");
        int n= sc.nextInt();
        while (n>0){
            sodu= n%10;
            n=n/10;
            tong += sodu;
        }
        System.out.println("Tổng các chữ số của số trên là: "+tong);
    }
}
