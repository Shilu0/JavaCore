package com.Shiluo_Company;

import java.util.Scanner;

public class practiceArray
{
    public static void input(int arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập giá trị các phần tử của mảng:");
        for (int i=0; i< arr.length; i++)
        {
            System.out.print("Nhập giá trị các phần tử thứ "+(i+1)+" của mảng: ");
            arr[i]=sc.nextInt();
        }
    }

    public static void display(int arr[])
    {
        System.out.println("Các phần tử của mảng đã nhập:");
        for (int x:arr)
            System.out.print(x+" ");
    }

    public static int min(int arr[])
    {
        int min=arr[0];
        for (int x : arr)
        {
            if (x<min)
                min=x;
        }
        return min;
    }

    public static int max(int arr[])
    {
        int max=arr[0];
        for (int x : arr)
        {
            if (x>max)
                max=x;
        }
        return max;
    }

}