package part4.loops;

import java.util.Scanner;

public class Example06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương S: ");
        int S = sc.nextInt();

        if (S <= 0) {
            System.out.println("Vui lòng nhập một số nguyên dương.");
        } else {
            int sum = 0;
            int N = 0;

            while (sum + (N + 1) <= S) {
                N++;
                sum += N;
            }

            System.out.println("Số nguyên dương N nhỏ nhất thỏa 1 + 2 + ... + N <= " + S + " là: " + N);
        }
    }
}
