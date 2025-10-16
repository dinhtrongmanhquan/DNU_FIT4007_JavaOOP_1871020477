package part6.strings;

import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        boolean isPalindrome = true;

        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("\"" + str + "\" là chuỗi đối xứng.");
        } else {
            System.out.println("\"" + str + "\" không phải là chuỗi đối xứng.");
        }
    }
}
