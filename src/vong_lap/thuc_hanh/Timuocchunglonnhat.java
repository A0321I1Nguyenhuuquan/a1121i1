package vong_lap.thuc_hanh;

import java.util.Scanner;

public class Timuocchunglonnhat {
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a : ");
        a = input.nextInt();
        System.out.printf("Enter b: ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if ( a==0 || b==0) {
            System.out.printf("No greatest common factor");
        }
        while (a != b) {
            if (a != b)
                a= a - b;
            else
                b = b - a;
        }
        System.out.printf("Greatest common factor: " + a);
    }
}
