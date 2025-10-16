package part7.methods;

import java.util.Scanner;

public class FunctionExample15 {

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử N: ");
        int N = sc.nextInt();

        int[] arr = new int[N];
        System.out.println("Nhập " + N + " số nguyên:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int total = sumArray(arr);
        System.out.println("Tổng của mảng là: " + total);
    }
}
