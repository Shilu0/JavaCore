package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập số lượng học viên: ");
        int n= sc.nextInt();
        Student.display(Student.input(n));
    }
}
