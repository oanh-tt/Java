package com.oneID;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int intarr[];
        int n;
        nhapmang();
    }
    static void nhapmang() {
        System.out.println("Nhập số phần tử của mảng: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int intarr[] = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < intarr.length; i++) {
            intarr[i] = sc.nextInt();
        }
        System.out.println("Các phần từ của mảng: ");
        for (int i = 0; i < intarr.length; i++) {
            System.out.print("\t" + intarr[i]);
        }
//In phần từ lớn nhất và index của nó và phần tử lớn thứ 2 và index của nó
        int max1;
        int index1;
        int max2;
        int index2;
        if (intarr[0] > intarr[1]) {
            max1 = intarr[0];
            index1 = 0;
            max2 = intarr[1];
            index2 = 1;
        } else {
            max1 = intarr[1];
            index1 = 1;
            max2 = intarr[0];
            index2 = 0;
        }
        for (int i = 2; i < intarr.length; i++) {
            if (max1 < intarr[i]) {
                max2 = max1;
                index2 = index1;
                max1 = intarr[i];
                index1 = i;
            }
            else if (max2 < intarr[i] && intarr[i]!=max1) {
                max2 = intarr[i];
                index2 = i;
            }
        }
        System.out.printf("\nPhần tử lớn nhất của mảng là phần tử thứ %d: %s", index1, max1);
        System.out.printf("\nPhần tử lớn thứ 2 của mảng là phần tử thứ %d: %s", index2, max2);


// In ra phần tử nhỏ nhất của mảng và index của nó
    int min=intarr[0];
    int index=0;
    for (int i=1;i<intarr.length;i++){
        if(intarr[i]<min){
            min=intarr[i];
            index=i;
        }
    }
        System.out.printf("\nPhần tử nhỏ nhất của mảng là phần tử thứ %d: %s",index,min);
    }
    }


