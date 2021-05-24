package com.oneID;

public class Bai2 {
    static void Tongbai2(int n){
        float tong=0.0f;
        for (int i=1;i<=n;i++){
            tong+=1.0/i;
        }
        System.out.println("In ra tổng các phân số 1/n: "+tong);
    }
}
