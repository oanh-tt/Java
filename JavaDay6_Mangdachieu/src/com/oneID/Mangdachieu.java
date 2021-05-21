package com.oneID;

import java.util.Scanner;

public class Mangdachieu {

    static void Nhapmatran(int[][] arr, int hang, int cot) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.printf("Nhap phan tu o vi tri arr[%d][%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }

    }

    static void Inmatran(int[][] arr, int hang, int cot) {
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void Duongcheo(int[][] arr, int hang, int cot) {
        int tong = 0;
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + "\t");
                    tong += arr[i][j];
                }
            }
        }
        System.out.println("\nTổng đường chéo chính: " + tong);
    }

    static void Sapxephang(int[][] arr, int hang, int cot) {
        int i = 1;
        int temp;
        if (hang > 2) {
            for (int j = 0; j < cot; j++) {
                for (int k = j + 1; k < cot; k++)
                    if (arr[i][j] > arr[i][k]) {
                        temp = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = temp;
                    }
                System.out.print("\t" + arr[i][j]);
            }
        } else {
            System.out.println("Không có hàng 2");
        }
    }

    static void Insonguyento(int[][] arr, int hang, int cot) {
        int tong = 0;
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                if (Main.checksonguyento(arr[i][j])) {
                    System.out.print("\t"+arr[i][j]);
                    tong+=arr[i][j];
                }
            }
        }
        System.out.println("\nTổng các số nguyên tố của ma trận A: "+tong);
    }
}
