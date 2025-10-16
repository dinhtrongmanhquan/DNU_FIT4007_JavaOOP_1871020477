package part7.methods;

import java.util.Scanner;

public class FunctionExample06 {

    public static int countDivisors(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương N: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Vui lòng nhập N > 0.");
        } else {
            int numDivisors = countDivisors(N);
            System.out.println("Số lượng ước của " + N + " là: " + numDivisors);
        }
    }
}
