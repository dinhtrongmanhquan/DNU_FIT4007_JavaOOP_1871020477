package part2.conditional.statements;

import java.util.Scanner;

public class Example04FindGreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số b: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Số lớn hơn là: " + a);
        } else if (b > a) {
            System.out.println("Số lớn hơn là: " + b);
        } else {
            System.out.println("Hai số bằng nhau.");
        }

        sc.close();
    }
}
