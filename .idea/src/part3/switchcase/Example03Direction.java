package part3.switchcase;

import java.util.Scanner;

public class Example03Direction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập ký tự hướng (N, S, W, E): ");
        char ch = sc.next().toUpperCase().charAt(0);

        switch (ch) {
            case 'N':
                System.out.println("Hướng Bắc");
                break;
            case 'S':
                System.out.println("Hướng Nam");
                break;
            case 'W':
                System.out.println("Hướng Tây");
                break;
            case 'E':
                System.out.println("Hướng Đông");
                break;
            default:
                System.out.println("Ký tự không hợp lệ! Vui lòng nhập một trong các ký tự: N, S, W, E.");
        }

        sc.close();
    }
}
