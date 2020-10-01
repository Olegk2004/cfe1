package com.company;


import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        if (x >= y) {
            System.out.println("x>=y");
        } else {
            System.out.println("x<y");
        }
        System.out.println("Привет, мир, я родился и решил задачу, я молодец");
        System.out.println("Как меня назовёте?");
        String nam = scan.nextLine();
        System.out.println("Круть, теперь я " + nam);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int tmp = 0;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        System.out.println(a);
    }
        }