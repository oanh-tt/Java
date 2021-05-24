package com.oneID;

import java.util.Scanner;

public class Mang1chieu {
    static void nhapmang1chieu(int arr[]){
        Scanner sc=new Scanner(System.in);
        for (int i=0;i< arr.length;i++){
            System.out.printf("Nhập phần từ thứ %d: ",i);
            arr[i]=sc.nextInt();
        }
    }
    static void Insonguyento(int arr[]){
        System.out.println("\nIn ra các phần tử của mảng là số nguyên tố: ");
        int tong=0;
        for (int i=0;i< arr.length;i++){
            if (Main.checksonguyento(arr[i])){
                System.out.print("\t"+arr[i]);
                tong+=arr[i];
            }
        }
        System.out.print("\nTổng của các phần tử là số nguyên tố là: "+tong);
    }
    static void suamang(int arr[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("\nNhập vị trí muốn sửa: ");
        int k=sc.nextInt();
        if (k>0&&k<arr.length){
            System.out.printf("Nhập giá trị muốn sửa tại vị trí %d: ",k);
            arr[k]= sc.nextInt();
            System.out.println("Mảng sau khi sửa: ");
            show(arr);
        } else {
            System.out.println("Không tồn tại vị trí này trong mảng");
        }
    }
    static void show(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print("\t"+arr[i]+" ");
        }
    }
}
