package bai_3_mang;

import java.util.Scanner;

public class Timgiatrilonnhattrongmang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.printf("Enter a size");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size >20);
        array = new int[size];
        int i = 0;
        while (i<array.length) {
            System.out.printf("Enter element" +(i + 1) +" : ");
            array[i] = scanner.nextInt();
            i++;
            System.out.println("property list: ");
            for (int j=0; j<array.length; j++) {
                System.out.println(array[j] + "\t");
            }
            int max = array[0];
            int index = 1;
            for (int j = 0; j<array.length; j++) {
                if (array[j] > max) {
                    index = j + 1;
                }
            }
        }
    }
}
