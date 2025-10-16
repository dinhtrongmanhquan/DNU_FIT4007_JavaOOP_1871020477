package part2.conditional.statements;

import java.util.Scanner;

public class Example01CheckNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên N: ");
        int n = sc.nextInt();

        if (n >= 0) {
            System.out.println(n + " là số tự nhiên.");
        } else {
            System.out.println(n + " không phải là số tự nhiên.");
        }

        sc.close();
    }
}
