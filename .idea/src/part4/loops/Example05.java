package part4.loops;

import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Vui lòng nhập một số nguyên dương.");
        } else {
            System.out.println("Các số chẵn từ 1 đến " + N + " là:");
            for (int i = 2; i <= N; i += 2) {
                System.out.println(i);
            }
        }
    }
}
