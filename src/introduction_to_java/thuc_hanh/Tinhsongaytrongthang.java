package introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Tinhsongaytrongthang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Which month that you want to cout days?");
        int month = scanner.nextInt();


        switch (month) {
            case 2:
                System.out.printf("The month '2' has or 29 day ");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("The month '" + month + "'has 31 days!'");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("The month '" + month + "' has 30 days!");
                break;
        }
    }
}
