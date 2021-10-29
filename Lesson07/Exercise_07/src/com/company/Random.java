package com.company;

public class Random
{
    public static void checkPrimeRandom()
    {
        java.util.Random rd=new java.util.Random();
        int r= rd.nextInt(50);
        System.out.println("\nSố ngẫu nhiên là: "+r);
        if (PrimeNumber.isPrime(r))
            System.out.println(r+" là số nguyên tố");
        else System.out.println(r+" không phải là số nguyên tố");
    }
}
