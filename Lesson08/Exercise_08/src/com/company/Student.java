package com.company;

import java.util.Scanner;

public class Student
{
    String id;
    String name;
    float theoryMark;
    float practicalMark;

    public Student(String id, String name, float theoryMark, float practicalMark)
    {
        this.id = id;
        this.name = name;
        this.theoryMark = theoryMark;
        this.practicalMark = practicalMark;
    }

    public static Student[] input(int n)
    {
        Scanner sc=new Scanner(System.in);
        Student std[]=new Student[n];
        for (int i=0; i<n; i++)
        {
            System.out.println("\nNhập thông tin học viên thứ "+(i+1));
            System.out.print("Nhập id: ");
            String inputId=sc.nextLine();
            System.out.print("Nhập họ và tên: ");
            String inputName=sc.nextLine();
            System.out.print("Nhập điểm lý thuyết: ");
            float inputThMark=sc.nextFloat();
            System.out.print("Nhập điểm thực hành: ");
            float inputPrMark=sc.nextFloat();
            sc.nextLine();
            std[i]=new Student(inputId,inputName,inputThMark,inputPrMark);
        }
        return std;
    }

    public static float mediumMark(float thMark, float prMark)
    {
        return (thMark+prMark)/2;
    }

    public String toString()
    {
        return "Id: "+id+"\nHọ và tên: "+name+"\nĐiểm lý thuyết: "+theoryMark+"\nĐiểm thực hành: "+practicalMark+"\nĐiểm trung bình: "+mediumMark(theoryMark,practicalMark);
    }

    public static void display(Student std[])
    {
        for (int i=0; i< std.length;i++)
        {
            System.out.println("\nThông tin học viên thứ "+(i+1)+":");
            System.out.println(std[i]);
        }
    }

}
