package part2.conditional.statements;

import java.util.Scanner;

public class Example09PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương N: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương!");
        } else {

            double canBacHai = Math.sqrt(n);

            int phanNguyen = (int) canBacHai;

            if (canBacHai == phanNguyen) {
                System.out.println(n + " là số chính phương.");
            } else {
                System.out.println(n + " không phải là số chính phương.");
            }
        }

        sc.close();
    }
}
