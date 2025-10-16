package part7.methods;

import java.util.Scanner;

public class FunctionExample11 {

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một số nguyên: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " là số nguyên tố.");
        } else {
            System.out.println(num + " không phải là số nguyên tố.");
        }
    }
}
