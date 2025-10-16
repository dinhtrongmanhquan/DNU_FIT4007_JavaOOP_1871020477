package part4.loops;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N (1 <= N <= 9): ");
        int N = sc.nextInt();

        if (N < 1 || N > 9) {
            System.out.println("Vui lòng nhập số từ 1 đến 9.");
        } else {
            System.out.println("Bảng cửu chương của " + N + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(N + " x " + i + " = " + (N * i));
            }
        }
    }
}
