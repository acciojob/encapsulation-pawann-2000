package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly a = new RWOnly();
        a.setName("Hey");
        System.out.println(a.getName());
    }
}