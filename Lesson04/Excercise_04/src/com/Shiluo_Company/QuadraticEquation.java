package com.Shiluo_Company;

import java.util.Scanner;

public class QuadraticEquation {
    public static void solution()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập tham số của phương trình bậc 2 cần giải");
        System.out.print("a = ");
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();
        System.out.print("c = ");
        double c = sc.nextDouble();

        if (a==0)
            System.out.println("Nhập sai tham số, a phải khác 0");
        else
        {
            double d = b*b-4*a*c;
            if (d<0)
                System.out.println("Phương trình vô nghiệm");
            if (d==0)
                System.out.println("Phương trình có 1 nghiệm kép là x = "+(-b/(2*a)));
            if (d>0)
            {
                System.out.println("Phương trình có 2 nghiệm");
                System.out.println("x1 = "+((-b+Math.sqrt(d))/(2*a)));
                System.out.println("x2 = "+((-b-Math.sqrt(d))/(2*a)));
            }
        }
    }
}
