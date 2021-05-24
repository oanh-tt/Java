package com.oneID;

public class Bai3 {
    static void Tongbai3(int n){
        float tong=0.0f;
        for (int i=0;i<=n;i++){
            tong+=(float) (2*i + 1)/(2*i + 2);
        }
        System.out.println("In ra tổng các phân số (2*n + 1)/(2*n + 2): "+tong);
    }
}
