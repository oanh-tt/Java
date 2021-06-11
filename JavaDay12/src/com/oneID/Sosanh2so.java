package com.oneID;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Sosanh2so {
    static void ss2so() throws  NumberCheckingException{
        Random rd =new Random();
        int sonn = 10 + rd.nextInt((int) (Math.random() * ((50 - 10) + 1)));
        System.out.println("Số ngẫu nhiên: "+sonn);
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập số tự nhiên: "+sc);
            int n = sc.nextInt();
            while (n<10||n>50) {
                System.out.println("Nhập số từ 10 --> 50 bạn nhé: ");
                n = sc.nextInt();
            }
            if (sonn==n){
                System.out.println("Số ngẫu nhiên = số nhập vào");
            }else if (sonn<n){
                System.out.println("Số ngẫu nhiên < số nhập vào");
            }else {
                System.out.println("Số ngẫu nhiên > số nhập vào");
            }

        }catch (InputMismatchException e){
            throw new NumberCheckingException("Nhập vào phải là chữ số");
        }
    }
}
