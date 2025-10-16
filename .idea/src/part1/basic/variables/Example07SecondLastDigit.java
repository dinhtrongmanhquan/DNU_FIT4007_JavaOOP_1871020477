package part1.basic.variables;

import java.util.Scanner;

public class Example07SecondLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên N (có ít nhất 2 chữ số): ");
        int n = sc.nextInt();

        n = Math.abs(n);

        int ganCuoi = (n / 10) % 10;

        System.out.println("Chữ số gần cuối của số là: " + ganCuoi);

        sc.close();
    }
}

