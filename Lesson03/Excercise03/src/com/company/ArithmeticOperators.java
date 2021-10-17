package com.company;

import java.util.Scanner;

public class ArithmeticOperators {

    static Scanner sc=new Scanner(System.in);

    public static void addition()
    {
        System.out.println("\nTÍNH TỔNG 2 SỐ NGUYÊN");
        System.out.print("Nhập số nguyên thứ nhất: ");
        int x=sc.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int y=sc.nextInt();
        System.out.println("Tổng của "+x+" và "+y+" là: "+(x+y));
    }

    public static void subtraction()
    {
        System.out.println("\nTÍNH HIỆU 2 SỐ NGUYÊN");
        System.out.print("Nhập số nguyên thứ nhất: ");
        int x=sc.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int y=sc.nextInt();
        System.out.println("Hiệu của "+x+" và "+y+" là: "+(x-y));
    }

    public static void multiplication()
    {
        System.out.println("\nTÍNH TÍCH 2 SỐ NGUYÊN");
        System.out.print("Nhập số nguyên thứ nhất: ");
        int x=sc.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int y=sc.nextInt();
        System.out.println("Tích của "+x+" và "+y+" là: "+(x*y));
    }

    public static void division()
    {
        System.out.println("\nTÍNH THƯƠNG 2 SỐ NGUYÊN");
        System.out.print("Nhập số nguyên thứ nhất: ");
        int x=sc.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int y=sc.nextInt();
        String str = (y==0) ? "Không thể thực hiện phép chia cho 0" : "Thương của "+x+" và "+y+" là: "+(double)x/y;
        System.out.println(str);
    }

    public static void allOperators()
    {
        System.out.println("\nCÁC PHÉP TOÁN VỚI 2 SỐ NGUYÊN");
        System.out.print("Nhập số nguyên thứ nhất: ");
        int x=sc.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int y=sc.nextInt();
        System.out.println("Tổng của "+x+" và "+y+" là: "+(x+y));
        System.out.println("Hiệu của "+x+" và "+y+" là: "+(x-y));
        System.out.println("Tích của "+x+" và "+y+" là: "+(x*y));
        String str = (y==0) ? "Không thể thực hiện phép chia cho 0" : "Thương của "+x+" và "+y+" là: "+(double)x/y;
        System.out.println(str);
    }

}
