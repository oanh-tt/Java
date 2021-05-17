package com.oneID;

import java.util.Scanner;

public class Bai13 {
    static void tongsochiahet3(){
        int tong=0;
        System.out.println("\nBài 13: Tính tổng các số từ 0-n mà chia hết cho 3");
        System.out.print("Nhập số n: \t");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<=n;i++){
            if (i%3==0){
                tong= tong+i;
            }
        }
        System.out.println("Tổng của các số chia hết cho 3: "+tong);
    }
}
