package part7.methods;

import java.util.Scanner;

public class FunctionExample09 {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương thứ nhất: ");
        int x = sc.nextInt();

        System.out.print("Nhập số nguyên dương thứ hai: ");
        int y = sc.nextInt();

        if (x <= 0 || y <= 0) {
            System.out.println("Vui lòng nhập các số nguyên dương.");
        } else {
            int result = gcd(x, y);
            System.out.println("Ước chung lớn nhất của " + x + " và " + y + " là: " + result);
        }
    }
}
