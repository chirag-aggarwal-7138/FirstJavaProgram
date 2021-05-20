package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CWH_Ch2_Operators {
    public static void main(String[] args) {
        int a = 5;
        a += 2;
        System.out.println(a);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String str = input.nextLine();
        System.out.println("Output");
        System.out.println();
        System.out.println(str + " motii haii...!! :)");


    }
}
