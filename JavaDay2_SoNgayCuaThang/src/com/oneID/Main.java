package com.oneID;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Songaycuathang month = new Songaycuathang();
        songaycuathangifelse month1 = new songaycuathangifelse();
        canhtamgiac tamgiac = new canhtamgiac();
        phuongtrinhbachai ptb2= new phuongtrinhbachai();
        month.Hienthisongaycuathang(3);
        month.Hienthisongaycuathang(2);
        month1.Hienthisongaycuathangifelse(7);
        month1.Hienthisongaycuathangifelse(15);
        tamgiac.bacanhtamgia(2,3,4);
        tamgiac.bacanhtamgia(1,1,3);
        ptb2.giaiphuongtrinhbac2(2,3,4);
        ptb2.giaiphuongtrinhbac2(2,1,-1);
        ptb2.giaiphuongtrinhbac2(1,2,1);
    }
}
