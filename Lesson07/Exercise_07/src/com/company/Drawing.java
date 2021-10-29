package com.company;

public class Drawing
{
    public static void squareTriangle(int n)
    {
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=i; j++)
                System.out.print(" * ");
            System.out.println();
        }
    }

    public static void isoTriangle(int n)
    {
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=n*2-1; j++)
            {
                if ((j>n-i) && (j<n+i) && (i+j-n-1)%2==0)
                {
                    System.out.print(" *");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }

    public static void square(int n)
    {
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=n; j++)
                System.out.print(" * ");
            System.out.println();
        }
    }
}
