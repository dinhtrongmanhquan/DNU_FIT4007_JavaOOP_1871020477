package part2.conditional.statements;

import java.util.Scanner;

public class Example05CheckValidScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập điểm: ");
        double diem = sc.nextDouble();

        if (diem >= 0 && diem <= 10) {
            System.out.println("Điểm " + diem + " là điểm hợp lý.");
        } else {
            System.out.println("Điểm " + diem + " không hợp lý (phải trong khoảng 0 đến 10).");
        }

        sc.close();
    }
}
