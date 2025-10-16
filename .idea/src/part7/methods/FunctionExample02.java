package part7.methods;

import java.util.Scanner;

public class FunctionExample02 {

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên thứ nhất: ");
        int x = sc.nextInt();

        System.out.print("Nhập số nguyên thứ hai: ");
        int y = sc.nextInt();

        System.out.print("Nhập số nguyên thứ ba: ");
        int z = sc.nextInt();

        int result = multiply(x, y, z);
        System.out.println("Tích của " + x + ", " + y + ", " + z + " là: " + result);
    }
}
