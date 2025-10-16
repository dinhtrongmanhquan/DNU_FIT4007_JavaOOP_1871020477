package part2.conditional.statements;

import java.util.Scanner;

public class Example08CheckIntegerFromFloat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một số thực: ");
        double a = sc.nextDouble();

        int phanNguyen = (int) a;

        if (a == phanNguyen) {
            System.out.println(a + " là số nguyên.");
        } else {
            System.out.println(a + " không phải là số nguyên.");
        }

        sc.close();
    }
}
