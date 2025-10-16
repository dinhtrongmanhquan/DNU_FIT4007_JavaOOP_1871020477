package part4.loops;

import java.util.Scanner;

public class Example07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        do {
            System.out.print("Nhập số nguyên dương N: ");
            N = sc.nextInt();
            if (N <= 0) {
                System.out.println("Số nhập vào không hợp lệ. Vui lòng nhập lại!");
            }
        } while (N <= 0);

        System.out.println("Bạn đã nhập số nguyên dương N = " + N);
    }
}

