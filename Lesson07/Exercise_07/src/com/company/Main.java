package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

//  Bài 1: Vẽ tam giác vuông, tam giác đều, hình vuông
        Drawing.squareTriangle(4);
        System.out.println();

        Drawing.isoTriangle(4);
        System.out.println();

        Drawing.square(4);

//  Bài 2: Chuẩn hóa tên, kiểm tra chuỗi Pallindrome
        System.out.println("Nhập tên bạn cần chuẩn hóa: ");
        String name=sc.nextLine();
        System.out.println("Tên đã nhập: "+name);
        System.out.print("Tên đã chuẩn hóa: ");
        System.out.println(StringPractice.standardize(name));

        System.out.println("Nhập chuỗi cần kiểm tra: ");
        String str=sc.nextLine();
        StringPractice.pallindrome(str);

//  Bài 3: Liệt kê số nguyên tố
        PrimeNumber.display(10);
        System.out.println();
        PrimeNumber.count(10);

//  Bài 4: Đến chữ, đếm ký tự
        StringPractice.countString("You only live once, but if you do it right, once is enough",'o');

//  Bài 5: Kiểm tra số nguyên tố ngẫu nhiên
        Random.checkPrimeRandom();

//  Bài 6: Kiểm tra email hợp lệ
        System.out.print("Nhập email cần kiểm tra: ");
        String email= sc.nextLine();
        Email.validateEmail(email);

//  Bài 7: Nhập, in mảng; đường chéo mảng
        System.out.print("Nhập số hàng của mảng: ");
        int r= sc.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int c= sc.nextInt();
        int arr[][]=TwoDimensionalArray.input(r,c);
        TwoDimensionalArray.display(arr);
        TwoDimensionalArray.mainDiagonal(arr);
    }
}
