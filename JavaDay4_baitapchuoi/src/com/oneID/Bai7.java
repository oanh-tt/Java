package com.oneID;

import java.util.Scanner;

public class Bai7 {
    static void tamgiac(){
        System.out.println("\n Bài 7: Nhập vào 3 cạnh, xác định đó có phải 3 cạnh tam giác, tam giac vuông,cân,đều");
        System.out.print("Nhập vào 3 số: \t");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b>c && b+c>a && c+a>b){
            if(a==b && b==c){
                System.out.println("Đây là tam giác đều");
            }
            else if(a==b||b==c||c==a){
                System.out.println("Đây là tam giác cân");
            }
            else if(a==Math.sqrt(b*b+c*c)||b==Math.sqrt(a*a+c*c)||c==Math.sqrt(a*a+b*b)){
                System.out.println("Đây là tam giác vuông");
            }
            else {
                System.out.println("Đây là tam giác thường");
            }
        }
        else {
            System.out.println("Đây không là tam giác");
        }
    }
}
