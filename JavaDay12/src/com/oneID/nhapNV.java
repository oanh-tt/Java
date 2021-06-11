package com.oneID;
import java.util.InputMismatchException;
import java.util.Scanner;

public class nhapNV {
    static void maNV(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập số lượng nhân viên: ");
            int n = sc.nextInt();
            sc.nextLine();
            String [] arr = new String[n];
            for (int i=0;i<n;i++){
                System.out.println("Nhập mã nhân viên: ");
                arr[i]= sc.nextLine();
                if ( arr[i].matches("NV\\d{7}")){
                    for (int j =0; j< i;j++){
                        if(arr[j].equals(arr[i])) {
                            System.out.println("Trùng mã nhân viên rồi bạn ơi");
                        }
                    }
                } else {
                    System.out.println("Nhập sai mã, nhập lại đi nhé");
                }
            }
            System.out.println("DS mã nhân viên:");
            for (int i=0;i<arr.length; i++) {
                System.out.println(arr[i]);
            }
        }catch (InputMismatchException ex1){
            System.out.println("Số lượng nhân viên phải là một số"+ ex1.getCause());
        }catch (NegativeArraySizeException ex2){
            System.out.println("Kicks thươc mang phải lớn hơn 0");
        }
    }

            }


