package com.oneID;

public class phuongtrinhbachai {
    void giaiphuongtrinhbac2(double a, double b, double c){
        double delta = b*b-4*a*c;
        if (delta<0) {
            System.out.println("phương trình vô nghiệm.");
        }
        else if(delta==0){
            double x1= -b/2*a;
            System.out.println("Phương trình có nghiệm duy nhất x1=x2=" + x1);
        }
        else{
            double x1 = ((-b + Math.sqrt(delta)) / (2*a));
            double x2 = ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println(("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2));
        }
    }
}
