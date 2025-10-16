package part7.methods;

import java.util.Scanner;

public class FunctionExample08 {

    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" là chuỗi đối xứng.");
        } else {
            System.out.println("\"" + input + "\" không phải là chuỗi đối xứng.");
        }
    }
}
