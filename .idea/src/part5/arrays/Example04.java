package part5.arrays;

import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử N: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Vui lòng nhập N > 0.");
        } else {
            int[] arr = new int[N];
            int sum = 0;

            System.out.println("Nhập " + N + " số nguyên:");
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }

            System.out.println("Tổng các phần tử của mảng là: " + sum);
        }
    }
}
