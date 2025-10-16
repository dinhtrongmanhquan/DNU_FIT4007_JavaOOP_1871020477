package part1.basic.variables;

import java.util.Scanner;

public class Example06LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên N: ");
        int n = sc.nextInt();

        int chuSoCuoi = Math.abs(n % 10);

        System.out.println("Chữ số cuối cùng của " + n + " là: " + chuSoCuoi);

        sc.close();
    }
}
