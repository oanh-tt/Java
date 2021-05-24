package com.oneID;

import java.util.Scanner;

public class Bai4 {
    static int Daonguocso(int n){
        int reversed=0;
        while (n!=0){
            int temp=n%10;
            reversed=reversed*10+temp;
            n=n/10;
        }
        return reversed;
    }
}
