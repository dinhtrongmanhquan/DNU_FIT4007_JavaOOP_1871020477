package part2.conditional.statements;

import java.util.Scanner;

public class Example02CheckIfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chiều dài: ");
        double dai = sc.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double rong = sc.nextDouble();

        if (dai == rong) {
            System.out.println("Đây là hình vuông.");
        } else {
            System.out.println("Đây là hình chữ nhật (không phải hình vuông).");
        }

        sc.close();
    }
}
