package com.company;

public class Circle {
    int r =8;
    float pi=3.14f;
    float Circuit(){
        float C;
        C = 2*r*pi;
        return C;
    }
    float superficialityCir(){
        float S;
        S = r*r*pi;
        return S;
    }

}
