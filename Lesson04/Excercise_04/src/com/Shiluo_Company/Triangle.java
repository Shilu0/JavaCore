package com.Shiluo_Company;

import java.util.Scanner;

public class Triangle {
    public static void check()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Nhập 3 cạnh của tam giác: ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();

        if (a<=0|b<=0|c<=0)
            System.out.println("Nhập sai giá trị, cạnh tam giác phải là số dương");
        else {

            if (a >= (b + c) | b >= (c + a) | c >= (a + b))
                System.out.println("Đây không phải là 3 cạnh của 1 tam giác");
            else
            {
                if (a == b && a == c)
                    System.out.println("Đây là tam giác đều");
                else
                {
                    if (a == b | b == c | c == a)
                    {
                        if (a*a + b*b == c*c | b*b + c*c == a*a | c*c + a*a == b*b)
                            System.out.println("Đây là tam giác vuông cân");
                        else System.out.println("Đây là tam giác cân");
                    }
                    else
                    {
                        if (a*a + b*b == c*c | b*b + c*c == a*a | c*c + a*a == b*b)
                            System.out.println("Đây là tam giác vuông");
                        else
                            System.out.println("Đây là tam giác thường");
                    }
                }
            }
        }
    }

}
