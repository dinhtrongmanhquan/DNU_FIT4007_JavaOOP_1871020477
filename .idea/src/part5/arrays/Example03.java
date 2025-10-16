package part5.arrays;

import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương N: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Vui lòng nhập N > 0.");
        } else {
            int[] a = new int[N];

            System.out.println("Nhập " + N + " phần tử của mảng:");
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }

            System.out.println("Mảng theo thứ tự ngược lại:");
            for (int i = N - 1; i >= 0; i--) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
