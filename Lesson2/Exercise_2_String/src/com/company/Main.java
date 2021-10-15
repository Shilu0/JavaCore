package com.company;

public class Main {

    public static void main(String[] args)
    {
        String s="học lập trình java không khó";

        System.out.println("\nChuỗi ban đầu: "+s+"\n");

        System.out.println("Độ dài của chuỗi: "+s.length()+" ký tự \n");

        System.out.println("Chuyển viết in hoa các chữ \"k\" trong chuỗi: "+s.replace("k","K")+"\n");

        System.out.println("Thay thế chữ \"khó\" thành chữ \"dễ\": "+s.replace("khó","dễ")+"\n");

        System.out.println("Index của ký tự \"j\" trong chuỗi: "+s.indexOf("j")+"\n");

        System.out.print("Viết in hoa ký tự đầu tiên và cuối cùng của chuỗi: ");
        String s1= String.valueOf(s.charAt(0));
        String s2= String.valueOf(s.charAt(s.length()-1));
        String s3=s1.toUpperCase()+s.substring(1,s.length()-1)+s2.toUpperCase();
        System.out.println(s3);

//        Day d = Day.MONDAY;
//        System.out.println(d.getDay());
    }
}
