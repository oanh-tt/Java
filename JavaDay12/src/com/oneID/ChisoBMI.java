package com.oneID;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChisoBMI {
    static float BMI(){
        float weight,height,chisoBMI;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cân nặng: ");
        while (true) {
            try {
                weight = sc.nextFloat();
                if (weight <= 0) throw new ArithmeticException();
                break;
            }catch (InputMismatchException ip){
                ip.fillInStackTrace();
                continue;
            }catch (ArithmeticException im){
                System.out.println("Cân nặng phải lớn hơn 0");
                continue;
            }
        }
        System.out.println("Nhập chiều cao: ");
        while (true) {
            try {
                height = sc.nextFloat();
                if (height <= 0) throw new ArithmeticException();
                break;
            }catch (InputMismatchException ip){
                ip.fillInStackTrace();
                continue;
            }catch (ArithmeticException im){
                System.out.println("Chiều cao phải lớn hơn 0");
                continue;
            }
        }
        chisoBMI = weight/(height*height);
        return chisoBMI;
    }
}
