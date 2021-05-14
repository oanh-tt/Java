package com.oneID;

import java.util.Scanner;

public class tinhgiaithua {
    static long giathuafor(){
        int i, n;
        long fact=1;
        System.out.println("Tính giai thừa chạy for");
        System.out.println("Nhập vào số n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(n+"!= "+fact);
        return 0;
    }
    static long giathuawhile(){
        int i =1, n;
        long fact=1;
        System.out.println("Tính giai thừa chạy while");
        System.out.println("Nhập vào số n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (i<=n){
            fact=fact*i;
            i++;
        }
        System.out.println(n+"!= "+fact);
        return 0;
    }
    static long giathuadowhile(){
        int i =1, n;
        long fact=1;
        System.out.println("Tính giai thừa chạy do while");
        System.out.println("Nhập vào số n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        do {
            fact=fact*i;
            i++;
        }while (i<=n);
        System.out.println(n+"!= "+fact);
        return 0;
    }
}
