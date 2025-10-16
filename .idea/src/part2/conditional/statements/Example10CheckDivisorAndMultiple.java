package part2.conditional.statements;

import java.util.Scanner;

public class Example10CheckDivisorAndMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();
        System.out.print("Nhập c: ");
        int c = sc.nextInt();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Vui lòng nhập các số nguyên dương!");
        } else {
            if (a % b == 0 && b % c == 0) {
                System.out.println("b đồng thời là ước của a và là bội của c.");
            } else {
                System.out.println("b KHÔNG đồng thời là ước của a và là bội của c.");
            }
        }

        sc.close();
    }
}
