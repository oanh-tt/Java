package com.oneID;

public class Main {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Circle cir = new Circle();
        System.out.println("Chu vi HCN:" + rect.perimeterRect() + "cm");
        System.out.println("Diện tích HCN:" + rect.superficialityRect() + "cm2");
        System.out.println("Chu vi hình tròn:" + cir.Circuit() + "cm");
        System.out.println("Diện tích hình tròn:" + cir.superficialityCir() + "cm2");
    }
}
