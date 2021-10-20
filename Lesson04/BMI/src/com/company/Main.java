package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập chiều cao: ");
        double height=sc.nextDouble();
        System.out.println("Nhập cân nặng: ");
        double weight=sc.nextDouble();
        double bmi =  weight/(height*height);

        if (bmi<18.5)
            System.out.println("Bạn gầy quá, cần ăn thêm!");
        if (bmi>=18.5 && bmi<24.9)
            System.out.println("Người bạn ngon quá");
        if (bmi>=24.9 && bmi<39.9)
            System.out.println("Bạn đang bị béo phì");
        if (bmi>=39.9)
            System.out.println("Bạn quá béo, rất nguy hiểm");

    }
}
