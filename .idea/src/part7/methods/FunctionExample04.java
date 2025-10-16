package part7.methods;

import java.util.Scanner;

public class FunctionExample04 {

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một số nguyên: ");
        int num = sc.nextInt();

        if (isEven(num)) {
            System.out.println(num + " là số chẵn.");
        } else {
            System.out.println(num + " là số lẻ.");
        }
    }
}
