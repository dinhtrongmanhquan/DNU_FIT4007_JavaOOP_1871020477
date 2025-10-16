package part1.basic.variables;

import java.util.Scanner;

public class Example10NextCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một ký tự thường (a - y): ");
        char ch = sc.next().charAt(0);

        char nextCh = (char) (ch + 1);

        System.out.println("Ký tự liền sau '" + ch + "' là: '" + nextCh + "'");

        sc.close();
    }
}
