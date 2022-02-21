package introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Giaiphuongtrinhbacnhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");

        Scanner scanner = new Scanner(System.in);

        System.out.print("a : ");
        double a = scanner.nextDouble();

        System.out.print("b : ");
        double b = scanner.nextDouble();

        System.out.print("c :");
        double c = scanner.nextDouble();

        if (a!=0) {
            double answer = (c- b) / a;
            System.out.printf("Equation pass with x = %f1\n", answer);
        } else {
            if (b==c){
                System.out.printf("the solution is all x!");
            } else {
                System.out.printf("No solution!");
            }
        }
    }
}
