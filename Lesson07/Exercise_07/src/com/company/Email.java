package com.company;

public class Email
{
    public static void validateEmail(String email)
    {
        if (email.matches("[\\w.]{1,}[@]{1}\\w{1,}[.]{1}[\\w.-]{1,}"))
            System.out.println("Email hợp lệ");
        else
            System.out.println("Email không hợp lệ");
    }
}
