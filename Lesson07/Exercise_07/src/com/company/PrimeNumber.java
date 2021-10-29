package com.company;

public class PrimeNumber
{
    public static boolean isPrime(int p)
    {
        if (p<2)
            return false;
        else
        {
            int count=0;
            for (int i=2; i<=p/2; i++)
            {
                if (p%i==0)
                    count++;
            }
            return (count==0);
        }
    }

    public static void display(int n)
    {
        int count = 0;
        int i = 1;
        System.out.print(n+" số nguyên tố đầu tiên: ");
        while (count < n)
        {
            if (PrimeNumber.isPrime(i))
            {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }

    }

    public static void count(int n)
    {
        System.out.print("Các số nguyên tố nhỏ hơn "+n+ ": ");
        int i=1;
        while (i<n)
        {
            if (PrimeNumber.isPrime(i))
            {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}

