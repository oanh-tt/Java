package com.oneID;

public class fibonaci {
    static void nsodayfibonacifor(int n){
        System.out.println(n + " số đầu tiên dãy fibonaci chạy for:");
      for (int i=0;i<n;i++){
         System.out.println(fibonacci(i)+ "");
      }
    }
    static void nsofibonaciwhile(int n){
        int i=0;
        System.out.println(n + " số đầu tiên dãy fibonaci chạy while:");
        while (i<n){
            System.out.println(fibonacci(i)+ "");
            i++;
        }
    }
    static void nsofibonacidowhile(int n){
        int i=0;
        System.out.println(n + " số đầu tiên dãy fibonaci chạy dowhile:");
        do {
            System.out.println(fibonacci(i)+ "");
            i++;
        }while (i<n);
    }
    static void daysofibonacinho100for(){
        System.out.println("Dãy fibonaci nhỏ hơn 100 chạy for:");
        for (int i=0;fibonacci(i)<100;i++) {
                System.out.println(fibonacci(i));
            }
        }
    static void daysofibonacinho100while(){
        int i=0;
        System.out.println("Dãy fibonaci nhỏ hơn 100 chạy while:");
        while (fibonacci(i)<100){
            System.out.println(fibonacci(i));
            i++;
        }
    }
    static void daysofibonacinho100dowhile(){
        int i=0;
        System.out.println("Dãy fibonaci nhỏ hơn 100 chạy dowhile:");
        do {
            System.out.println(fibonacci(i));
            i++;
        }while (fibonacci(i)<100);
    }
    public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }

}
