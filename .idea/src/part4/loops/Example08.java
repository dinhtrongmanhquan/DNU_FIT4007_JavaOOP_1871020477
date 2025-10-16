package part4.loops;

import java.util.Scanner;

public class Example08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Vui lòng nhập một số nguyên dương.");
        } else {
            int temp = N;

            while (temp % 2 == 0) {
                temp /= 2;
            }

            if (temp == 1) {
                System.out.println(N + " là lũy thừa của 2.");
            } else {
                System.out.println(N + " không phải là lũy thừa của 2.");
            }
        }
    }
}
