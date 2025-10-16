package part5.arrays;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử N: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Vui lòng nhập N > 0.");
        } else {
            int[] arr = new int[N];
            boolean found = false;

            System.out.println("Nhập " + N + " số nguyên:");
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Các số chia hết cho 5 trong mảng:");
            for (int i = 0; i < N; i++) {
                if (arr[i] % 5 == 0) {
                    System.out.print(arr[i] + " ");
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Không tồn tại phần tử nào chia hết cho 5");
            }
        }
    }
}
