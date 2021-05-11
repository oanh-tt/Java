package com.oneID;

public class canhtamgiac {
    void bacanhtamgia(double a, double b, double c){
        if(a+b>c&&b+c>a&&c+a>b){
            System.out.println("Ba số " +a+ " " +b+ " " +c+ " là 3 cạnh của 1 tam giác");
        }
        else {
            System.out.println("Ba số " +a+ " " +b+ " " +c+ " không là 3 cạnh của 1 tam giác");
        }
    }
}
