package com.Shiluo_Company;

import java.util.Scanner;

public class Student {
    public static void classify()
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Nhập điểm Toán: ");
        double mathMark=sc.nextDouble();
        System.out.print("Nhập điểm Văn: ");
        double literatureMark=sc.nextDouble();
        System.out.print("Nhập điểm Lý: ");
        double physicsMark=sc.nextDouble();
        System.out.print("Nhập điểm Hóa: ");
        double chemistryMark=sc.nextDouble();
        double averageMark=(mathMark+literatureMark+physicsMark+chemistryMark)/4;

        if (averageMark < 4.5)
            System.out.println("Học sinh xếp hạng Yếu");
        if (averageMark >= 4.5 && averageMark <6.5)
            System.out.println("Học sinh xếp hạng Trung bình");
        if (averageMark >= 6.5 && averageMark <8)
            System.out.println("Học sinh xếp hạng Khá");
        if (averageMark >= 8)
            System.out.println("Học sinh xếp hạng Giỏi");
    }
}
