package com.oneID;

public class Bai9 {
    static void intamgiaccan(int hight){
        int k=0;
        for (int i=1;i<=hight;i++,k=0){
            for (int j=1;j<=hight-i;j++){
                System.out.print("  ");
            }
            while (k!=2*i-1){
                System.out.print("* ");
                k++;
            }
            System.out.println();
        }
    }
}
