package part5.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Example12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử N: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Vui lòng nhập N > 0.");
            return;
        }

        int[] arr = new int[N];

        // Nhập mảng
        System.out.println("Nhập " + N + " số nguyên:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Nhập chỉ số k (0 <= k < " + N + "): ");
        int k = sc.nextInt();

        if (k < 0 || k >= N) {
            System.out.println("Chỉ số k không hợp lệ.");
        } else {

            int[] newArr = new int[N - 1];
            for (int i = 0, j = 0; i < N; i++) {
                if (i != k) {
                    newArr[j++] = arr[i];
                }
            }

            System.out.println("Mảng sau khi xoá phần tử ở chỉ số " + k + ":");
            for (int i = 0; i < newArr.length; i++) {
                System.out.print(newArr[i] + " ");
            }
        }
    }
}
