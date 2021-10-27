package com.Shiluo_Company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Nhập kích thước mảng số nguyên n= ");
        int n= sc.nextInt();
        int arr1[]=new int[n];
        practiceArray.input(arr1);
        practiceArray.display(arr1);
        System.out.println("\nGiá trị bé nhất của mảng: "+practiceArray.min(arr1));
        System.out.println("Giá trị lớn nhất của mảng: "+practiceArray.max(arr1));

        System.out.print("Nhập số lượng phương tiện khai báo: ");
        int m= sc.nextInt();
        Vehicles arr2[]=new Vehicles[m];
        Vehicles.inputVehicle(arr2);
        for (Vehicles s:arr2)
            System.out.println(s);
    }
}
