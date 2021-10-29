package com.company;

public class StringPractice
{
    public static String standardize(String name)
    {
        String name1= name.replaceAll(" +"," ").trim();
        name1=name1.toLowerCase();
        name1=name1.substring(0,1).toUpperCase()+name1.substring(1,name1.length());
        for (int i=0; i<name1.length(); i++)
        {
            if (name1.charAt(i)==' ')
            {
                name1 = name1.substring(0,i)+" "+name1.substring(i+1,i+2).toUpperCase()+name1.substring(i+2,name1.length());
            }
        }
        return name1;
    }

    public static void pallindrome(String str)
    {
        String str1="";
        for (int i=str.length()-1; i>=0; i--)
        {
            str1 = str1 + str.charAt(i);
        }
        if (str.equals(str1))
            System.out.println("Chuỗi Paliindrome");
        else System.out.println("Không phải chuỗi Pallindrome");
    }

    public static void countString(String str, char c)
    {
        int count=1;
        for (int i=0; i<str.length(); i++)
        {
            if (str.charAt(i)==' ')
            {
                count++;
            }
        }
        System.out.println("\nSố từ trong chuỗi là: "+count);

        count=0;
        String index="";
        for (int i=0; i<str.length(); i++)
        {
            if (str.charAt(i)==c)
            {
                count++;
                index=index+i+" ";
            }
        }
        System.out.println("Số ký tự "+c+" trong chuỗi là "+count+", tại index: "+index);

    }
}

