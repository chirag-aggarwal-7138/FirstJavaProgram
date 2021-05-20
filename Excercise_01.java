package com.company;
import java.util.Scanner;

public class Excercise_01 {
    public static void main(String[] args) {
        System.out.println("Student percentage calculator");
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("enter your marks in english");
        float a = input.nextFloat();
        System.out.println("enter your marks in maths");
        float b = input.nextFloat();
        System.out.println("enter your marks in hindi");
        float c = input.nextFloat();
        System.out.println("enter your marks in science");
        float d = input.nextFloat();
        System.out.println("enter your marks in social science");
        float e = input.nextFloat();

        double per = (a+b+c+d+e)/5;
        System.out.println("your percentage is :");
        System.out.println(per);



    }
}
