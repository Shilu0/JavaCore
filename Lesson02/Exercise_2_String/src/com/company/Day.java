package com.company;

public enum Day {

    MONDAY("Thứ Hai"),
    TUESDAY("Thứ Ba"),
    WEDNESDAY("Thứ Tư"),
    THURSDAY("Thứ Năm"),
    FRIDAY("Thứ Sáu"),
    SATURDAY("Thứ Bảy"),
    SUNDAY("Chủ Nhật");

    String value;

    Day(String day) {
        value=day;
    }

    public String getDay(){
        return value;
    }
}