package com.company;

import java.util.*;

public class RandomNo {
    public static void rdInt()
    {
        Random rd=new Random();
        int i= rd.nextInt();
        System.out.println("\nSố ngẫu nhiên là: "+i);
        System.out.println(((i%2==0) ? i + " là số chẵn": i+ " là số lẻ"));
    }
}
