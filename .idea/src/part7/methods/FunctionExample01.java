package part7.methods;

import java.util.Scanner;

public class FunctionExample01 {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên thứ nhất: ");
        int x = sc.nextInt();

        System.out.print("Nhập số nguyên thứ hai: ");
        int y = sc.nextInt();

        int result = sum(x, y);
        System.out.println("Tổng của " + x + " và " + y + " là: " + result);
    }
}
