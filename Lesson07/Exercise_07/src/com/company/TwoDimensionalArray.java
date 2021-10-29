package com.company;

import java.util.Scanner;

public class TwoDimensionalArray
{
    public static int[][] input(int r, int c)
    {
        Scanner sc=new Scanner(System.in);
        int arr[][] = new int[r][c];
        for (int i=0; i<r; i++)
        {
            for (int j=0; j<c; j++)
            {
                System.out.print("Nhập giá trị mảng tại ("+(i+1)+","+(j+1)+"): ");
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }

    public static void display(int arr[][])
    {
        System.out.println("\nMảng đã nhập");
        for (int i=0; i< arr.length;i++)
        {
            for (int j=0; j<arr[i].length;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }

    public static void mainDiagonal(int arr[][])
    {
        if (arr.length!=arr[0].length)
            System.out.println("\nMảng không phải ma trận vuông, không có đường chéo chính");
        else
        {
            System.out.print("\nCác phần tử trên đường chéo chính của mảng: ");
            for (int i=0;i< arr.length;i++)
                System.out.print(arr[i][i]+" ");
        }
    }
}
