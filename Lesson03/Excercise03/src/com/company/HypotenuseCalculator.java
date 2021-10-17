package com.company;

import java.util.Scanner;

public class HypotenuseCalculator{
    public static void hypotenuse()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("\nTÍNH CHIỀU DÀI CẠNH HUYỀN TAM GIÁC VUÔNG");

        System.out.print("Nhập chiều dài cạnh góc vuông thứ nhất: ");
        double a=sc.nextDouble();

        System.out.print("Nhập chiều dài cạnh góc vuông thứ hai: ");
        double b=sc.nextDouble();

        String str = (a>0 && b>0) ? "Chiều dài cạnh huyền là: "+Math.sqrt(a*a+b*b) : "Nhập sai giá trị cạnh góc vuông";
        System.out.println(str);
    }
}
