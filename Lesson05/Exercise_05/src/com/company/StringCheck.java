package com.company;

public class StringCheck
{
    public static void countChar(String str, char w)
    {
        int count=0;
        String countStr="";

        for (int i=0; i<= str.length()-1; i++)
        {
            if (str.charAt(i) == w)
            {
                count++;
                countStr = countStr + i +" ";
            }
        }
        if (count==0)
            System.out.println("Chuỗi không có ký tự \""+w+"\"");
        else
            System.out.println("Chuỗi có "+count+ " ký tự \""+w+"\". Tại vị trí: "+countStr);
    }

    public static int find(String strA, String strB)
    {
        int rt=-1;

        for (int i=0; i<= strA.length()-strB.length();i++)
        {
            String str=strA.substring(i,i+strB.length());
            if (str.equals(strB))
            {
                rt=0;
                System.out.println(rt+" - Chuỗi B nằm trong chuỗi A: Vị trí là "+i);
            }
        }

        if (rt==-1)
            System.out.println(rt+" - Chuỗi B không nằm trong chuỗi A");

        return rt;
    }

    public static void longestWord(String str)
    {
        String str1=str.replaceAll(" +"," ").trim();

        String maxString="";
        int j=0;
        int max=0;
        for (int i=0; i<=str1.length()-1; i++)
        {
            if (str1.charAt(i) == ' ')
            {
                if (i - j > max)
                {
                    max = i - j;
                    maxString = str1.substring(j,i);
                }
                j = i + 1;
            }
        }

        System.out.println("Chữ dài nhất có "+max+" ký tự, đó là: "+maxString);
    }
}
