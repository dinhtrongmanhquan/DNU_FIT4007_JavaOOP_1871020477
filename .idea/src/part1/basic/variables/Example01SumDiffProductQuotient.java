package part1.basic.variables;

import java.util.Scanner;

public class Example01SumDiffProductQuotient {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();

        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        double thuong = (double) a / b;

        System.out.println("Tổng: " + tong);
        System.out.println("Hiệu: " + hieu);
        System.out.println("Tích: " + tich);
        System.out.println("Thương: " + thuong);

        sc.close();
    }
}
