package com.oneID;

import java.util.Scanner;

public class Bai6 {
    static void nhapmang(int arr[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i);
            arr[i] = sc.nextByte();
        }
    }

    static void inmang(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }
    }

    static int sochancuoicung(int arr[]) {
        int num = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                num = arr[i];
                break;
            }
        }
            return num;

    }
    static int soamdautien(int arr[]){
        int num=1;
        for (int i=0;i< arr.length;i++){
            if(arr[i]<0){
                num=arr[i];
                break;
            }
        }
        return num;
    }
}
