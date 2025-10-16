package part7.methods;

import java.util.Scanner;

public class FunctionExample05 {
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương N: ");
        int N = sc.nextInt();

        if (N < 0) {
            System.out.println("Vui lòng nhập N >= 0.");
        } else {
            long fact = factorial(N);
            System.out.println(N + "! = " + fact);
        }
    }
}
