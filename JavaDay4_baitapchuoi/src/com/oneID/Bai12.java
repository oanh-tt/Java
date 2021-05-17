package com.oneID;

import java.util.Scanner;

public class Bai12 {
    static void phuongtrinhbacnhat(){
        System.out.println("\nBài 12: Viết chương trình giải phương trình bậc nhất");
        System.out.print("Nhập 2 số a,b: \t");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        if(a==0){
            if(b==0){
                System.out.println("Phương trình có vô số nghiệm");
            }
            else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
        else {
            if (b==0){
                System.out.println("Phương trình có nghiệm x= 0");
            }
            else {
                float x=(float) -b/a;
                System.out.println("Phương trình có nghiệm x= "+x);
            }
        }
    }
}
