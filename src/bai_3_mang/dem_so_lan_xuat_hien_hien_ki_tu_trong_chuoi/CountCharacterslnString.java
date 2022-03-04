package bai_3_mang.dem_so_lan_xuat_hien_hien_ki_tu_trong_chuoi;

import java.util.Scanner;

public class CountCharacterslnString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String newStr = str.toLowerCase();

        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < newStr.length(); i++) {
            if (newStr.charAt(i) == c) {
                count++;
            }
        }
        System.out.print("Number of characters is: " + count);
    }
}
