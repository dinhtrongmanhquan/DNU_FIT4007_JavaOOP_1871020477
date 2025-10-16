package part5.arrays;

import java.util.Scanner;

public class Example07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử N: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Vui lòng nhập N > 0.");
        } else {
            int[] arr = new int[N];

            // Nhập mảng
            System.out.println("Nhập " + N + " số nguyên:");
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            int max = arr[0];
            int min = arr[0];

            for (int i = 1; i < N; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }

            System.out.println("Giá trị lớn nhất trong mảng: " + max);
            System.out.println("Giá trị nhỏ nhất trong mảng: " + min);
        }
    }
}
