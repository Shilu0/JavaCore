package com.Shiluo_Company;

import java.util.Scanner;

public class Vehicles {
    String id;
    String name;
    double maxSpeed;

    Vehicles(String vId, String vName, double vMaxSpeed)
    {
        id=vId;
        name=vName;
        maxSpeed=vMaxSpeed;
    }

    public static void inputVehicle(Vehicles arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập thông tin các phương tiện");
        for (int i=0; i<arr.length; i++)
        {
            System.out.println("Thông tin phương tiện thứ "+(i+1));
            System.out.print("Mã số phương tiện: ");
            String id=sc.nextLine();
            System.out.print("Tên phương tiện: ");
            String name=sc.nextLine();
            System.out.print("Tốc độ tối đa của phương tiện: ");
            int maxSpeed=sc.nextInt();
            sc.nextLine();
            arr[i]=new Vehicles(id,name,maxSpeed);
        }
    }

    public String toString()
    {
        return "\nMã phương tiện: "+id+"\nTên phương tiện: "+name+"\nVận tốc tối đa: "+maxSpeed+" km/h";
    }
}
