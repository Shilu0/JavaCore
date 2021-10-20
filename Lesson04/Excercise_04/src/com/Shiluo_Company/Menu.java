package com.Shiluo_Company;

import java.util.Scanner;

public class Menu {
    public static void pick()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("HÃY NHẬP SỐ CHỌN CHƯƠNG TRÌNH CẦN CHẠY");
        System.out.println("Số 1 - Kiểm tra 3 cạnh của 1 tam giác");
        System.out.println("Số 2 - Kiểm tra xếp loại học sinh");
        System.out.println("Số 3 - Giải phương trình bậc 2");

        int number=sc.nextInt();

        switch (number)
        {
            case 1: Triangle.check();
                break;
            case 2: Student.classify();
                break;
            case 3: QuadraticEquation.solution();
                break;
            default:
                System.out.println("Số nhập không phù hợp");
        }

    }
}
