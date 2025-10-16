package part2.conditional.statements;

import java.util.Scanner;

public class Example07CheckTriangleAngles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập góc a: ");
        int a = sc.nextInt();
        System.out.print("Nhập góc b: ");
        int b = sc.nextInt();
        System.out.print("Nhập góc c: ");
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0) {
            if (a + b + c == 180) {
                System.out.println("Ba góc " + a + ", " + b + ", " + c + " có thể là 3 góc của một tam giác.");
            } else {
                System.out.println("Tổng ba góc không bằng 180 → không phải tam giác.");
            }
        } else {
            System.out.println("Các góc phải là số dương!");
        }

        sc.close();
    }
}
