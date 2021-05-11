package com.oneID;

public class songaycuathangifelse {
    void Hienthisongaycuathangifelse(int month){
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            System.out.println("Tháng " + month + " có 31 ngày");
        }
        else if(month==4||month==6||month==9||month==11){
            System.out.println("Tháng " + month + " có 30 ngày");
        }
        else if (month==2){
            System.out.println("Tháng " + month + " có 28 hoặc 29 ngày");
        }
        else System.out.println("Không có tháng " + month);
    }
}
