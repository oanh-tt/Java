package com.oneID;

public class Bai6 {
    static void bangcuuchuongfor(){
        System.out.println("\nBài 6: In bảng cửu chương");
        for (int i=2;i<=9;i++){
            System.out.println();
            for (int j=1;j<=10;j++){
                System.out.printf("%d * %d = %d \n", i, j, i * j);
            }
        }
    }
}
