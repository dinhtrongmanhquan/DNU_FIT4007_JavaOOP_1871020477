package part6.strings;

import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        boolean hasDigit = false;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                hasDigit = true;
                break;
            }
        }

        if (hasDigit) {
            System.out.println("Chuỗi có chứa ít nhất một ký tự số.");
        } else {
            System.out.println("Chuỗi không chứa ký tự số nào.");
        }
    }
}
