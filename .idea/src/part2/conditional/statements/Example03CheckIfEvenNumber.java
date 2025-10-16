package part2.conditional.statements;

import java.util.Scanner;

public class Example03CheckIfEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên N: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " là số chẵn.");
        } else {
            System.out.println(n + " là số lẻ.");
        }

        sc.close();
    }
}
