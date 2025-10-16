package part1.basic.variables;

import java.util.Scanner;

public class Example09Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b (khác 0): ");
        int b = sc.nextInt();

        double thuong = (double) a / b;

        System.out.println(a + " / " + b + " = " + thuong);

        sc.close();
    }
}
