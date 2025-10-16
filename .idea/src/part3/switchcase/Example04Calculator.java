package part3.switchcase;

import java.util.Scanner;

public class Example04Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();

        System.out.print("Nhập phép tính (+, -, *, /, %): ");
        char phepTinh = sc.next().charAt(0);

        switch (phepTinh) {
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                if (b != 0)
                    System.out.println(a + " / " + b + " = " + ((double) a / b));
                else
                    System.out.println("Lỗi: không thể chia cho 0!");
                break;
            case '%':
                if (b != 0)
                    System.out.println(a + " % " + b + " = " + (a % b));
                else
                    System.out.println("Lỗi: không thể chia cho 0!");
                break;
            default:
                System.out.println("Phép tính không hợp lệ! Vui lòng nhập một trong +, -, *, /, %.");
        }

        sc.close();
    }
}
