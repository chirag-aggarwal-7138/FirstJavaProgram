package com.company;
import java.util.Scanner;

public class CWH_05_Taking_user_input {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter num 1");
        //int a = sc.nextInt();
        //System.out.println("Enter num 2");
        //int b = sc.nextInt();
        //int sum = a + b;
        //System.out.println("The sum of these numbers is");
        //System.out.println(sum);
        ///System.out.println("Enter anything");
        //boolean b1 = sc.hasNextInt();
        //System.out.println(b1);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println(str);


    }
}
